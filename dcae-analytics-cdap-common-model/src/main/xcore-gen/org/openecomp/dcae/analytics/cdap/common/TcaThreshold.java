
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

import org.openecomp.ncomp.core.NamedEntity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tca Threshold</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaThreshold#getClosedLoopControlName <em>Closed Loop Control Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaThreshold#getVersion <em>Version</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaThreshold#getFieldPath <em>Field Path</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaThreshold#getThresholdValue <em>Threshold Value</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaThreshold#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaThreshold#getSeverity <em>Severity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaThreshold()
 * @model annotation="http://openecomp.org type='configuration'"
 * @generated
 */
public interface TcaThreshold extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Closed Loop Control Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closed Loop Control Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closed Loop Control Name</em>' attribute.
	 * @see #setClosedLoopControlName(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaThreshold_ClosedLoopControlName()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:${path}.policy.closedLoopControlName'"
	 * @generated
	 */
	String getClosedLoopControlName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaThreshold#getClosedLoopControlName <em>Closed Loop Control Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closed Loop Control Name</em>' attribute.
	 * @see #getClosedLoopControlName()
	 * @generated
	 */
	void setClosedLoopControlName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaThreshold_Version()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:${path}.policy.version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaThreshold#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Field Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Path</em>' attribute.
	 * @see #setFieldPath(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaThreshold_FieldPath()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:${path}.policy.fieldPath'"
	 * @generated
	 */
	String getFieldPath();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaThreshold#getFieldPath <em>Field Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Field Path</em>' attribute.
	 * @see #getFieldPath()
	 * @generated
	 */
	void setFieldPath(String value);

	/**
	 * Returns the value of the '<em><b>Threshold Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threshold Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threshold Value</em>' attribute.
	 * @see #setThresholdValue(Integer)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaThreshold_ThresholdValue()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:${path}.policy.thresholdValue'"
	 * @generated
	 */
	Integer getThresholdValue();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaThreshold#getThresholdValue <em>Threshold Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threshold Value</em>' attribute.
	 * @see #getThresholdValue()
	 * @generated
	 */
	void setThresholdValue(Integer value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see #setDirection(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaThreshold_Direction()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:${path}.policy.direction'"
	 * @generated
	 */
	String getDirection();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaThreshold#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Severity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see #setSeverity(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaThreshold_Severity()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:${path}.policy.severity'"
	 * @generated
	 */
	String getSeverity();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaThreshold#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(String value);

} // TcaThreshold
