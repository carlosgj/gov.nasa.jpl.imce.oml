# OML Viewpoints
  
### View Descriptions

Note: the OML viewpoints are defined in [description/OML.odesign](description/OML.odesign)

The OML Viewpoints are graphical modeling workbenches developed using the [Sirius Eclipse Project](http://www.eclipse.org/sirius/doc/).  The views available are as follows:

| View Name | Type |Description |
|----------|-------|-----------|
| Terminology Diagram | Diagram | Displays all of the *Entities* and *Axiom*s in a *TerminologyGraph* |
| Terminology Relationships | Table| Displays all of the *EntitiyRelationship*s and and its properties from this *TerminologyGraph* in a tablular format |
| Terminology Aspects | Table | Displays all of the *Aspects* and which *Entites* have said *Entities* as a *Specialization* |
| Terminology Properties | Table | Displays all of the *Data Properties* in this *Terminology Graph* |
| Terminology Concepts | Table | Displays all of the *Concepts* and which *Concepts* have said *Concept* as a *Specialization* in a tabular format |
| Sub Hierarchy | Tree | Displays all of the *Concepts* and *Aspects* in a tree format |
| Concept Usage Diagram | Diagram | Displays all of the *Concepts* that have the root *Concept* as its domain or range (directly or indirectly) |
| Aspect/Concept Class Diagram | Diagram | Displays all *Aspects/Concepts* that have the root *Aspect/Concept* as its domain or range (relationships) or its parent (*Specializations*)|
| Reified Relationship Diagram | Diagram | Displays a *ReifiedRelationship* and its domain and range|

The views *Aspect/Concept Class Diagram* and *Sub Heiarchy* are incomplete

### Usage

- Launch a runtime eclipse using the [OML WB launch configuration](/gov.nasa.jpl.imce.oml.tycho/launchers/OML WB.launch)
- Open the Eclipse Modeling perspective
- For a project that contains *.oml files, use the project context menu: "Configure > Convert to Modeling Project"
- Afterwards, the context menu on a project with *.oml files should have additional menus: 
  - Viewpoint Selection
- Editing the [OML.odesign](/gov.nasa.jpl.imce.oml.viewpoint/description/OML.odesign) is particularly useful for several reasons:
    - Make adjustments to the OML viewpoint notation for the Sirius nodes, containers, or edges
    - Add/Edit nodes, containers, edges and aql queries
    - Add new views (diagram, table, etc.)
    - When changing the  [query methods](gov.nasa.jpl.imce.oml.viewpoint) you must shutdown the runtime and restart it in order to see the changes.  The query methods must be changed outside of the runtime or the changes will not be saved.
- Queries can be made directly on model elements the Interpreter view (Acceleo Model to Text -> Interpreter).  Acceleo queries may be performed on model elements.  Documentation [here](https://wiki.eclipse.org/Acceleo/Interpreter#Expression) and [here](https://www.eclipse.org/sirius/doc/specifier/general/Writing_Queries.html#acceleo)

### Issues
The 'version' attribute in the 'description:Group' tag of the [OML.odesign](/gov.nasa.jpl.imce.oml.viewpoint/description/OML.odesign) must be 11.1.1.201610211630.  
When saving, this may be automatically updated to a higher version, resulting in an error similar to this:

```
java.lang.RuntimeException: The modeling project "gov.nasa.jpl.imce.caesar.demo.ontologies" is invalid: Problem during loading models: The viewpoint specification model (platform:/plugin/gov.nasa.jpl.imce.oml.viewpoint/description/OML.odesign) can not be loaded because it comes from a more recent Sirius release.
VSM version is: 12.0.0.2017041100
Last Sirius migration version is: 11.1.1.201610211630
	at org.eclipse.sirius.ui.tools.internal.views.common.modelingproject.OpenRepresentationsFileJob.runInWorkspace(OpenRepresentationsFileJob.java:136)
	at org.eclipse.core.internal.resources.InternalWorkspaceJob.run(InternalWorkspaceJob.java:39)
	at org.eclipse.core.internal.jobs.Worker.run(Worker.java:55)
Caused by: org.eclipse.sirius.business.api.migration.DescriptionResourceVersionMismatchException: The viewpoint specification model (platform:/plugin/gov.nasa.jpl.imce.oml.viewpoint/description/OML.odesign) can not be loaded because it comes from a more recent Sirius release.
VSM version is: 12.0.0.2017041100
Last Sirius migration version is: 11.1.1.201610211630
	at org.eclipse.sirius.business.internal.session.danalysis.DAnalysisSessionImpl.checkResourceErrors(DAnalysisSessionImpl.java:1225)
	at org.eclipse.sirius.business.internal.session.danalysis.DAnalysisSessionImpl.open(DAnalysisSessionImpl.java:1191)
	at org.eclipse.sirius.business.internal.session.SessionManagerImpl.openSession(SessionManagerImpl.java:390)
	at org.eclipse.sirius.ui.tools.internal.views.common.modelingproject.OpenRepresentationsFileJob.performOpenSession(OpenRepresentationsFileJob.java:157)
	at org.eclipse.sirius.ui.tools.internal.views.common.modelingproject.OpenRepresentationsFileJob.runInWorkspace(OpenRepresentationsFileJob.java:126)
	... 2 more
```
If this happens, open [OML.odesign](/gov.nasa.jpl.imce.oml.viewpoint/description/OML.odesign) in a text editor and change the 'version' attribute of the 'description:Group' tag back to 11.1.1.201610211630

- All queries for 'Terminology Diagram', 'Aspect/Concept Diagram' and 'ConceptUsageDiagram' are defined in service methods in the gov.nasa.jpl.imce.oml.viewpoint package.