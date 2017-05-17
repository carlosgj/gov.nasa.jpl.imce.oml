/*
 * Copyright 2017 California Institute of Technology ("Caltech").
 * U.S. Government sponsorship acknowledged.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * License Terms
 */
package gov.nasa.jpl.imce.oml.dsl.ui.converter

import gov.nasa.jpl.imce.oml.model.bundles.Bundle
import org.eclipse.emf.ecore.xcore.ui.EmptyXcoreProjectWizard
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.core.runtime.IPath
import org.eclipse.ui.IWorkbench
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.CoreException
import java.io.UnsupportedEncodingException
import java.io.IOException

class LiftOMLBundle2XcoreMetamodelWizard extends EmptyXcoreProjectWizard {
	protected IStructuredSelection sselection
	protected LiftOMLBundle2XcoreMetamodelWizardPage page1
	protected LiftOMLBundle2DSMLPluginsWizardPage page2
	
	protected Bundle omlBundle

	new(IWorkbench wb, IStructuredSelection sselection, Bundle omlBundle) {
		this.sselection = sselection
		this.omlBundle = omlBundle
		
		init(wb, sselection)
		
		setWindowTitle("New Lift OML Bundle 2 Xcore Metamodel Wizard")
	}

	override void addPages() {
		val iri = omlBundle.iri()
		val index1 = iri.indexOf("://")
		val pname = iri.substring(index1+3)
		val index2 = pname.indexOf("/")
		val domain = if (index2 > 0) pname.substring(0, index2) else pname
		val qprefix = domain.split("\\.").reverse.join(".")
		val qsuffix = if (index2 > 0) pname.substring(index2) else ""
		val qname = (qprefix + qsuffix).replaceAll("[/-]",".")
				
		page1 = new LiftOMLBundle2XcoreMetamodelWizardPage(qname, omlBundle)
		addPage(page1)
		page2 = new LiftOMLBundle2DSMLPluginsWizardPage()
		addPage(page2)
		newProjectCreationPage = new LiftOMLBundle2NewXcoreProjectWizardPage(qname, this)
		addPage(newProjectCreationPage)
	}

	def void setGenModelProjectLocation(IPath location) {
		this.genModelProjectLocation = location	
	}
	
	def void setGenModelContainerPath(IPath path) {
		this.genModelContainerPath = path	
	}
	
	def void updateDsmlPluginNames() {
		var String qname = page1.getDSLQualifiedName()
		if(qname.endsWith(".ecore")) qname = qname.substring(0, qname.length() - 6)
		page2.setDsmlEcorePluginName('''«qname».ecore''')
		page2.setDsmlEditPluginName('''«qname».edit''')
		page2.setDsmlUIPluginName('''«qname».ui''')
		page2.setPageComplete(true)
	}
	
	override modifyWorkspace(IProgressMonitor progressMonitor) throws CoreException, UnsupportedEncodingException, IOException {
		super.modifyWorkspace(progressMonitor)
	}

	override boolean performFinish() {
		super.performFinish()
	}

	def LiftOMLBundle2XcoreMetamodelWizardPage getLiftOMLBundle2XcoreMetamodelWizardPage() {
		return page1
	}

	def LiftOMLBundle2DSMLPluginsWizardPage getLiftOMLBundle2DSMLPluginsWizardPage() {
		return page2
	}
	
	def LiftOMLBundle2NewXcoreProjectWizardPage getLiftOMLBundle2NewXcoreProjectWizardPage() {
		return newProjectCreationPage as LiftOMLBundle2NewXcoreProjectWizardPage
	}

	override protected String[] getRequiredBundles() {
		#[
			"org.eclipse.core.runtime",
			"org.eclipse.emf.ecore",
			"org.eclipse.emf.codegen.ecore",
			"org.eclipse.emf.cdo",
			"org.eclipse.xtext.xbase.lib",
			"org.eclipse.emf.ecore.xcore",
			"org.eclipse.emf.ecore.xcore.lib",
			"gov.nasa.jpl.imce.oml.runtime"
		]
	}

}
