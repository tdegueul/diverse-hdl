package fr.inria.diverse.hdl.ui.handlers

import com.google.inject.Inject
import fr.inria.diverse.hdl.hipsterDomainLanguage.Domain
import fr.inria.diverse.hdl.refactoring.DomainMerger
import java.util.Collections
import org.eclipse.core.commands.AbstractHandler
import org.eclipse.core.commands.ExecutionEvent
import org.eclipse.core.commands.ExecutionException
import org.eclipse.core.resources.IResource
import org.eclipse.emf.common.util.URI
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.ui.handlers.HandlerUtil
import org.eclipse.xtext.ui.resource.XtextResourceSetProvider

class MergeDomainsHandler extends AbstractHandler
{
	@Inject XtextResourceSetProvider rsProvider
	@Inject DomainMerger merger

	override execute(ExecutionEvent event) throws ExecutionException {
		try {
			val sel = HandlerUtil::getActiveMenuSelection(event) as IStructuredSelection
			if (sel.size == 2) {
				val resList = sel.toList.filter(IResource)
				val res1 = resList.get(0)
				val res2 = resList.get(1)
				val project = res1.project
				val rs = rsProvider.get(project)
				val p1 = res1.fullPath.toString
				val p2 = res2.fullPath.toString
				val emfRes1 = rs.getResource(
					URI::createPlatformResourceURI(p1, true), true)
				val emfRes2 = rs.getResource(
					URI::createPlatformResourceURI(p2, true), true)
				val domain1 = emfRes1.contents.head as Domain
				val domain2 = emfRes2.contents.head as Domain
				val newDomain = merger.merge(domain1, domain2)
				val newURI = p1.substring(0, p1.lastIndexOf("/"))
				             + "/Merged.hdl"
				val newRes = rs.createResource(
					URI::createPlatformResourceURI(newURI, true))
				newRes.contents += newDomain 
				newRes.save(Collections::EMPTY_MAP)
			}
		} catch (Exception e) {
			// hey! I don't care!
			e.printStackTrace
		}

		return null
	}
}
