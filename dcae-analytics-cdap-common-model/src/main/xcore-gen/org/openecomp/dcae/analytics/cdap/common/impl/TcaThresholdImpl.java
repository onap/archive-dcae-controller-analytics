
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
package org.openecomp.dcae.analytics.cdap.common.impl;

import org.openecomp.dcae.analytics.cdap.common.CommonPackage;
import org.openecomp.dcae.analytics.cdap.common.TcaThreshold;
import org.openecomp.ncomp.core.impl.NamedEntityImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tca Threshold</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaThresholdImpl#getClosedLoopControlName <em>Closed Loop Control Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaThresholdImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaThresholdImpl#getFieldPath <em>Field Path</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaThresholdImpl#getThresholdValue <em>Threshold Value</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaThresholdImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaThresholdImpl#getSeverity <em>Severity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TcaThresholdImpl extends NamedEntityImpl implements TcaThreshold {
	/**
	 * The default value of the '{@link #getClosedLoopControlName() <em>Closed Loop Control Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosedLoopControlName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLOSED_LOOP_CONTROL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClosedLoopControlName() <em>Closed Loop Control Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosedLoopControlName()
	 * @generated
	 * @ordered
	 */
	protected String closedLoopControlName = CLOSED_LOOP_CONTROL_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFieldPath() <em>Field Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldPath()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFieldPath() <em>Field Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldPath()
	 * @generated
	 * @ordered
	 */
	protected String fieldPath = FIELD_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getThresholdValue() <em>Threshold Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdValue()
	 * @generated
	 * @ordered
	 */
	protected static final Integer THRESHOLD_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getThresholdValue() <em>Threshold Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholdValue()
	 * @generated
	 * @ordered
	 */
	protected Integer thresholdValue = THRESHOLD_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected String direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected static final String SEVERITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected String severity = SEVERITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TcaThresholdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.TCA_THRESHOLD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClosedLoopControlName() {
		return closedLoopControlName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosedLoopControlName(String newClosedLoopControlName) {
		String oldClosedLoopControlName = closedLoopControlName;
		closedLoopControlName = newClosedLoopControlName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_THRESHOLD__CLOSED_LOOP_CONTROL_NAME, oldClosedLoopControlName, closedLoopControlName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_THRESHOLD__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFieldPath() {
		return fieldPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFieldPath(String newFieldPath) {
		String oldFieldPath = fieldPath;
		fieldPath = newFieldPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_THRESHOLD__FIELD_PATH, oldFieldPath, fieldPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getThresholdValue() {
		return thresholdValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThresholdValue(Integer newThresholdValue) {
		Integer oldThresholdValue = thresholdValue;
		thresholdValue = newThresholdValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_THRESHOLD__THRESHOLD_VALUE, oldThresholdValue, thresholdValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(String newDirection) {
		String oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_THRESHOLD__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeverity() {
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeverity(String newSeverity) {
		String oldSeverity = severity;
		severity = newSeverity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_THRESHOLD__SEVERITY, oldSeverity, severity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.TCA_THRESHOLD__CLOSED_LOOP_CONTROL_NAME:
				return getClosedLoopControlName();
			case CommonPackage.TCA_THRESHOLD__VERSION:
				return getVersion();
			case CommonPackage.TCA_THRESHOLD__FIELD_PATH:
				return getFieldPath();
			case CommonPackage.TCA_THRESHOLD__THRESHOLD_VALUE:
				return getThresholdValue();
			case CommonPackage.TCA_THRESHOLD__DIRECTION:
				return getDirection();
			case CommonPackage.TCA_THRESHOLD__SEVERITY:
				return getSeverity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommonPackage.TCA_THRESHOLD__CLOSED_LOOP_CONTROL_NAME:
				setClosedLoopControlName((String)newValue);
				return;
			case CommonPackage.TCA_THRESHOLD__VERSION:
				setVersion((String)newValue);
				return;
			case CommonPackage.TCA_THRESHOLD__FIELD_PATH:
				setFieldPath((String)newValue);
				return;
			case CommonPackage.TCA_THRESHOLD__THRESHOLD_VALUE:
				setThresholdValue((Integer)newValue);
				return;
			case CommonPackage.TCA_THRESHOLD__DIRECTION:
				setDirection((String)newValue);
				return;
			case CommonPackage.TCA_THRESHOLD__SEVERITY:
				setSeverity((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CommonPackage.TCA_THRESHOLD__CLOSED_LOOP_CONTROL_NAME:
				setClosedLoopControlName(CLOSED_LOOP_CONTROL_NAME_EDEFAULT);
				return;
			case CommonPackage.TCA_THRESHOLD__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case CommonPackage.TCA_THRESHOLD__FIELD_PATH:
				setFieldPath(FIELD_PATH_EDEFAULT);
				return;
			case CommonPackage.TCA_THRESHOLD__THRESHOLD_VALUE:
				setThresholdValue(THRESHOLD_VALUE_EDEFAULT);
				return;
			case CommonPackage.TCA_THRESHOLD__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case CommonPackage.TCA_THRESHOLD__SEVERITY:
				setSeverity(SEVERITY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CommonPackage.TCA_THRESHOLD__CLOSED_LOOP_CONTROL_NAME:
				return CLOSED_LOOP_CONTROL_NAME_EDEFAULT == null ? closedLoopControlName != null : !CLOSED_LOOP_CONTROL_NAME_EDEFAULT.equals(closedLoopControlName);
			case CommonPackage.TCA_THRESHOLD__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case CommonPackage.TCA_THRESHOLD__FIELD_PATH:
				return FIELD_PATH_EDEFAULT == null ? fieldPath != null : !FIELD_PATH_EDEFAULT.equals(fieldPath);
			case CommonPackage.TCA_THRESHOLD__THRESHOLD_VALUE:
				return THRESHOLD_VALUE_EDEFAULT == null ? thresholdValue != null : !THRESHOLD_VALUE_EDEFAULT.equals(thresholdValue);
			case CommonPackage.TCA_THRESHOLD__DIRECTION:
				return DIRECTION_EDEFAULT == null ? direction != null : !DIRECTION_EDEFAULT.equals(direction);
			case CommonPackage.TCA_THRESHOLD__SEVERITY:
				return SEVERITY_EDEFAULT == null ? severity != null : !SEVERITY_EDEFAULT.equals(severity);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (closedLoopControlName: ");
		result.append(closedLoopControlName);
		result.append(", version: ");
		result.append(version);
		result.append(", fieldPath: ");
		result.append(fieldPath);
		result.append(", thresholdValue: ");
		result.append(thresholdValue);
		result.append(", direction: ");
		result.append(direction);
		result.append(", severity: ");
		result.append(severity);
		result.append(')');
		return result.toString();
	}

} //TcaThresholdImpl
