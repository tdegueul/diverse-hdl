package fr.inria.diverse.hdl.refactoring

import fr.inria.diverse.hdl.hipsterDomainLanguage.Domain
import fr.inria.diverse.hdl.hipsterDomainLanguage.Entity
import fr.inria.diverse.hdl.hipsterDomainLanguage.Enum
import fr.inria.diverse.hdl.hipsterDomainLanguage.EnumTypeReference
import fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguageFactory
import fr.inria.diverse.hdl.hipsterDomainLanguage.MaxSpecification
import fr.inria.diverse.hdl.hipsterDomainLanguage.MinSpecification
import fr.inria.diverse.hdl.hipsterDomainLanguage.Pattern
import fr.inria.diverse.hdl.hipsterDomainLanguage.PrimitiveTypeReference
import fr.inria.diverse.hdl.hipsterDomainLanguage.Relation

class DomainMerger
{
	def Domain merge(Domain d1, Domain d2) {
		return
			HipsterDomainLanguageFactory::eINSTANCE.createDomain => [
				copyDomainElements(d1)
				copyDomainElements(d2)
				copyDomainRelations(d1)
				copyDomainRelations(d2)
			] 
	}

	private def void copyDomainElements(Domain d1, Domain d2) {
		val fact = HipsterDomainLanguageFactory::eINSTANCE

		d2.elements.forEach[e |
			switch e {
				Entity:
					if (!d1.elements.filter(Entity).exists[name == e.name])
						d1.elements += fact.createEntity => [name = e.name]
				Enum:
					if (!d1.elements.filter(Enum).exists[name == e.name])
						d1.elements += fact.createEnum => [name = e.name]
			}
		]
	}

	private def void copyDomainRelations(Domain d1, Domain d2) {
		val fact = HipsterDomainLanguageFactory::eINSTANCE

		d2.elements.forEach[e |
			switch e {
				Entity:
					d1.elements.filter(Entity).findFirst[name == e.name] => [ee |
						ee.fields += e.fields.filter[f | !ee.fields.exists[name == f.name]].map[f |
							fact.createField => [
								name = f.name
								required = f.required
								val fType = f.type
								type = switch fType {
									PrimitiveTypeReference:
										fact.createPrimitiveTypeReference => [type = fType.type]
									EnumTypeReference:
										fact.createEnumTypeReference => [
											type = d1.elements.filter(Enum).findFirst[name == fType.type.name]
										]
								}
								validationRules += f.validationRules.map[r |
									switch r {
										Pattern: fact.createPattern => [regex = r.regex]
										MinSpecification: fact.createMinSpecification => [min = r.min]
										MaxSpecification: fact.createMaxSpecification => [max = r.max]
									}
								]
							]
						]
					]
				Enum:
					d1.elements.filter(Enum).findFirst[name == e.name] => [ee |
						ee.literals += e.literals.filter[l | !ee.literals.exists[it == l]]
					]
				Relation:
					d1.elements += fact.createRelation => [
						from = d1.elements.filter(Entity).findFirst[name == e.from.name]
						to = d1.elements.filter(Entity).findFirst[name == e.to.name]
						type = e.type
						fromRelationName = e.fromRelationName
						toRelationName = e.toRelationName
					]
			}
		]
	}
}
