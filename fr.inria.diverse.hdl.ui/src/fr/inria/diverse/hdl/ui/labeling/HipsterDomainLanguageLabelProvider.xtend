package fr.inria.diverse.hdl.ui.labeling

import com.google.inject.Inject
import fr.inria.diverse.hdl.hipsterDomainLanguage.Relation
import fr.inria.diverse.hdl.hipsterDomainLanguage.RelationType
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider

class HipsterDomainLanguageLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate)
	}

	def String text(Relation it) {
		return
			'''«from.name»(«fromRelation») '''
		  + '''«type.formatRelationCardinalities» '''
		  + '''«to.name»(«toRelation»)'''
	}

	def String image(Relation r) {
		return 'relation.png'
	}

	private def String formatRelationCardinalities(RelationType t) {
		return
			switch t {
				case ONE_TO_MANY:  '[1..*]'
				case MANY_TO_ONE:  '[*..1]'
				case ONE_TO_ONE:   '[1..1]'
				case MANY_TO_MANY: '[*..*]'
			}
	}
}
