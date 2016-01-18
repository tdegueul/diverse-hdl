package fr.inria.diverse.hdl.formatting2;

import fr.inria.diverse.hdl.hipsterDomainLanguage.Domain
import fr.inria.diverse.hdl.hipsterDomainLanguage.Entity
import fr.inria.diverse.hdl.hipsterDomainLanguage.Enum
import fr.inria.diverse.hdl.hipsterDomainLanguage.Field
import fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage
import fr.inria.diverse.hdl.hipsterDomainLanguage.Relation
import fr.inria.diverse.hdl.hipsterDomainLanguage.ValidationRule
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument

class HipsterDomainLanguageFormatter extends AbstractFormatter2
{
	def dispatch void format(Domain domain, extension IFormattableDocument document) {
		domain.elements.forEach[format(document)]
	}

	def dispatch void format(Entity e, extension IFormattableDocument document) {
		e.regionForKeyword("{").append[newLine; increaseIndentation]
		e.fields.forEach[format(document)]
		e.regionForKeyword("}").prepend[decreaseIndentation].append[newLine]
	}

	def dispatch void format(Enum e, extension IFormattableDocument document) {
		e.regionForKeyword("{").append[newLine; increaseIndentation]
		e.regionsForKeywords(",").forEach[prepend[noSpace].append[noSpace; newLine]]
		e.regionForKeyword("}").prepend[newLine; decreaseIndentation].append[newLine]
	}

	def dispatch void format(Relation r, extension IFormattableDocument document) {
		r.regionForKeyword('{').append[newLine; increaseIndentation]
		r.regionForFeature(HipsterDomainLanguagePackage.Literals::RELATION__TO).append[oneSpace]
		r.regionsForKeywords("[").forEach[prepend[noSpace].append[noSpace]]
		r.regionsForKeywords("]").forEach[prepend[noSpace].append[oneSpace]]
		r.regionForKeyword("}").prepend[newLine; decreaseIndentation].append[newLine]
	}

	def dispatch void format(Field f, extension IFormattableDocument document) {
		f.validationRules.forEach[format(document)]
		f.append[newLine]
	}

	def dispatch void format(ValidationRule r, extension IFormattableDocument document) {
		r.regionsForKeywords("(").forEach[prepend[noSpace].append[noSpace]]
		r.regionsForKeywords(")").forEach[prepend[noSpace].append[oneSpace]]
	}
}
