
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
import org.openecomp.dcae.analytics.cdap.common.TcaMetrics;
import org.openecomp.dcae.analytics.cdap.common.TcaThreshold;
import org.openecomp.dcae.controller.core.service.DcaePolicyEntity;
import org.openecomp.dcae.controller.core.service.ServicePackage;
import org.openecomp.ncomp.core.impl.NamedEntityImpl;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tca Metrics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaMetricsImpl#getPolicyName <em>Policy Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaMetricsImpl#getPolicyDescription <em>Policy Description</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaMetricsImpl#getPolicyConfigName <em>Policy Config Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaMetricsImpl#getPolicyTemplateVersion <em>Policy Template Version</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaMetricsImpl#getPolicyVersion <em>Policy Version</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaMetricsImpl#getPolicyPriority <em>Policy Priority</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaMetricsImpl#getPolicyScope <em>Policy Scope</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaMetricsImpl#getFunctionalRole <em>Functional Role</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaMetricsImpl#getThresholds <em>Thresholds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TcaMetricsImpl extends NamedEntityImpl implements TcaMetrics {
	/**
	 * The default value of the '{@link #getPolicyName() <em>Policy Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyName()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyName() <em>Policy Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyName()
	 * @generated
	 * @ordered
	 */
	protected String policyName = POLICY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolicyDescription() <em>Policy Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyDescription() <em>Policy Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyDescription()
	 * @generated
	 * @ordered
	 */
	protected String policyDescription = POLICY_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolicyConfigName() <em>Policy Config Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyConfigName()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_CONFIG_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyConfigName() <em>Policy Config Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyConfigName()
	 * @generated
	 * @ordered
	 */
	protected String policyConfigName = POLICY_CONFIG_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolicyTemplateVersion() <em>Policy Template Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyTemplateVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_TEMPLATE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyTemplateVersion() <em>Policy Template Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyTemplateVersion()
	 * @generated
	 * @ordered
	 */
	protected String policyTemplateVersion = POLICY_TEMPLATE_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolicyVersion() <em>Policy Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyVersion() <em>Policy Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyVersion()
	 * @generated
	 * @ordered
	 */
	protected String policyVersion = POLICY_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolicyPriority() <em>Policy Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyPriority() <em>Policy Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyPriority()
	 * @generated
	 * @ordered
	 */
	protected String policyPriority = POLICY_PRIORITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolicyScope() <em>Policy Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyScope()
	 * @generated
	 * @ordered
	 */
	protected static final String POLICY_SCOPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolicyScope() <em>Policy Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolicyScope()
	 * @generated
	 * @ordered
	 */
	protected String policyScope = POLICY_SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFunctionalRole() <em>Functional Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalRole()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTIONAL_ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunctionalRole() <em>Functional Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalRole()
	 * @generated
	 * @ordered
	 */
	protected String functionalRole = FUNCTIONAL_ROLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getThresholds() <em>Thresholds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThresholds()
	 * @generated
	 * @ordered
	 */
	protected EList<TcaThreshold> thresholds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TcaMetricsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.TCA_METRICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPolicyName() {
		return policyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyName(String newPolicyName) {
		String oldPolicyName = policyName;
		policyName = newPolicyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_METRICS__POLICY_NAME, oldPolicyName, policyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPolicyDescription() {
		return policyDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyDescription(String newPolicyDescription) {
		String oldPolicyDescription = policyDescription;
		policyDescription = newPolicyDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_METRICS__POLICY_DESCRIPTION, oldPolicyDescription, policyDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPolicyConfigName() {
		return policyConfigName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyConfigName(String newPolicyConfigName) {
		String oldPolicyConfigName = policyConfigName;
		policyConfigName = newPolicyConfigName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_METRICS__POLICY_CONFIG_NAME, oldPolicyConfigName, policyConfigName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPolicyTemplateVersion() {
		return policyTemplateVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyTemplateVersion(String newPolicyTemplateVersion) {
		String oldPolicyTemplateVersion = policyTemplateVersion;
		policyTemplateVersion = newPolicyTemplateVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_METRICS__POLICY_TEMPLATE_VERSION, oldPolicyTemplateVersion, policyTemplateVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPolicyVersion() {
		return policyVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyVersion(String newPolicyVersion) {
		String oldPolicyVersion = policyVersion;
		policyVersion = newPolicyVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_METRICS__POLICY_VERSION, oldPolicyVersion, policyVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPolicyPriority() {
		return policyPriority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyPriority(String newPolicyPriority) {
		String oldPolicyPriority = policyPriority;
		policyPriority = newPolicyPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_METRICS__POLICY_PRIORITY, oldPolicyPriority, policyPriority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPolicyScope() {
		return policyScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolicyScope(String newPolicyScope) {
		String oldPolicyScope = policyScope;
		policyScope = newPolicyScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_METRICS__POLICY_SCOPE, oldPolicyScope, policyScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunctionalRole() {
		return functionalRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunctionalRole(String newFunctionalRole) {
		String oldFunctionalRole = functionalRole;
		functionalRole = newFunctionalRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_METRICS__FUNCTIONAL_ROLE, oldFunctionalRole, functionalRole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TcaThreshold> getThresholds() {
		if (thresholds == null) {
			thresholds = new EObjectContainmentEList<TcaThreshold>(TcaThreshold.class, this, CommonPackage.TCA_METRICS__THRESHOLDS);
		}
		return thresholds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.TCA_METRICS__THRESHOLDS:
				return ((InternalEList<?>)getThresholds()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CommonPackage.TCA_METRICS__POLICY_NAME:
				return getPolicyName();
			case CommonPackage.TCA_METRICS__POLICY_DESCRIPTION:
				return getPolicyDescription();
			case CommonPackage.TCA_METRICS__POLICY_CONFIG_NAME:
				return getPolicyConfigName();
			case CommonPackage.TCA_METRICS__POLICY_TEMPLATE_VERSION:
				return getPolicyTemplateVersion();
			case CommonPackage.TCA_METRICS__POLICY_VERSION:
				return getPolicyVersion();
			case CommonPackage.TCA_METRICS__POLICY_PRIORITY:
				return getPolicyPriority();
			case CommonPackage.TCA_METRICS__POLICY_SCOPE:
				return getPolicyScope();
			case CommonPackage.TCA_METRICS__FUNCTIONAL_ROLE:
				return getFunctionalRole();
			case CommonPackage.TCA_METRICS__THRESHOLDS:
				return getThresholds();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CommonPackage.TCA_METRICS__POLICY_NAME:
				setPolicyName((String)newValue);
				return;
			case CommonPackage.TCA_METRICS__POLICY_DESCRIPTION:
				setPolicyDescription((String)newValue);
				return;
			case CommonPackage.TCA_METRICS__POLICY_CONFIG_NAME:
				setPolicyConfigName((String)newValue);
				return;
			case CommonPackage.TCA_METRICS__POLICY_TEMPLATE_VERSION:
				setPolicyTemplateVersion((String)newValue);
				return;
			case CommonPackage.TCA_METRICS__POLICY_VERSION:
				setPolicyVersion((String)newValue);
				return;
			case CommonPackage.TCA_METRICS__POLICY_PRIORITY:
				setPolicyPriority((String)newValue);
				return;
			case CommonPackage.TCA_METRICS__POLICY_SCOPE:
				setPolicyScope((String)newValue);
				return;
			case CommonPackage.TCA_METRICS__FUNCTIONAL_ROLE:
				setFunctionalRole((String)newValue);
				return;
			case CommonPackage.TCA_METRICS__THRESHOLDS:
				getThresholds().clear();
				getThresholds().addAll((Collection<? extends TcaThreshold>)newValue);
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
			case CommonPackage.TCA_METRICS__POLICY_NAME:
				setPolicyName(POLICY_NAME_EDEFAULT);
				return;
			case CommonPackage.TCA_METRICS__POLICY_DESCRIPTION:
				setPolicyDescription(POLICY_DESCRIPTION_EDEFAULT);
				return;
			case CommonPackage.TCA_METRICS__POLICY_CONFIG_NAME:
				setPolicyConfigName(POLICY_CONFIG_NAME_EDEFAULT);
				return;
			case CommonPackage.TCA_METRICS__POLICY_TEMPLATE_VERSION:
				setPolicyTemplateVersion(POLICY_TEMPLATE_VERSION_EDEFAULT);
				return;
			case CommonPackage.TCA_METRICS__POLICY_VERSION:
				setPolicyVersion(POLICY_VERSION_EDEFAULT);
				return;
			case CommonPackage.TCA_METRICS__POLICY_PRIORITY:
				setPolicyPriority(POLICY_PRIORITY_EDEFAULT);
				return;
			case CommonPackage.TCA_METRICS__POLICY_SCOPE:
				setPolicyScope(POLICY_SCOPE_EDEFAULT);
				return;
			case CommonPackage.TCA_METRICS__FUNCTIONAL_ROLE:
				setFunctionalRole(FUNCTIONAL_ROLE_EDEFAULT);
				return;
			case CommonPackage.TCA_METRICS__THRESHOLDS:
				getThresholds().clear();
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
			case CommonPackage.TCA_METRICS__POLICY_NAME:
				return POLICY_NAME_EDEFAULT == null ? policyName != null : !POLICY_NAME_EDEFAULT.equals(policyName);
			case CommonPackage.TCA_METRICS__POLICY_DESCRIPTION:
				return POLICY_DESCRIPTION_EDEFAULT == null ? policyDescription != null : !POLICY_DESCRIPTION_EDEFAULT.equals(policyDescription);
			case CommonPackage.TCA_METRICS__POLICY_CONFIG_NAME:
				return POLICY_CONFIG_NAME_EDEFAULT == null ? policyConfigName != null : !POLICY_CONFIG_NAME_EDEFAULT.equals(policyConfigName);
			case CommonPackage.TCA_METRICS__POLICY_TEMPLATE_VERSION:
				return POLICY_TEMPLATE_VERSION_EDEFAULT == null ? policyTemplateVersion != null : !POLICY_TEMPLATE_VERSION_EDEFAULT.equals(policyTemplateVersion);
			case CommonPackage.TCA_METRICS__POLICY_VERSION:
				return POLICY_VERSION_EDEFAULT == null ? policyVersion != null : !POLICY_VERSION_EDEFAULT.equals(policyVersion);
			case CommonPackage.TCA_METRICS__POLICY_PRIORITY:
				return POLICY_PRIORITY_EDEFAULT == null ? policyPriority != null : !POLICY_PRIORITY_EDEFAULT.equals(policyPriority);
			case CommonPackage.TCA_METRICS__POLICY_SCOPE:
				return POLICY_SCOPE_EDEFAULT == null ? policyScope != null : !POLICY_SCOPE_EDEFAULT.equals(policyScope);
			case CommonPackage.TCA_METRICS__FUNCTIONAL_ROLE:
				return FUNCTIONAL_ROLE_EDEFAULT == null ? functionalRole != null : !FUNCTIONAL_ROLE_EDEFAULT.equals(functionalRole);
			case CommonPackage.TCA_METRICS__THRESHOLDS:
				return thresholds != null && !thresholds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DcaePolicyEntity.class) {
			switch (derivedFeatureID) {
				case CommonPackage.TCA_METRICS__POLICY_NAME: return ServicePackage.DCAE_POLICY_ENTITY__POLICY_NAME;
				case CommonPackage.TCA_METRICS__POLICY_DESCRIPTION: return ServicePackage.DCAE_POLICY_ENTITY__POLICY_DESCRIPTION;
				case CommonPackage.TCA_METRICS__POLICY_CONFIG_NAME: return ServicePackage.DCAE_POLICY_ENTITY__POLICY_CONFIG_NAME;
				case CommonPackage.TCA_METRICS__POLICY_TEMPLATE_VERSION: return ServicePackage.DCAE_POLICY_ENTITY__POLICY_TEMPLATE_VERSION;
				case CommonPackage.TCA_METRICS__POLICY_VERSION: return ServicePackage.DCAE_POLICY_ENTITY__POLICY_VERSION;
				case CommonPackage.TCA_METRICS__POLICY_PRIORITY: return ServicePackage.DCAE_POLICY_ENTITY__POLICY_PRIORITY;
				case CommonPackage.TCA_METRICS__POLICY_SCOPE: return ServicePackage.DCAE_POLICY_ENTITY__POLICY_SCOPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DcaePolicyEntity.class) {
			switch (baseFeatureID) {
				case ServicePackage.DCAE_POLICY_ENTITY__POLICY_NAME: return CommonPackage.TCA_METRICS__POLICY_NAME;
				case ServicePackage.DCAE_POLICY_ENTITY__POLICY_DESCRIPTION: return CommonPackage.TCA_METRICS__POLICY_DESCRIPTION;
				case ServicePackage.DCAE_POLICY_ENTITY__POLICY_CONFIG_NAME: return CommonPackage.TCA_METRICS__POLICY_CONFIG_NAME;
				case ServicePackage.DCAE_POLICY_ENTITY__POLICY_TEMPLATE_VERSION: return CommonPackage.TCA_METRICS__POLICY_TEMPLATE_VERSION;
				case ServicePackage.DCAE_POLICY_ENTITY__POLICY_VERSION: return CommonPackage.TCA_METRICS__POLICY_VERSION;
				case ServicePackage.DCAE_POLICY_ENTITY__POLICY_PRIORITY: return CommonPackage.TCA_METRICS__POLICY_PRIORITY;
				case ServicePackage.DCAE_POLICY_ENTITY__POLICY_SCOPE: return CommonPackage.TCA_METRICS__POLICY_SCOPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (policyName: ");
		result.append(policyName);
		result.append(", policyDescription: ");
		result.append(policyDescription);
		result.append(", policyConfigName: ");
		result.append(policyConfigName);
		result.append(", policyTemplateVersion: ");
		result.append(policyTemplateVersion);
		result.append(", policyVersion: ");
		result.append(policyVersion);
		result.append(", policyPriority: ");
		result.append(policyPriority);
		result.append(", policyScope: ");
		result.append(policyScope);
		result.append(", functionalRole: ");
		result.append(functionalRole);
		result.append(')');
		return result.toString();
	}

} //TcaMetricsImpl
