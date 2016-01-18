package fr.inria.diverse.hdl.validation

import fr.inria.diverse.hdl.hipsterDomainLanguage.Entity
import fr.inria.diverse.hdl.hipsterDomainLanguage.Field
import fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage
import org.eclipse.xtext.validation.Check

class HipsterDomainLanguageValidator extends AbstractHipsterDomainLanguageValidator
{
	static final String ENTITY_UPPERCASE = "ENTITY_UPPERCASE"
	static final String FIELDS_DUPLICATE = "FIELDS_DUPLICATE"
 
	@Check
	def void checkEntityStartsWithUpperCase(Entity e) {
		if (!Character::isUpperCase(e.name.charAt(0)))
			warning(
				'Entity name must start with an uppercase',
				HipsterDomainLanguagePackage.Literals::ENTITY__NAME,
				ENTITY_UPPERCASE
			)
	}

	@Check
	def void checkFieldsAreUnique(Field f) {
		val containingEntity = f.eContainer as Entity

		if (containingEntity.fields.exists[otherField |
			   f != otherField
			&& f.name == otherField.name
		])
			error(
				'Field names must be unique',
				HipsterDomainLanguagePackage.Literals::FIELD__NAME,
				FIELDS_DUPLICATE
			)
	}
}
