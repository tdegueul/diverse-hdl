package fr.inria.diverse.hdl.refactoring

import fr.inria.diverse.hdl.hipsterDomainLanguage.Domain
import fr.inria.diverse.hdl.hipsterDomainLanguage.DomainElement
import fr.inria.diverse.hdl.hipsterDomainLanguage.Entity
import fr.inria.diverse.hdl.hipsterDomainLanguage.Enum

class DomainMerging
{
	def dispatch void merge(Domain d1, Domain d2) {
		d2.elements.forEach[e2 |
			switch e2 {
				Entity: {
					val e1 = d1.elements.filter(Entity).findFirst[name == e2.name]
					if (e1 === null)
						d1.copy(e2)
					else
						e1.merge(e2)
				}
				Enum: {
					val e1 = d1.elements.filter(Enum).findFirst[name == e2.name]
					if (e1 === null)
						d1.copy(e2)
					else
						e1.merge(e2)
				}
			}
		]
	}

	def dispatch void merge(Entity e1, Entity e2) {
		e2.fields.forEach[f2 |
			if (!e1.fields.exists[name == f2.name])
				e1.fields += f2
		]
	}

	def dispatch void merge(Enum e1, Enum e2) {
		e2.literals.forEach[l2 |
			if (!e1.literals.exists[it == e2])
				e1.literals += l2
		]
	}

	private def void copy(Domain d, DomainElement e) {
		d.elements += e
	}
}
