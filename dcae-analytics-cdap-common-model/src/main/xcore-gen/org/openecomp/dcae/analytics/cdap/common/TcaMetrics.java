
/*-
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 */
	
/**
 */
package org.openecomp.dcae.analytics.cdap.common;

import org.openecomp.dcae.controller.core.service.DcaePolicyEntity;
import org.openecomp.ncomp.core.NamedEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tca Metrics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaMetrics#getFunctionalRole <em>Functional Role</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaMetrics#getThresholds <em>Thresholds</em>}</li>
 * </ul>
 *
 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaMetrics()
 * @model annotation="http://openecomp.org/policy policyTemplate='dcae-microservice' dcaeService='tca'"
 *        annotation="http://openecomp.org type='configuration'"
 * @generated
 */
public interface TcaMetrics extends NamedEntity, DcaePolicyEntity {
	/**
	 * Returns the value of the '<em><b>Functional Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functional Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Role</em>' attribute.
	 * @see #setFunctionalRole(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaMetrics_FunctionalRole()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:${path}.policy.functionalRole'"
	 * @generated
	 */
	String getFunctionalRole();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaMetrics#getFunctionalRole <em>Functional Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Role</em>' attribute.
	 * @see #getFunctionalRole()
	 * @generated
	 */
	void setFunctionalRole(String value);

	/**
	 * Returns the value of the '<em><b>Thresholds</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.analytics.cdap.common.TcaThreshold}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thresholds</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thresholds</em>' containment reference list.
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaMetrics_Thresholds()
	 * @model containment="true"
	 *        annotation="http://openecomp.org type='configuration'"
	 * @generated
	 */
	EList<TcaThreshold> getThresholds();

} // TcaMetrics
