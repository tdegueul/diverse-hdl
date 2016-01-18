package fr.inria.diverse.hdl.ui.labeling

import com.google.inject.Inject
import fr.inria.diverse.hdl.hipsterDomainLanguage.Domain
import fr.inria.diverse.hdl.hipsterDomainLanguage.Entity
import fr.inria.diverse.hdl.hipsterDomainLanguage.Enum
import fr.inria.diverse.hdl.hipsterDomainLanguage.EnumTypeReference
import fr.inria.diverse.hdl.hipsterDomainLanguage.Field
import fr.inria.diverse.hdl.hipsterDomainLanguage.PrimitiveTypeReference
import fr.inria.diverse.hdl.hipsterDomainLanguage.Relation
import fr.inria.diverse.hdl.hipsterDomainLanguage.RelationType
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider

class HipsterDomainLanguageLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate)
	}

	def String image(Domain it) {
		return 'hdl.png'
	}

	def String image(Entity it) {
		return 'entity.png'
	}

	def String text(Field it) {
		return
			'''«name» : «type.formatFieldType»'''
		  + '''«IF required» [R]«ENDIF»'''
	}

	def String image(Field it) {
		return 'field.png'
	}

	def String text(Relation it) {
		return
			'''«from.name»(«fromRelationName») '''
		  + '''«type.formatRelationCardinalities» '''
		  + '''«to.name»(«toRelationName»)'''
	}

	def String image(Relation it) {
		return 'relation.png'
	}

	def String image(Enum it) {
		return 'enum.png'
	}

	private dispatch def String formatFieldType(EnumTypeReference it) {
		return type.name
	}

	private dispatch def String formatFieldType(PrimitiveTypeReference it) {
		return type.literal
	}

	private def String formatRelationCardinalities(RelationType it) {
		return
			switch it {
				case ONE_TO_MANY:  '[1..*]'
				case MANY_TO_ONE:  '[*..1]'
				case ONE_TO_ONE:   '[1..1]'
				case MANY_TO_MANY: '[*..*]'
			}
	}
}
