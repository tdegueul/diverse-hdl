/*
 * generated by Xtext
 */
package fr.inria.diverse.hdl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractHipsterDomainLanguageValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(fr.inria.diverse.hdl.hipsterDomainLanguage.HipsterDomainLanguagePackage.eINSTANCE);
		return result;
	}
}