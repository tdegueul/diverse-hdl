package fr.inria.diverse.hdl.validation

import fr.inria.diverse.hdl.hipsterDomainLanguage.Entity
import fr.inria.diverse.hdl.hipsterDomainLanguage.Field
import fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage
import fr.inria.diverse.hdl.hipsterDomainLanguage.Pattern
import java.util.regex.PatternSyntaxException
import org.eclipse.xtext.validation.Check

class HipsterDomainLanguageValidator extends AbstractHipsterDomainLanguageValidator
{
	static final String ENTITY_UPPERCASE = "ENTITY_UPPERCASE"
	static final String FIELDS_DUPLICATE = "FIELDS_DUPLICATE"
	static final String REGEX_INVALID    = "REGEX_INVALID"
 
	@Check
	def void checkEntityStartsWithUpperCase(Entity it) {
		if (!Character::isUpperCase(name.charAt(0)))
			warning(
				'Entity name must start with an uppercase',
				HipsterDomainLanguagePackage.Literals::ENTITY__NAME,
				ENTITY_UPPERCASE
			)
	}

	@Check
	def void checkFieldsAreUnique(Field it) {
		val containingEntity = eContainer as Entity

		if (containingEntity.fields.exists[otherField |
			   it != otherField
			&& name == otherField.name
		])
			error(
				'Field names must be unique',
				HipsterDomainLanguagePackage.Literals::FIELD__NAME,
				FIELDS_DUPLICATE
			)
	}

	@Check
	def void checkPatternIsValid(Pattern it) {
		try {
			java.util.regex.Pattern::compile(regex)
		} catch (PatternSyntaxException e) {
			error(
				'''Invalid regex: «e.description»''',
				HipsterDomainLanguagePackage.Literals::PATTERN__REGEX,
				REGEX_INVALID
			)
		}
	}
}
