/**
 * Copyright 2017 California Institute of Technology (\"Caltech\").
 * U.S. Government sponsorship acknowledged.
 * 
 * Licensed under the Apache License, Version 2.0 (the \"License\");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an \"AS IS\" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gov.nasa.jpl.imce.oml.dsl.tests;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import gov.nasa.jpl.imce.oml.dsl.tests.OMLInjectorProvider;
import gov.nasa.jpl.imce.oml.model.common.AnnotationProperty;
import gov.nasa.jpl.imce.oml.model.common.AnnotationPropertyValue;
import gov.nasa.jpl.imce.oml.model.common.Extent;
import gov.nasa.jpl.imce.oml.model.common.LogicalElement;
import gov.nasa.jpl.imce.oml.model.terminologies.Concept;
import gov.nasa.jpl.imce.oml.model.terminologies.TerminologyBox;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(OMLInjectorProvider.class)
@SuppressWarnings("all")
public class OMLAnnotationTest1b {
  @Inject
  private ParseHelper<Extent> parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void test() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("annotationProperty rdfs:label=<http://www.w3.org/2000/01/rdf-schema#label>");
      _builder.newLine();
      _builder.newLine();
      _builder.append("open terminology <http://imce.jpl.nasa.gov/foundation/mission/mission>");
      _builder.newLine();
      _builder.append("{\t");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("@rdfs:label = \"\"\"Performing Element");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("This is a long description...");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("</foo>");
      _builder.newLine();
      _builder.append("    ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("\"string\"");
      _builder.newLine();
      _builder.append("     ");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("\"\"\"");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("concept PerformingElement");
      _builder.newLine();
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final String input = _builder.toString();
      final Extent result = this.parseHelper.parse(input);
      Assert.assertNotNull(result);
      this._validationTestHelper.assertNoErrors(result);
      final Resource r = result.eResource();
      EcoreUtil.resolveAll(r);
      final AnnotationProperty ap = IterableExtensions.<AnnotationProperty>head(result.getAnnotationProperties());
      final TerminologyBox tbox = IterableExtensions.<TerminologyBox>head(Iterables.<TerminologyBox>filter(result.getModules(), TerminologyBox.class));
      Assert.assertEquals(tbox.nsPrefix(), "mission");
      final Concept c = IterableExtensions.<Concept>head(Iterables.<Concept>filter(tbox.getBoxStatements(), Concept.class));
      Assert.assertEquals(c.name(), "PerformingElement");
      final AnnotationPropertyValue a = IterableExtensions.<AnnotationPropertyValue>head(c.getAnnotations());
      final AnnotationProperty a_prop = a.getProperty();
      final LogicalElement a_subj = a.getSubject();
      final String a_value = a.getValue().stringValue().value;
      Assert.assertTrue(a_value.contains("Performing Element"));
      Assert.assertTrue(a_value.contains("</foo>"));
      Assert.assertTrue(a_value.contains("\"string\""));
      Assert.assertSame(ap, a_prop);
      Assert.assertSame(c, a_subj);
      String _name = this.getClass().getName();
      String _plus = (_name + " OK!");
      System.out.println(_plus);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
