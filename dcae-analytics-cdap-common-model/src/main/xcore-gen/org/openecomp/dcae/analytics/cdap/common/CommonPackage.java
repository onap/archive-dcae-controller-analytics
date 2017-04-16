
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

import org.openecomp.dcae.controller.service.cdap.CdapPackage;

import org.openecomp.ncomp.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * -
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 * <!-- end-model-doc -->
 * @see org.openecomp.dcae.analytics.cdap.common.CommonFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/dcae-analytics-cdap-common-model/src/main/xcore-gen' basePackage='org.openecomp.dcae.analytics.cdap'"
 *        annotation="http://www.eclipse.org/emf/2011/Xcore cdap='http://openecomp.org/cdap' ecomp='http://openecomp.org' policy='http://openecomp.org/policy'"
 * @generated
 */
public interface CommonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "common";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.dcae.analytics.cdap.common";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "common";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CommonPackage eINSTANCE = org.openecomp.dcae.analytics.cdap.common.impl.CommonPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl <em>Tca Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl
	 * @see org.openecomp.dcae.analytics.cdap.common.impl.CommonPackageImpl#getTcaConfiguration()
	 * @generated
	 */
	int TCA_CONFIGURATION = 0;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_CONFIGURATION__DOMAIN = CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subscriber Host Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_CONFIGURATION__SUBSCRIBER_HOST_NAME = CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Subscriber Host Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_CONFIGURATION__SUBSCRIBER_HOST_PORT = CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subscriber Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_CONFIGURATION__SUBSCRIBER_TOPIC_NAME = CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Subscriber Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_CONFIGURATION__SUBSCRIBER_PROTOCOL = CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Subscriber User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_CONFIGURATION__SUBSCRIBER_USER_NAME = CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Subscriber User Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_CONFIGURATION__SUBSCRIBER_USER_PASSWORD = CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Subscriber Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_CONFIGURATION__SUBSCRIBER_CONTENT_TYPE = CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Subscriber Consumer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_CONFIGURATION__SUBSCRIBER_CONSUMER_ID = CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Subscriber Consumer Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_CONFIGURATION__SUBSCRIBER_CONSUMER_GROUP = CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Subscriber Timeout MS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_CONFIGURATION__SUBSCRIBER_TIMEOUT_MS = CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Subscriber Message Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_CONFIGURATION__SUBSCRIBER_MESSAGE_LIMIT = CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Subscriber Polling Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_CONFIGURATION__SUBSCRIBER_POLLING_INTERVAL = CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Publisher Host Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_CONFIGURATION__PUBLISHER_HOST_NAME = CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Publisher Host Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_CONFIGURATION__PUBLISHER_HOST_PORT = CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Publisher Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_CONFIGURATION__PUBLISHER_TOPIC_NAME = CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Publisher Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_CONFIGURATION__PUBLISHER_PROTOCOL = CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Publisher User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_CONFIGURATION__PUBLISHER_USER_NAME = CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Publisher User Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_CONFIGURATION__PUBLISHER_USER_PASSWORD = CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Publisher Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_CONFIGURATION__PUBLISHER_CONTENT_TYPE = CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Publisher Max Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_CONFIGURATION__PUBLISHER_MAX_BATCH_SIZE = CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Publisher Max Recovery Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_CONFIGURATION__PUBLISHER_MAX_RECOVERY_QUEUE_SIZE = CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Publisher Polling Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_CONFIGURATION__PUBLISHER_POLLING_INTERVAL = CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Metrics Per Functional Role</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_CONFIGURATION__METRICS_PER_FUNCTIONAL_ROLE = CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION_FEATURE_COUNT + 23;

	/**
	 * The number of structural features of the '<em>Tca Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_CONFIGURATION_FEATURE_COUNT = CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION_FEATURE_COUNT + 24;

	/**
	 * The number of operations of the '<em>Tca Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_CONFIGURATION_OPERATION_COUNT = CdapPackage.CDAP_SERVICE_INSTANCE_CONFIGURATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaMetricsImpl <em>Tca Metrics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.analytics.cdap.common.impl.TcaMetricsImpl
	 * @see org.openecomp.dcae.analytics.cdap.common.impl.CommonPackageImpl#getTcaMetrics()
	 * @generated
	 */
	int TCA_METRICS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_METRICS__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_METRICS__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_METRICS__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_METRICS__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Policy Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_METRICS__POLICY_NAME = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Policy Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_METRICS__POLICY_DESCRIPTION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Policy Config Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_METRICS__POLICY_CONFIG_NAME = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Policy Template Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_METRICS__POLICY_TEMPLATE_VERSION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Policy Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_METRICS__POLICY_VERSION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Policy Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_METRICS__POLICY_PRIORITY = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Policy Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_METRICS__POLICY_SCOPE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Functional Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_METRICS__FUNCTIONAL_ROLE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Thresholds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_METRICS__THRESHOLDS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Tca Metrics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_METRICS_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Tca Metrics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_METRICS_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaThresholdImpl <em>Tca Threshold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.dcae.analytics.cdap.common.impl.TcaThresholdImpl
	 * @see org.openecomp.dcae.analytics.cdap.common.impl.CommonPackageImpl#getTcaThreshold()
	 * @generated
	 */
	int TCA_THRESHOLD = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_THRESHOLD__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_THRESHOLD__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_THRESHOLD__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_THRESHOLD__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Closed Loop Control Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_THRESHOLD__CLOSED_LOOP_CONTROL_NAME = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_THRESHOLD__VERSION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Field Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_THRESHOLD__FIELD_PATH = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Threshold Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_THRESHOLD__THRESHOLD_VALUE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_THRESHOLD__DIRECTION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_THRESHOLD__SEVERITY = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Tca Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_THRESHOLD_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Tca Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TCA_THRESHOLD_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration <em>Tca Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tca Configuration</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaConfiguration
	 * @generated
	 */
	EClass getTcaConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getDomain()
	 * @see #getTcaConfiguration()
	 * @generated
	 */
	EAttribute getTcaConfiguration_Domain();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberHostName <em>Subscriber Host Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscriber Host Name</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberHostName()
	 * @see #getTcaConfiguration()
	 * @generated
	 */
	EAttribute getTcaConfiguration_SubscriberHostName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberHostPort <em>Subscriber Host Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscriber Host Port</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberHostPort()
	 * @see #getTcaConfiguration()
	 * @generated
	 */
	EAttribute getTcaConfiguration_SubscriberHostPort();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberTopicName <em>Subscriber Topic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscriber Topic Name</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberTopicName()
	 * @see #getTcaConfiguration()
	 * @generated
	 */
	EAttribute getTcaConfiguration_SubscriberTopicName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberProtocol <em>Subscriber Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscriber Protocol</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberProtocol()
	 * @see #getTcaConfiguration()
	 * @generated
	 */
	EAttribute getTcaConfiguration_SubscriberProtocol();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberUserName <em>Subscriber User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscriber User Name</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberUserName()
	 * @see #getTcaConfiguration()
	 * @generated
	 */
	EAttribute getTcaConfiguration_SubscriberUserName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberUserPassword <em>Subscriber User Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscriber User Password</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberUserPassword()
	 * @see #getTcaConfiguration()
	 * @generated
	 */
	EAttribute getTcaConfiguration_SubscriberUserPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberContentType <em>Subscriber Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscriber Content Type</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberContentType()
	 * @see #getTcaConfiguration()
	 * @generated
	 */
	EAttribute getTcaConfiguration_SubscriberContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberConsumerId <em>Subscriber Consumer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscriber Consumer Id</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberConsumerId()
	 * @see #getTcaConfiguration()
	 * @generated
	 */
	EAttribute getTcaConfiguration_SubscriberConsumerId();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberConsumerGroup <em>Subscriber Consumer Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscriber Consumer Group</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberConsumerGroup()
	 * @see #getTcaConfiguration()
	 * @generated
	 */
	EAttribute getTcaConfiguration_SubscriberConsumerGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberTimeoutMS <em>Subscriber Timeout MS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscriber Timeout MS</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberTimeoutMS()
	 * @see #getTcaConfiguration()
	 * @generated
	 */
	EAttribute getTcaConfiguration_SubscriberTimeoutMS();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberMessageLimit <em>Subscriber Message Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscriber Message Limit</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberMessageLimit()
	 * @see #getTcaConfiguration()
	 * @generated
	 */
	EAttribute getTcaConfiguration_SubscriberMessageLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberPollingInterval <em>Subscriber Polling Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subscriber Polling Interval</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberPollingInterval()
	 * @see #getTcaConfiguration()
	 * @generated
	 */
	EAttribute getTcaConfiguration_SubscriberPollingInterval();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherHostName <em>Publisher Host Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher Host Name</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherHostName()
	 * @see #getTcaConfiguration()
	 * @generated
	 */
	EAttribute getTcaConfiguration_PublisherHostName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherHostPort <em>Publisher Host Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher Host Port</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherHostPort()
	 * @see #getTcaConfiguration()
	 * @generated
	 */
	EAttribute getTcaConfiguration_PublisherHostPort();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherTopicName <em>Publisher Topic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher Topic Name</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherTopicName()
	 * @see #getTcaConfiguration()
	 * @generated
	 */
	EAttribute getTcaConfiguration_PublisherTopicName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherProtocol <em>Publisher Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher Protocol</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherProtocol()
	 * @see #getTcaConfiguration()
	 * @generated
	 */
	EAttribute getTcaConfiguration_PublisherProtocol();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherUserName <em>Publisher User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher User Name</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherUserName()
	 * @see #getTcaConfiguration()
	 * @generated
	 */
	EAttribute getTcaConfiguration_PublisherUserName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherUserPassword <em>Publisher User Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher User Password</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherUserPassword()
	 * @see #getTcaConfiguration()
	 * @generated
	 */
	EAttribute getTcaConfiguration_PublisherUserPassword();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherContentType <em>Publisher Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher Content Type</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherContentType()
	 * @see #getTcaConfiguration()
	 * @generated
	 */
	EAttribute getTcaConfiguration_PublisherContentType();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherMaxBatchSize <em>Publisher Max Batch Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher Max Batch Size</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherMaxBatchSize()
	 * @see #getTcaConfiguration()
	 * @generated
	 */
	EAttribute getTcaConfiguration_PublisherMaxBatchSize();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherMaxRecoveryQueueSize <em>Publisher Max Recovery Queue Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher Max Recovery Queue Size</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherMaxRecoveryQueueSize()
	 * @see #getTcaConfiguration()
	 * @generated
	 */
	EAttribute getTcaConfiguration_PublisherMaxRecoveryQueueSize();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherPollingInterval <em>Publisher Polling Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publisher Polling Interval</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherPollingInterval()
	 * @see #getTcaConfiguration()
	 * @generated
	 */
	EAttribute getTcaConfiguration_PublisherPollingInterval();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getMetricsPerFunctionalRole <em>Metrics Per Functional Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metrics Per Functional Role</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getMetricsPerFunctionalRole()
	 * @see #getTcaConfiguration()
	 * @generated
	 */
	EReference getTcaConfiguration_MetricsPerFunctionalRole();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.analytics.cdap.common.TcaMetrics <em>Tca Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tca Metrics</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaMetrics
	 * @generated
	 */
	EClass getTcaMetrics();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaMetrics#getFunctionalRole <em>Functional Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Functional Role</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaMetrics#getFunctionalRole()
	 * @see #getTcaMetrics()
	 * @generated
	 */
	EAttribute getTcaMetrics_FunctionalRole();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.dcae.analytics.cdap.common.TcaMetrics#getThresholds <em>Thresholds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Thresholds</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaMetrics#getThresholds()
	 * @see #getTcaMetrics()
	 * @generated
	 */
	EReference getTcaMetrics_Thresholds();

	/**
	 * Returns the meta object for class '{@link org.openecomp.dcae.analytics.cdap.common.TcaThreshold <em>Tca Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tca Threshold</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaThreshold
	 * @generated
	 */
	EClass getTcaThreshold();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaThreshold#getClosedLoopControlName <em>Closed Loop Control Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Closed Loop Control Name</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaThreshold#getClosedLoopControlName()
	 * @see #getTcaThreshold()
	 * @generated
	 */
	EAttribute getTcaThreshold_ClosedLoopControlName();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaThreshold#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaThreshold#getVersion()
	 * @see #getTcaThreshold()
	 * @generated
	 */
	EAttribute getTcaThreshold_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaThreshold#getFieldPath <em>Field Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Path</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaThreshold#getFieldPath()
	 * @see #getTcaThreshold()
	 * @generated
	 */
	EAttribute getTcaThreshold_FieldPath();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaThreshold#getThresholdValue <em>Threshold Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threshold Value</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaThreshold#getThresholdValue()
	 * @see #getTcaThreshold()
	 * @generated
	 */
	EAttribute getTcaThreshold_ThresholdValue();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaThreshold#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Direction</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaThreshold#getDirection()
	 * @see #getTcaThreshold()
	 * @generated
	 */
	EAttribute getTcaThreshold_Direction();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.dcae.analytics.cdap.common.TcaThreshold#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Severity</em>'.
	 * @see org.openecomp.dcae.analytics.cdap.common.TcaThreshold#getSeverity()
	 * @see #getTcaThreshold()
	 * @generated
	 */
	EAttribute getTcaThreshold_Severity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CommonFactory getCommonFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl <em>Tca Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl
		 * @see org.openecomp.dcae.analytics.cdap.common.impl.CommonPackageImpl#getTcaConfiguration()
		 * @generated
		 */
		EClass TCA_CONFIGURATION = eINSTANCE.getTcaConfiguration();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_CONFIGURATION__DOMAIN = eINSTANCE.getTcaConfiguration_Domain();

		/**
		 * The meta object literal for the '<em><b>Subscriber Host Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_CONFIGURATION__SUBSCRIBER_HOST_NAME = eINSTANCE.getTcaConfiguration_SubscriberHostName();

		/**
		 * The meta object literal for the '<em><b>Subscriber Host Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_CONFIGURATION__SUBSCRIBER_HOST_PORT = eINSTANCE.getTcaConfiguration_SubscriberHostPort();

		/**
		 * The meta object literal for the '<em><b>Subscriber Topic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_CONFIGURATION__SUBSCRIBER_TOPIC_NAME = eINSTANCE.getTcaConfiguration_SubscriberTopicName();

		/**
		 * The meta object literal for the '<em><b>Subscriber Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_CONFIGURATION__SUBSCRIBER_PROTOCOL = eINSTANCE.getTcaConfiguration_SubscriberProtocol();

		/**
		 * The meta object literal for the '<em><b>Subscriber User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_CONFIGURATION__SUBSCRIBER_USER_NAME = eINSTANCE.getTcaConfiguration_SubscriberUserName();

		/**
		 * The meta object literal for the '<em><b>Subscriber User Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_CONFIGURATION__SUBSCRIBER_USER_PASSWORD = eINSTANCE.getTcaConfiguration_SubscriberUserPassword();

		/**
		 * The meta object literal for the '<em><b>Subscriber Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_CONFIGURATION__SUBSCRIBER_CONTENT_TYPE = eINSTANCE.getTcaConfiguration_SubscriberContentType();

		/**
		 * The meta object literal for the '<em><b>Subscriber Consumer Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_CONFIGURATION__SUBSCRIBER_CONSUMER_ID = eINSTANCE.getTcaConfiguration_SubscriberConsumerId();

		/**
		 * The meta object literal for the '<em><b>Subscriber Consumer Group</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_CONFIGURATION__SUBSCRIBER_CONSUMER_GROUP = eINSTANCE.getTcaConfiguration_SubscriberConsumerGroup();

		/**
		 * The meta object literal for the '<em><b>Subscriber Timeout MS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_CONFIGURATION__SUBSCRIBER_TIMEOUT_MS = eINSTANCE.getTcaConfiguration_SubscriberTimeoutMS();

		/**
		 * The meta object literal for the '<em><b>Subscriber Message Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_CONFIGURATION__SUBSCRIBER_MESSAGE_LIMIT = eINSTANCE.getTcaConfiguration_SubscriberMessageLimit();

		/**
		 * The meta object literal for the '<em><b>Subscriber Polling Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_CONFIGURATION__SUBSCRIBER_POLLING_INTERVAL = eINSTANCE.getTcaConfiguration_SubscriberPollingInterval();

		/**
		 * The meta object literal for the '<em><b>Publisher Host Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_CONFIGURATION__PUBLISHER_HOST_NAME = eINSTANCE.getTcaConfiguration_PublisherHostName();

		/**
		 * The meta object literal for the '<em><b>Publisher Host Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_CONFIGURATION__PUBLISHER_HOST_PORT = eINSTANCE.getTcaConfiguration_PublisherHostPort();

		/**
		 * The meta object literal for the '<em><b>Publisher Topic Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_CONFIGURATION__PUBLISHER_TOPIC_NAME = eINSTANCE.getTcaConfiguration_PublisherTopicName();

		/**
		 * The meta object literal for the '<em><b>Publisher Protocol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_CONFIGURATION__PUBLISHER_PROTOCOL = eINSTANCE.getTcaConfiguration_PublisherProtocol();

		/**
		 * The meta object literal for the '<em><b>Publisher User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_CONFIGURATION__PUBLISHER_USER_NAME = eINSTANCE.getTcaConfiguration_PublisherUserName();

		/**
		 * The meta object literal for the '<em><b>Publisher User Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_CONFIGURATION__PUBLISHER_USER_PASSWORD = eINSTANCE.getTcaConfiguration_PublisherUserPassword();

		/**
		 * The meta object literal for the '<em><b>Publisher Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_CONFIGURATION__PUBLISHER_CONTENT_TYPE = eINSTANCE.getTcaConfiguration_PublisherContentType();

		/**
		 * The meta object literal for the '<em><b>Publisher Max Batch Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_CONFIGURATION__PUBLISHER_MAX_BATCH_SIZE = eINSTANCE.getTcaConfiguration_PublisherMaxBatchSize();

		/**
		 * The meta object literal for the '<em><b>Publisher Max Recovery Queue Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_CONFIGURATION__PUBLISHER_MAX_RECOVERY_QUEUE_SIZE = eINSTANCE.getTcaConfiguration_PublisherMaxRecoveryQueueSize();

		/**
		 * The meta object literal for the '<em><b>Publisher Polling Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_CONFIGURATION__PUBLISHER_POLLING_INTERVAL = eINSTANCE.getTcaConfiguration_PublisherPollingInterval();

		/**
		 * The meta object literal for the '<em><b>Metrics Per Functional Role</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCA_CONFIGURATION__METRICS_PER_FUNCTIONAL_ROLE = eINSTANCE.getTcaConfiguration_MetricsPerFunctionalRole();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaMetricsImpl <em>Tca Metrics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.analytics.cdap.common.impl.TcaMetricsImpl
		 * @see org.openecomp.dcae.analytics.cdap.common.impl.CommonPackageImpl#getTcaMetrics()
		 * @generated
		 */
		EClass TCA_METRICS = eINSTANCE.getTcaMetrics();

		/**
		 * The meta object literal for the '<em><b>Functional Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_METRICS__FUNCTIONAL_ROLE = eINSTANCE.getTcaMetrics_FunctionalRole();

		/**
		 * The meta object literal for the '<em><b>Thresholds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TCA_METRICS__THRESHOLDS = eINSTANCE.getTcaMetrics_Thresholds();

		/**
		 * The meta object literal for the '{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaThresholdImpl <em>Tca Threshold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.dcae.analytics.cdap.common.impl.TcaThresholdImpl
		 * @see org.openecomp.dcae.analytics.cdap.common.impl.CommonPackageImpl#getTcaThreshold()
		 * @generated
		 */
		EClass TCA_THRESHOLD = eINSTANCE.getTcaThreshold();

		/**
		 * The meta object literal for the '<em><b>Closed Loop Control Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_THRESHOLD__CLOSED_LOOP_CONTROL_NAME = eINSTANCE.getTcaThreshold_ClosedLoopControlName();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_THRESHOLD__VERSION = eINSTANCE.getTcaThreshold_Version();

		/**
		 * The meta object literal for the '<em><b>Field Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_THRESHOLD__FIELD_PATH = eINSTANCE.getTcaThreshold_FieldPath();

		/**
		 * The meta object literal for the '<em><b>Threshold Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_THRESHOLD__THRESHOLD_VALUE = eINSTANCE.getTcaThreshold_ThresholdValue();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_THRESHOLD__DIRECTION = eINSTANCE.getTcaThreshold_Direction();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TCA_THRESHOLD__SEVERITY = eINSTANCE.getTcaThreshold_Severity();

	}

} //CommonPackage
