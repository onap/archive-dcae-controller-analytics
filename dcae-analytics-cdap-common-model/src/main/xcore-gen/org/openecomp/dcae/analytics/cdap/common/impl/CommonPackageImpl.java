
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

import org.openecomp.dcae.analytics.cdap.common.CommonFactory;
import org.openecomp.dcae.analytics.cdap.common.CommonPackage;
import org.openecomp.dcae.analytics.cdap.common.TcaConfiguration;
import org.openecomp.dcae.analytics.cdap.common.TcaMetrics;
import org.openecomp.dcae.analytics.cdap.common.TcaThreshold;
import org.openecomp.dcae.controller.core.service.ServicePackage;
import org.openecomp.dcae.controller.service.cdap.CdapPackage;
import org.openecomp.ncomp.core.CorePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CommonPackageImpl extends EPackageImpl implements CommonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcaConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcaMetricsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcaThresholdEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CommonPackageImpl() {
		super(eNS_URI, CommonFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CommonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CommonPackage init() {
		if (isInited) return (CommonPackage)EPackage.Registry.INSTANCE.getEPackage(CommonPackage.eNS_URI);

		// Obtain or create and register package
		CommonPackageImpl theCommonPackage = (CommonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CommonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CommonPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CdapPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCommonPackage.createPackageContents();

		// Initialize created meta-data
		theCommonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCommonPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CommonPackage.eNS_URI, theCommonPackage);
		return theCommonPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTcaConfiguration() {
		return tcaConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaConfiguration_Domain() {
		return (EAttribute)tcaConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaConfiguration_SubscriberHostName() {
		return (EAttribute)tcaConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaConfiguration_SubscriberHostPort() {
		return (EAttribute)tcaConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaConfiguration_SubscriberTopicName() {
		return (EAttribute)tcaConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaConfiguration_SubscriberProtocol() {
		return (EAttribute)tcaConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaConfiguration_SubscriberUserName() {
		return (EAttribute)tcaConfigurationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaConfiguration_SubscriberUserPassword() {
		return (EAttribute)tcaConfigurationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaConfiguration_SubscriberContentType() {
		return (EAttribute)tcaConfigurationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaConfiguration_SubscriberConsumerId() {
		return (EAttribute)tcaConfigurationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaConfiguration_SubscriberConsumerGroup() {
		return (EAttribute)tcaConfigurationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaConfiguration_SubscriberTimeoutMS() {
		return (EAttribute)tcaConfigurationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaConfiguration_SubscriberMessageLimit() {
		return (EAttribute)tcaConfigurationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaConfiguration_SubscriberPollingInterval() {
		return (EAttribute)tcaConfigurationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaConfiguration_PublisherHostName() {
		return (EAttribute)tcaConfigurationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaConfiguration_PublisherHostPort() {
		return (EAttribute)tcaConfigurationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaConfiguration_PublisherTopicName() {
		return (EAttribute)tcaConfigurationEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaConfiguration_PublisherProtocol() {
		return (EAttribute)tcaConfigurationEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaConfiguration_PublisherUserName() {
		return (EAttribute)tcaConfigurationEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaConfiguration_PublisherUserPassword() {
		return (EAttribute)tcaConfigurationEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaConfiguration_PublisherContentType() {
		return (EAttribute)tcaConfigurationEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaConfiguration_PublisherMaxBatchSize() {
		return (EAttribute)tcaConfigurationEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaConfiguration_PublisherMaxRecoveryQueueSize() {
		return (EAttribute)tcaConfigurationEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaConfiguration_PublisherPollingInterval() {
		return (EAttribute)tcaConfigurationEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTcaConfiguration_MetricsPerFunctionalRole() {
		return (EReference)tcaConfigurationEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTcaMetrics() {
		return tcaMetricsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaMetrics_FunctionalRole() {
		return (EAttribute)tcaMetricsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTcaMetrics_Thresholds() {
		return (EReference)tcaMetricsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTcaThreshold() {
		return tcaThresholdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaThreshold_ClosedLoopControlName() {
		return (EAttribute)tcaThresholdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaThreshold_Version() {
		return (EAttribute)tcaThresholdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaThreshold_FieldPath() {
		return (EAttribute)tcaThresholdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaThreshold_ThresholdValue() {
		return (EAttribute)tcaThresholdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaThreshold_Direction() {
		return (EAttribute)tcaThresholdEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTcaThreshold_Severity() {
		return (EAttribute)tcaThresholdEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonFactory getCommonFactory() {
		return (CommonFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		tcaConfigurationEClass = createEClass(TCA_CONFIGURATION);
		createEAttribute(tcaConfigurationEClass, TCA_CONFIGURATION__DOMAIN);
		createEAttribute(tcaConfigurationEClass, TCA_CONFIGURATION__SUBSCRIBER_HOST_NAME);
		createEAttribute(tcaConfigurationEClass, TCA_CONFIGURATION__SUBSCRIBER_HOST_PORT);
		createEAttribute(tcaConfigurationEClass, TCA_CONFIGURATION__SUBSCRIBER_TOPIC_NAME);
		createEAttribute(tcaConfigurationEClass, TCA_CONFIGURATION__SUBSCRIBER_PROTOCOL);
		createEAttribute(tcaConfigurationEClass, TCA_CONFIGURATION__SUBSCRIBER_USER_NAME);
		createEAttribute(tcaConfigurationEClass, TCA_CONFIGURATION__SUBSCRIBER_USER_PASSWORD);
		createEAttribute(tcaConfigurationEClass, TCA_CONFIGURATION__SUBSCRIBER_CONTENT_TYPE);
		createEAttribute(tcaConfigurationEClass, TCA_CONFIGURATION__SUBSCRIBER_CONSUMER_ID);
		createEAttribute(tcaConfigurationEClass, TCA_CONFIGURATION__SUBSCRIBER_CONSUMER_GROUP);
		createEAttribute(tcaConfigurationEClass, TCA_CONFIGURATION__SUBSCRIBER_TIMEOUT_MS);
		createEAttribute(tcaConfigurationEClass, TCA_CONFIGURATION__SUBSCRIBER_MESSAGE_LIMIT);
		createEAttribute(tcaConfigurationEClass, TCA_CONFIGURATION__SUBSCRIBER_POLLING_INTERVAL);
		createEAttribute(tcaConfigurationEClass, TCA_CONFIGURATION__PUBLISHER_HOST_NAME);
		createEAttribute(tcaConfigurationEClass, TCA_CONFIGURATION__PUBLISHER_HOST_PORT);
		createEAttribute(tcaConfigurationEClass, TCA_CONFIGURATION__PUBLISHER_TOPIC_NAME);
		createEAttribute(tcaConfigurationEClass, TCA_CONFIGURATION__PUBLISHER_PROTOCOL);
		createEAttribute(tcaConfigurationEClass, TCA_CONFIGURATION__PUBLISHER_USER_NAME);
		createEAttribute(tcaConfigurationEClass, TCA_CONFIGURATION__PUBLISHER_USER_PASSWORD);
		createEAttribute(tcaConfigurationEClass, TCA_CONFIGURATION__PUBLISHER_CONTENT_TYPE);
		createEAttribute(tcaConfigurationEClass, TCA_CONFIGURATION__PUBLISHER_MAX_BATCH_SIZE);
		createEAttribute(tcaConfigurationEClass, TCA_CONFIGURATION__PUBLISHER_MAX_RECOVERY_QUEUE_SIZE);
		createEAttribute(tcaConfigurationEClass, TCA_CONFIGURATION__PUBLISHER_POLLING_INTERVAL);
		createEReference(tcaConfigurationEClass, TCA_CONFIGURATION__METRICS_PER_FUNCTIONAL_ROLE);

		tcaMetricsEClass = createEClass(TCA_METRICS);
		createEAttribute(tcaMetricsEClass, TCA_METRICS__FUNCTIONAL_ROLE);
		createEReference(tcaMetricsEClass, TCA_METRICS__THRESHOLDS);

		tcaThresholdEClass = createEClass(TCA_THRESHOLD);
		createEAttribute(tcaThresholdEClass, TCA_THRESHOLD__CLOSED_LOOP_CONTROL_NAME);
		createEAttribute(tcaThresholdEClass, TCA_THRESHOLD__VERSION);
		createEAttribute(tcaThresholdEClass, TCA_THRESHOLD__FIELD_PATH);
		createEAttribute(tcaThresholdEClass, TCA_THRESHOLD__THRESHOLD_VALUE);
		createEAttribute(tcaThresholdEClass, TCA_THRESHOLD__DIRECTION);
		createEAttribute(tcaThresholdEClass, TCA_THRESHOLD__SEVERITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CdapPackage theCdapPackage = (CdapPackage)EPackage.Registry.INSTANCE.getEPackage(CdapPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tcaConfigurationEClass.getESuperTypes().add(theCdapPackage.getCdapServiceInstanceConfiguration());
		tcaMetricsEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		tcaMetricsEClass.getESuperTypes().add(theServicePackage.getDcaePolicyEntity());
		tcaThresholdEClass.getESuperTypes().add(theCorePackage.getNamedEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(tcaConfigurationEClass, TcaConfiguration.class, "TcaConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTcaConfiguration_Domain(), theEcorePackage.getEString(), "domain", null, 0, 1, TcaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaConfiguration_SubscriberHostName(), theEcorePackage.getEString(), "subscriberHostName", null, 0, 1, TcaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaConfiguration_SubscriberHostPort(), theEcorePackage.getEString(), "subscriberHostPort", null, 0, 1, TcaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaConfiguration_SubscriberTopicName(), theEcorePackage.getEString(), "subscriberTopicName", null, 0, 1, TcaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaConfiguration_SubscriberProtocol(), theEcorePackage.getEString(), "subscriberProtocol", null, 0, 1, TcaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaConfiguration_SubscriberUserName(), theEcorePackage.getEString(), "subscriberUserName", null, 0, 1, TcaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaConfiguration_SubscriberUserPassword(), theEcorePackage.getEString(), "subscriberUserPassword", null, 0, 1, TcaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaConfiguration_SubscriberContentType(), theEcorePackage.getEString(), "subscriberContentType", null, 0, 1, TcaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaConfiguration_SubscriberConsumerId(), theEcorePackage.getEString(), "subscriberConsumerId", null, 0, 1, TcaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaConfiguration_SubscriberConsumerGroup(), theEcorePackage.getEString(), "subscriberConsumerGroup", null, 0, 1, TcaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaConfiguration_SubscriberTimeoutMS(), theEcorePackage.getEString(), "subscriberTimeoutMS", null, 0, 1, TcaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaConfiguration_SubscriberMessageLimit(), theEcorePackage.getEString(), "subscriberMessageLimit", null, 0, 1, TcaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaConfiguration_SubscriberPollingInterval(), theEcorePackage.getEString(), "subscriberPollingInterval", null, 0, 1, TcaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaConfiguration_PublisherHostName(), theEcorePackage.getEString(), "publisherHostName", null, 0, 1, TcaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaConfiguration_PublisherHostPort(), theEcorePackage.getEString(), "publisherHostPort", null, 0, 1, TcaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaConfiguration_PublisherTopicName(), theEcorePackage.getEString(), "publisherTopicName", null, 0, 1, TcaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaConfiguration_PublisherProtocol(), theEcorePackage.getEString(), "publisherProtocol", null, 0, 1, TcaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaConfiguration_PublisherUserName(), theEcorePackage.getEString(), "publisherUserName", null, 0, 1, TcaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaConfiguration_PublisherUserPassword(), theEcorePackage.getEString(), "publisherUserPassword", null, 0, 1, TcaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaConfiguration_PublisherContentType(), theEcorePackage.getEString(), "publisherContentType", null, 0, 1, TcaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaConfiguration_PublisherMaxBatchSize(), theEcorePackage.getEString(), "publisherMaxBatchSize", null, 0, 1, TcaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaConfiguration_PublisherMaxRecoveryQueueSize(), theEcorePackage.getEString(), "publisherMaxRecoveryQueueSize", null, 0, 1, TcaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaConfiguration_PublisherPollingInterval(), theEcorePackage.getEString(), "publisherPollingInterval", null, 0, 1, TcaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTcaConfiguration_MetricsPerFunctionalRole(), this.getTcaMetrics(), null, "metricsPerFunctionalRole", null, 0, -1, TcaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcaMetricsEClass, TcaMetrics.class, "TcaMetrics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTcaMetrics_FunctionalRole(), theEcorePackage.getEString(), "functionalRole", null, 0, 1, TcaMetrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTcaMetrics_Thresholds(), this.getTcaThreshold(), null, "thresholds", null, 0, -1, TcaMetrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tcaThresholdEClass, TcaThreshold.class, "TcaThreshold", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTcaThreshold_ClosedLoopControlName(), theEcorePackage.getEString(), "closedLoopControlName", null, 0, 1, TcaThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaThreshold_Version(), theEcorePackage.getEString(), "version", null, 0, 1, TcaThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaThreshold_FieldPath(), theEcorePackage.getEString(), "fieldPath", null, 0, 1, TcaThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaThreshold_ThresholdValue(), theEcorePackage.getEIntegerObject(), "thresholdValue", null, 0, 1, TcaThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaThreshold_Direction(), theEcorePackage.getEString(), "direction", null, 0, 1, TcaThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTcaThreshold_Severity(), theEcorePackage.getEString(), "severity", null, 0, 1, TcaThreshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2011/Xcore
		createXcoreAnnotations();
		// http://openecomp.org
		createEcompAnnotations();
		// http://openecomp.org/cdap
		createCdapAnnotations();
		// http://openecomp.org/policy
		createPolicyAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2011/Xcore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createXcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2011/Xcore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "cdap", "http://openecomp.org/cdap",
			 "ecomp", "http://openecomp.org",
			 "policy", "http://openecomp.org/policy"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://openecomp.org/cdap</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCdapAnnotations() {
		String source = "http://openecomp.org/cdap";	
		addAnnotation
		  (getTcaConfiguration_Domain(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:domain"
		   });	
		addAnnotation
		  (getTcaConfiguration_SubscriberHostName(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:subscriberHostName"
		   });	
		addAnnotation
		  (getTcaConfiguration_SubscriberHostPort(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:subscriberHostPort"
		   });	
		addAnnotation
		  (getTcaConfiguration_SubscriberTopicName(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:subscriberTopicName"
		   });	
		addAnnotation
		  (getTcaConfiguration_SubscriberProtocol(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:subscriberProtocol"
		   });	
		addAnnotation
		  (getTcaConfiguration_SubscriberUserName(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:subscriberUserName"
		   });	
		addAnnotation
		  (getTcaConfiguration_SubscriberUserPassword(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:subscriberUserPassword"
		   });	
		addAnnotation
		  (getTcaConfiguration_SubscriberContentType(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:subscriberContentType"
		   });	
		addAnnotation
		  (getTcaConfiguration_SubscriberConsumerId(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:subscriberConsumerId"
		   });	
		addAnnotation
		  (getTcaConfiguration_SubscriberConsumerGroup(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:subscriberConsumerGroup"
		   });	
		addAnnotation
		  (getTcaConfiguration_SubscriberTimeoutMS(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:subscriberTimeoutMS"
		   });	
		addAnnotation
		  (getTcaConfiguration_SubscriberMessageLimit(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:subscriberMessageLimit"
		   });	
		addAnnotation
		  (getTcaConfiguration_SubscriberPollingInterval(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:subscriberPollingInterval"
		   });	
		addAnnotation
		  (getTcaConfiguration_PublisherHostName(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:publisherHostName"
		   });	
		addAnnotation
		  (getTcaConfiguration_PublisherHostPort(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:publisherHostPort"
		   });	
		addAnnotation
		  (getTcaConfiguration_PublisherTopicName(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:publisherTopicName"
		   });	
		addAnnotation
		  (getTcaConfiguration_PublisherProtocol(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:publisherProtocol"
		   });	
		addAnnotation
		  (getTcaConfiguration_PublisherUserName(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:publisherUserName"
		   });	
		addAnnotation
		  (getTcaConfiguration_PublisherUserPassword(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:publisherUserPassword"
		   });	
		addAnnotation
		  (getTcaConfiguration_PublisherContentType(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:publisherContentType"
		   });	
		addAnnotation
		  (getTcaConfiguration_PublisherMaxBatchSize(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:publisherMaxBatchSize"
		   });	
		addAnnotation
		  (getTcaConfiguration_PublisherMaxRecoveryQueueSize(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:publisherMaxRecoveryQueueSize"
		   });	
		addAnnotation
		  (getTcaConfiguration_PublisherPollingInterval(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:publisherPollingInterval"
		   });	
		addAnnotation
		  (getTcaMetrics_FunctionalRole(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:${path}.policy.functionalRole"
		   });	
		addAnnotation
		  (getTcaThreshold_ClosedLoopControlName(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:${path}.policy.closedLoopControlName"
		   });	
		addAnnotation
		  (getTcaThreshold_Version(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:${path}.policy.version"
		   });	
		addAnnotation
		  (getTcaThreshold_FieldPath(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:${path}.policy.fieldPath"
		   });	
		addAnnotation
		  (getTcaThreshold_ThresholdValue(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:${path}.policy.thresholdValue"
		   });	
		addAnnotation
		  (getTcaThreshold_Direction(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:${path}.policy.direction"
		   });	
		addAnnotation
		  (getTcaThreshold_Severity(), 
		   source, 
		   new String[] {
			 "destination", "namespace-prefs:cdap-tca:${path}.policy.severity"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://openecomp.org</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcompAnnotations() {
		String source = "http://openecomp.org";	
		addAnnotation
		  (getTcaConfiguration_Domain(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaConfiguration_SubscriberHostName(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaConfiguration_SubscriberHostPort(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaConfiguration_SubscriberTopicName(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaConfiguration_SubscriberProtocol(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaConfiguration_SubscriberUserName(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaConfiguration_SubscriberUserPassword(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaConfiguration_SubscriberContentType(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaConfiguration_SubscriberConsumerId(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaConfiguration_SubscriberConsumerGroup(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaConfiguration_SubscriberTimeoutMS(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaConfiguration_SubscriberMessageLimit(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaConfiguration_SubscriberPollingInterval(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaConfiguration_PublisherHostName(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaConfiguration_PublisherHostPort(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaConfiguration_PublisherTopicName(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaConfiguration_PublisherProtocol(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaConfiguration_PublisherUserName(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaConfiguration_PublisherUserPassword(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaConfiguration_PublisherContentType(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaConfiguration_PublisherMaxBatchSize(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaConfiguration_PublisherMaxRecoveryQueueSize(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaConfiguration_PublisherPollingInterval(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (tcaMetricsEClass, 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaMetrics_FunctionalRole(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaMetrics_Thresholds(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (tcaThresholdEClass, 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaThreshold_ClosedLoopControlName(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaThreshold_Version(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaThreshold_FieldPath(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaThreshold_ThresholdValue(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaThreshold_Direction(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });	
		addAnnotation
		  (getTcaThreshold_Severity(), 
		   source, 
		   new String[] {
			 "type", "configuration"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://openecomp.org/policy</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPolicyAnnotations() {
		String source = "http://openecomp.org/policy";	
		addAnnotation
		  (tcaMetricsEClass, 
		   source, 
		   new String[] {
			 "policyTemplate", "dcae-microservice",
			 "dcaeService", "tca"
		   });
	}

} //CommonPackageImpl
