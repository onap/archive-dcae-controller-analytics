
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
import org.openecomp.dcae.analytics.cdap.common.TcaConfiguration;
import org.openecomp.dcae.analytics.cdap.common.TcaMetrics;

import org.openecomp.dcae.controller.service.cdap.impl.CdapServiceInstanceConfigurationImpl;

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
 * An implementation of the model object '<em><b>Tca Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl#getSubscriberHostName <em>Subscriber Host Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl#getSubscriberHostPort <em>Subscriber Host Port</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl#getSubscriberTopicName <em>Subscriber Topic Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl#getSubscriberProtocol <em>Subscriber Protocol</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl#getSubscriberUserName <em>Subscriber User Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl#getSubscriberUserPassword <em>Subscriber User Password</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl#getSubscriberContentType <em>Subscriber Content Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl#getSubscriberConsumerId <em>Subscriber Consumer Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl#getSubscriberConsumerGroup <em>Subscriber Consumer Group</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl#getSubscriberTimeoutMS <em>Subscriber Timeout MS</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl#getSubscriberMessageLimit <em>Subscriber Message Limit</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl#getSubscriberPollingInterval <em>Subscriber Polling Interval</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl#getPublisherHostName <em>Publisher Host Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl#getPublisherHostPort <em>Publisher Host Port</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl#getPublisherTopicName <em>Publisher Topic Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl#getPublisherProtocol <em>Publisher Protocol</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl#getPublisherUserName <em>Publisher User Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl#getPublisherUserPassword <em>Publisher User Password</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl#getPublisherContentType <em>Publisher Content Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl#getPublisherMaxBatchSize <em>Publisher Max Batch Size</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl#getPublisherMaxRecoveryQueueSize <em>Publisher Max Recovery Queue Size</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl#getPublisherPollingInterval <em>Publisher Polling Interval</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.impl.TcaConfigurationImpl#getMetricsPerFunctionalRole <em>Metrics Per Functional Role</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TcaConfigurationImpl extends CdapServiceInstanceConfigurationImpl implements TcaConfiguration {
	/**
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected String domain = DOMAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriberHostName() <em>Subscriber Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberHostName()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIBER_HOST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriberHostName() <em>Subscriber Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberHostName()
	 * @generated
	 * @ordered
	 */
	protected String subscriberHostName = SUBSCRIBER_HOST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriberHostPort() <em>Subscriber Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberHostPort()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIBER_HOST_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriberHostPort() <em>Subscriber Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberHostPort()
	 * @generated
	 * @ordered
	 */
	protected String subscriberHostPort = SUBSCRIBER_HOST_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriberTopicName() <em>Subscriber Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberTopicName()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIBER_TOPIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriberTopicName() <em>Subscriber Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberTopicName()
	 * @generated
	 * @ordered
	 */
	protected String subscriberTopicName = SUBSCRIBER_TOPIC_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriberProtocol() <em>Subscriber Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIBER_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriberProtocol() <em>Subscriber Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberProtocol()
	 * @generated
	 * @ordered
	 */
	protected String subscriberProtocol = SUBSCRIBER_PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriberUserName() <em>Subscriber User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIBER_USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriberUserName() <em>Subscriber User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberUserName()
	 * @generated
	 * @ordered
	 */
	protected String subscriberUserName = SUBSCRIBER_USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriberUserPassword() <em>Subscriber User Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberUserPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIBER_USER_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriberUserPassword() <em>Subscriber User Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberUserPassword()
	 * @generated
	 * @ordered
	 */
	protected String subscriberUserPassword = SUBSCRIBER_USER_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriberContentType() <em>Subscriber Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIBER_CONTENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriberContentType() <em>Subscriber Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberContentType()
	 * @generated
	 * @ordered
	 */
	protected String subscriberContentType = SUBSCRIBER_CONTENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriberConsumerId() <em>Subscriber Consumer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberConsumerId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIBER_CONSUMER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriberConsumerId() <em>Subscriber Consumer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberConsumerId()
	 * @generated
	 * @ordered
	 */
	protected String subscriberConsumerId = SUBSCRIBER_CONSUMER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriberConsumerGroup() <em>Subscriber Consumer Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberConsumerGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIBER_CONSUMER_GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriberConsumerGroup() <em>Subscriber Consumer Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberConsumerGroup()
	 * @generated
	 * @ordered
	 */
	protected String subscriberConsumerGroup = SUBSCRIBER_CONSUMER_GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriberTimeoutMS() <em>Subscriber Timeout MS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberTimeoutMS()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIBER_TIMEOUT_MS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriberTimeoutMS() <em>Subscriber Timeout MS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberTimeoutMS()
	 * @generated
	 * @ordered
	 */
	protected String subscriberTimeoutMS = SUBSCRIBER_TIMEOUT_MS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriberMessageLimit() <em>Subscriber Message Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberMessageLimit()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIBER_MESSAGE_LIMIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriberMessageLimit() <em>Subscriber Message Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberMessageLimit()
	 * @generated
	 * @ordered
	 */
	protected String subscriberMessageLimit = SUBSCRIBER_MESSAGE_LIMIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubscriberPollingInterval() <em>Subscriber Polling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberPollingInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBSCRIBER_POLLING_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubscriberPollingInterval() <em>Subscriber Polling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriberPollingInterval()
	 * @generated
	 * @ordered
	 */
	protected String subscriberPollingInterval = SUBSCRIBER_POLLING_INTERVAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublisherHostName() <em>Publisher Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherHostName()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHER_HOST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublisherHostName() <em>Publisher Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherHostName()
	 * @generated
	 * @ordered
	 */
	protected String publisherHostName = PUBLISHER_HOST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublisherHostPort() <em>Publisher Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherHostPort()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHER_HOST_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublisherHostPort() <em>Publisher Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherHostPort()
	 * @generated
	 * @ordered
	 */
	protected String publisherHostPort = PUBLISHER_HOST_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublisherTopicName() <em>Publisher Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherTopicName()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHER_TOPIC_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublisherTopicName() <em>Publisher Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherTopicName()
	 * @generated
	 * @ordered
	 */
	protected String publisherTopicName = PUBLISHER_TOPIC_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublisherProtocol() <em>Publisher Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHER_PROTOCOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublisherProtocol() <em>Publisher Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherProtocol()
	 * @generated
	 * @ordered
	 */
	protected String publisherProtocol = PUBLISHER_PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublisherUserName() <em>Publisher User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHER_USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublisherUserName() <em>Publisher User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherUserName()
	 * @generated
	 * @ordered
	 */
	protected String publisherUserName = PUBLISHER_USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublisherUserPassword() <em>Publisher User Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherUserPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHER_USER_PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublisherUserPassword() <em>Publisher User Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherUserPassword()
	 * @generated
	 * @ordered
	 */
	protected String publisherUserPassword = PUBLISHER_USER_PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublisherContentType() <em>Publisher Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherContentType()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHER_CONTENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublisherContentType() <em>Publisher Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherContentType()
	 * @generated
	 * @ordered
	 */
	protected String publisherContentType = PUBLISHER_CONTENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublisherMaxBatchSize() <em>Publisher Max Batch Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherMaxBatchSize()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHER_MAX_BATCH_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublisherMaxBatchSize() <em>Publisher Max Batch Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherMaxBatchSize()
	 * @generated
	 * @ordered
	 */
	protected String publisherMaxBatchSize = PUBLISHER_MAX_BATCH_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublisherMaxRecoveryQueueSize() <em>Publisher Max Recovery Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherMaxRecoveryQueueSize()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHER_MAX_RECOVERY_QUEUE_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublisherMaxRecoveryQueueSize() <em>Publisher Max Recovery Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherMaxRecoveryQueueSize()
	 * @generated
	 * @ordered
	 */
	protected String publisherMaxRecoveryQueueSize = PUBLISHER_MAX_RECOVERY_QUEUE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublisherPollingInterval() <em>Publisher Polling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherPollingInterval()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHER_POLLING_INTERVAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublisherPollingInterval() <em>Publisher Polling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherPollingInterval()
	 * @generated
	 * @ordered
	 */
	protected String publisherPollingInterval = PUBLISHER_POLLING_INTERVAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetricsPerFunctionalRole() <em>Metrics Per Functional Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetricsPerFunctionalRole()
	 * @generated
	 * @ordered
	 */
	protected EList<TcaMetrics> metricsPerFunctionalRole;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TcaConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommonPackage.Literals.TCA_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(String newDomain) {
		String oldDomain = domain;
		domain = newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_CONFIGURATION__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubscriberHostName() {
		return subscriberHostName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriberHostName(String newSubscriberHostName) {
		String oldSubscriberHostName = subscriberHostName;
		subscriberHostName = newSubscriberHostName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_HOST_NAME, oldSubscriberHostName, subscriberHostName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubscriberHostPort() {
		return subscriberHostPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriberHostPort(String newSubscriberHostPort) {
		String oldSubscriberHostPort = subscriberHostPort;
		subscriberHostPort = newSubscriberHostPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_HOST_PORT, oldSubscriberHostPort, subscriberHostPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubscriberTopicName() {
		return subscriberTopicName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriberTopicName(String newSubscriberTopicName) {
		String oldSubscriberTopicName = subscriberTopicName;
		subscriberTopicName = newSubscriberTopicName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_TOPIC_NAME, oldSubscriberTopicName, subscriberTopicName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubscriberProtocol() {
		return subscriberProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriberProtocol(String newSubscriberProtocol) {
		String oldSubscriberProtocol = subscriberProtocol;
		subscriberProtocol = newSubscriberProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_PROTOCOL, oldSubscriberProtocol, subscriberProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubscriberUserName() {
		return subscriberUserName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriberUserName(String newSubscriberUserName) {
		String oldSubscriberUserName = subscriberUserName;
		subscriberUserName = newSubscriberUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_USER_NAME, oldSubscriberUserName, subscriberUserName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubscriberUserPassword() {
		return subscriberUserPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriberUserPassword(String newSubscriberUserPassword) {
		String oldSubscriberUserPassword = subscriberUserPassword;
		subscriberUserPassword = newSubscriberUserPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_USER_PASSWORD, oldSubscriberUserPassword, subscriberUserPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubscriberContentType() {
		return subscriberContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriberContentType(String newSubscriberContentType) {
		String oldSubscriberContentType = subscriberContentType;
		subscriberContentType = newSubscriberContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_CONTENT_TYPE, oldSubscriberContentType, subscriberContentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubscriberConsumerId() {
		return subscriberConsumerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriberConsumerId(String newSubscriberConsumerId) {
		String oldSubscriberConsumerId = subscriberConsumerId;
		subscriberConsumerId = newSubscriberConsumerId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_CONSUMER_ID, oldSubscriberConsumerId, subscriberConsumerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubscriberConsumerGroup() {
		return subscriberConsumerGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriberConsumerGroup(String newSubscriberConsumerGroup) {
		String oldSubscriberConsumerGroup = subscriberConsumerGroup;
		subscriberConsumerGroup = newSubscriberConsumerGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_CONSUMER_GROUP, oldSubscriberConsumerGroup, subscriberConsumerGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubscriberTimeoutMS() {
		return subscriberTimeoutMS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriberTimeoutMS(String newSubscriberTimeoutMS) {
		String oldSubscriberTimeoutMS = subscriberTimeoutMS;
		subscriberTimeoutMS = newSubscriberTimeoutMS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_TIMEOUT_MS, oldSubscriberTimeoutMS, subscriberTimeoutMS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubscriberMessageLimit() {
		return subscriberMessageLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriberMessageLimit(String newSubscriberMessageLimit) {
		String oldSubscriberMessageLimit = subscriberMessageLimit;
		subscriberMessageLimit = newSubscriberMessageLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_MESSAGE_LIMIT, oldSubscriberMessageLimit, subscriberMessageLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubscriberPollingInterval() {
		return subscriberPollingInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriberPollingInterval(String newSubscriberPollingInterval) {
		String oldSubscriberPollingInterval = subscriberPollingInterval;
		subscriberPollingInterval = newSubscriberPollingInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_POLLING_INTERVAL, oldSubscriberPollingInterval, subscriberPollingInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublisherHostName() {
		return publisherHostName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisherHostName(String newPublisherHostName) {
		String oldPublisherHostName = publisherHostName;
		publisherHostName = newPublisherHostName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_CONFIGURATION__PUBLISHER_HOST_NAME, oldPublisherHostName, publisherHostName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublisherHostPort() {
		return publisherHostPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisherHostPort(String newPublisherHostPort) {
		String oldPublisherHostPort = publisherHostPort;
		publisherHostPort = newPublisherHostPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_CONFIGURATION__PUBLISHER_HOST_PORT, oldPublisherHostPort, publisherHostPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublisherTopicName() {
		return publisherTopicName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisherTopicName(String newPublisherTopicName) {
		String oldPublisherTopicName = publisherTopicName;
		publisherTopicName = newPublisherTopicName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_CONFIGURATION__PUBLISHER_TOPIC_NAME, oldPublisherTopicName, publisherTopicName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublisherProtocol() {
		return publisherProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisherProtocol(String newPublisherProtocol) {
		String oldPublisherProtocol = publisherProtocol;
		publisherProtocol = newPublisherProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_CONFIGURATION__PUBLISHER_PROTOCOL, oldPublisherProtocol, publisherProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublisherUserName() {
		return publisherUserName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisherUserName(String newPublisherUserName) {
		String oldPublisherUserName = publisherUserName;
		publisherUserName = newPublisherUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_CONFIGURATION__PUBLISHER_USER_NAME, oldPublisherUserName, publisherUserName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublisherUserPassword() {
		return publisherUserPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisherUserPassword(String newPublisherUserPassword) {
		String oldPublisherUserPassword = publisherUserPassword;
		publisherUserPassword = newPublisherUserPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_CONFIGURATION__PUBLISHER_USER_PASSWORD, oldPublisherUserPassword, publisherUserPassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublisherContentType() {
		return publisherContentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisherContentType(String newPublisherContentType) {
		String oldPublisherContentType = publisherContentType;
		publisherContentType = newPublisherContentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_CONFIGURATION__PUBLISHER_CONTENT_TYPE, oldPublisherContentType, publisherContentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublisherMaxBatchSize() {
		return publisherMaxBatchSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisherMaxBatchSize(String newPublisherMaxBatchSize) {
		String oldPublisherMaxBatchSize = publisherMaxBatchSize;
		publisherMaxBatchSize = newPublisherMaxBatchSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_CONFIGURATION__PUBLISHER_MAX_BATCH_SIZE, oldPublisherMaxBatchSize, publisherMaxBatchSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublisherMaxRecoveryQueueSize() {
		return publisherMaxRecoveryQueueSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisherMaxRecoveryQueueSize(String newPublisherMaxRecoveryQueueSize) {
		String oldPublisherMaxRecoveryQueueSize = publisherMaxRecoveryQueueSize;
		publisherMaxRecoveryQueueSize = newPublisherMaxRecoveryQueueSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_CONFIGURATION__PUBLISHER_MAX_RECOVERY_QUEUE_SIZE, oldPublisherMaxRecoveryQueueSize, publisherMaxRecoveryQueueSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublisherPollingInterval() {
		return publisherPollingInterval;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisherPollingInterval(String newPublisherPollingInterval) {
		String oldPublisherPollingInterval = publisherPollingInterval;
		publisherPollingInterval = newPublisherPollingInterval;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CommonPackage.TCA_CONFIGURATION__PUBLISHER_POLLING_INTERVAL, oldPublisherPollingInterval, publisherPollingInterval));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TcaMetrics> getMetricsPerFunctionalRole() {
		if (metricsPerFunctionalRole == null) {
			metricsPerFunctionalRole = new EObjectContainmentEList<TcaMetrics>(TcaMetrics.class, this, CommonPackage.TCA_CONFIGURATION__METRICS_PER_FUNCTIONAL_ROLE);
		}
		return metricsPerFunctionalRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CommonPackage.TCA_CONFIGURATION__METRICS_PER_FUNCTIONAL_ROLE:
				return ((InternalEList<?>)getMetricsPerFunctionalRole()).basicRemove(otherEnd, msgs);
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
			case CommonPackage.TCA_CONFIGURATION__DOMAIN:
				return getDomain();
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_HOST_NAME:
				return getSubscriberHostName();
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_HOST_PORT:
				return getSubscriberHostPort();
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_TOPIC_NAME:
				return getSubscriberTopicName();
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_PROTOCOL:
				return getSubscriberProtocol();
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_USER_NAME:
				return getSubscriberUserName();
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_USER_PASSWORD:
				return getSubscriberUserPassword();
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_CONTENT_TYPE:
				return getSubscriberContentType();
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_CONSUMER_ID:
				return getSubscriberConsumerId();
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_CONSUMER_GROUP:
				return getSubscriberConsumerGroup();
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_TIMEOUT_MS:
				return getSubscriberTimeoutMS();
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_MESSAGE_LIMIT:
				return getSubscriberMessageLimit();
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_POLLING_INTERVAL:
				return getSubscriberPollingInterval();
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_HOST_NAME:
				return getPublisherHostName();
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_HOST_PORT:
				return getPublisherHostPort();
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_TOPIC_NAME:
				return getPublisherTopicName();
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_PROTOCOL:
				return getPublisherProtocol();
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_USER_NAME:
				return getPublisherUserName();
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_USER_PASSWORD:
				return getPublisherUserPassword();
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_CONTENT_TYPE:
				return getPublisherContentType();
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_MAX_BATCH_SIZE:
				return getPublisherMaxBatchSize();
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_MAX_RECOVERY_QUEUE_SIZE:
				return getPublisherMaxRecoveryQueueSize();
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_POLLING_INTERVAL:
				return getPublisherPollingInterval();
			case CommonPackage.TCA_CONFIGURATION__METRICS_PER_FUNCTIONAL_ROLE:
				return getMetricsPerFunctionalRole();
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
			case CommonPackage.TCA_CONFIGURATION__DOMAIN:
				setDomain((String)newValue);
				return;
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_HOST_NAME:
				setSubscriberHostName((String)newValue);
				return;
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_HOST_PORT:
				setSubscriberHostPort((String)newValue);
				return;
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_TOPIC_NAME:
				setSubscriberTopicName((String)newValue);
				return;
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_PROTOCOL:
				setSubscriberProtocol((String)newValue);
				return;
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_USER_NAME:
				setSubscriberUserName((String)newValue);
				return;
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_USER_PASSWORD:
				setSubscriberUserPassword((String)newValue);
				return;
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_CONTENT_TYPE:
				setSubscriberContentType((String)newValue);
				return;
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_CONSUMER_ID:
				setSubscriberConsumerId((String)newValue);
				return;
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_CONSUMER_GROUP:
				setSubscriberConsumerGroup((String)newValue);
				return;
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_TIMEOUT_MS:
				setSubscriberTimeoutMS((String)newValue);
				return;
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_MESSAGE_LIMIT:
				setSubscriberMessageLimit((String)newValue);
				return;
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_POLLING_INTERVAL:
				setSubscriberPollingInterval((String)newValue);
				return;
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_HOST_NAME:
				setPublisherHostName((String)newValue);
				return;
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_HOST_PORT:
				setPublisherHostPort((String)newValue);
				return;
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_TOPIC_NAME:
				setPublisherTopicName((String)newValue);
				return;
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_PROTOCOL:
				setPublisherProtocol((String)newValue);
				return;
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_USER_NAME:
				setPublisherUserName((String)newValue);
				return;
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_USER_PASSWORD:
				setPublisherUserPassword((String)newValue);
				return;
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_CONTENT_TYPE:
				setPublisherContentType((String)newValue);
				return;
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_MAX_BATCH_SIZE:
				setPublisherMaxBatchSize((String)newValue);
				return;
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_MAX_RECOVERY_QUEUE_SIZE:
				setPublisherMaxRecoveryQueueSize((String)newValue);
				return;
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_POLLING_INTERVAL:
				setPublisherPollingInterval((String)newValue);
				return;
			case CommonPackage.TCA_CONFIGURATION__METRICS_PER_FUNCTIONAL_ROLE:
				getMetricsPerFunctionalRole().clear();
				getMetricsPerFunctionalRole().addAll((Collection<? extends TcaMetrics>)newValue);
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
			case CommonPackage.TCA_CONFIGURATION__DOMAIN:
				setDomain(DOMAIN_EDEFAULT);
				return;
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_HOST_NAME:
				setSubscriberHostName(SUBSCRIBER_HOST_NAME_EDEFAULT);
				return;
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_HOST_PORT:
				setSubscriberHostPort(SUBSCRIBER_HOST_PORT_EDEFAULT);
				return;
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_TOPIC_NAME:
				setSubscriberTopicName(SUBSCRIBER_TOPIC_NAME_EDEFAULT);
				return;
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_PROTOCOL:
				setSubscriberProtocol(SUBSCRIBER_PROTOCOL_EDEFAULT);
				return;
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_USER_NAME:
				setSubscriberUserName(SUBSCRIBER_USER_NAME_EDEFAULT);
				return;
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_USER_PASSWORD:
				setSubscriberUserPassword(SUBSCRIBER_USER_PASSWORD_EDEFAULT);
				return;
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_CONTENT_TYPE:
				setSubscriberContentType(SUBSCRIBER_CONTENT_TYPE_EDEFAULT);
				return;
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_CONSUMER_ID:
				setSubscriberConsumerId(SUBSCRIBER_CONSUMER_ID_EDEFAULT);
				return;
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_CONSUMER_GROUP:
				setSubscriberConsumerGroup(SUBSCRIBER_CONSUMER_GROUP_EDEFAULT);
				return;
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_TIMEOUT_MS:
				setSubscriberTimeoutMS(SUBSCRIBER_TIMEOUT_MS_EDEFAULT);
				return;
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_MESSAGE_LIMIT:
				setSubscriberMessageLimit(SUBSCRIBER_MESSAGE_LIMIT_EDEFAULT);
				return;
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_POLLING_INTERVAL:
				setSubscriberPollingInterval(SUBSCRIBER_POLLING_INTERVAL_EDEFAULT);
				return;
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_HOST_NAME:
				setPublisherHostName(PUBLISHER_HOST_NAME_EDEFAULT);
				return;
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_HOST_PORT:
				setPublisherHostPort(PUBLISHER_HOST_PORT_EDEFAULT);
				return;
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_TOPIC_NAME:
				setPublisherTopicName(PUBLISHER_TOPIC_NAME_EDEFAULT);
				return;
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_PROTOCOL:
				setPublisherProtocol(PUBLISHER_PROTOCOL_EDEFAULT);
				return;
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_USER_NAME:
				setPublisherUserName(PUBLISHER_USER_NAME_EDEFAULT);
				return;
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_USER_PASSWORD:
				setPublisherUserPassword(PUBLISHER_USER_PASSWORD_EDEFAULT);
				return;
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_CONTENT_TYPE:
				setPublisherContentType(PUBLISHER_CONTENT_TYPE_EDEFAULT);
				return;
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_MAX_BATCH_SIZE:
				setPublisherMaxBatchSize(PUBLISHER_MAX_BATCH_SIZE_EDEFAULT);
				return;
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_MAX_RECOVERY_QUEUE_SIZE:
				setPublisherMaxRecoveryQueueSize(PUBLISHER_MAX_RECOVERY_QUEUE_SIZE_EDEFAULT);
				return;
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_POLLING_INTERVAL:
				setPublisherPollingInterval(PUBLISHER_POLLING_INTERVAL_EDEFAULT);
				return;
			case CommonPackage.TCA_CONFIGURATION__METRICS_PER_FUNCTIONAL_ROLE:
				getMetricsPerFunctionalRole().clear();
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
			case CommonPackage.TCA_CONFIGURATION__DOMAIN:
				return DOMAIN_EDEFAULT == null ? domain != null : !DOMAIN_EDEFAULT.equals(domain);
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_HOST_NAME:
				return SUBSCRIBER_HOST_NAME_EDEFAULT == null ? subscriberHostName != null : !SUBSCRIBER_HOST_NAME_EDEFAULT.equals(subscriberHostName);
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_HOST_PORT:
				return SUBSCRIBER_HOST_PORT_EDEFAULT == null ? subscriberHostPort != null : !SUBSCRIBER_HOST_PORT_EDEFAULT.equals(subscriberHostPort);
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_TOPIC_NAME:
				return SUBSCRIBER_TOPIC_NAME_EDEFAULT == null ? subscriberTopicName != null : !SUBSCRIBER_TOPIC_NAME_EDEFAULT.equals(subscriberTopicName);
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_PROTOCOL:
				return SUBSCRIBER_PROTOCOL_EDEFAULT == null ? subscriberProtocol != null : !SUBSCRIBER_PROTOCOL_EDEFAULT.equals(subscriberProtocol);
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_USER_NAME:
				return SUBSCRIBER_USER_NAME_EDEFAULT == null ? subscriberUserName != null : !SUBSCRIBER_USER_NAME_EDEFAULT.equals(subscriberUserName);
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_USER_PASSWORD:
				return SUBSCRIBER_USER_PASSWORD_EDEFAULT == null ? subscriberUserPassword != null : !SUBSCRIBER_USER_PASSWORD_EDEFAULT.equals(subscriberUserPassword);
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_CONTENT_TYPE:
				return SUBSCRIBER_CONTENT_TYPE_EDEFAULT == null ? subscriberContentType != null : !SUBSCRIBER_CONTENT_TYPE_EDEFAULT.equals(subscriberContentType);
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_CONSUMER_ID:
				return SUBSCRIBER_CONSUMER_ID_EDEFAULT == null ? subscriberConsumerId != null : !SUBSCRIBER_CONSUMER_ID_EDEFAULT.equals(subscriberConsumerId);
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_CONSUMER_GROUP:
				return SUBSCRIBER_CONSUMER_GROUP_EDEFAULT == null ? subscriberConsumerGroup != null : !SUBSCRIBER_CONSUMER_GROUP_EDEFAULT.equals(subscriberConsumerGroup);
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_TIMEOUT_MS:
				return SUBSCRIBER_TIMEOUT_MS_EDEFAULT == null ? subscriberTimeoutMS != null : !SUBSCRIBER_TIMEOUT_MS_EDEFAULT.equals(subscriberTimeoutMS);
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_MESSAGE_LIMIT:
				return SUBSCRIBER_MESSAGE_LIMIT_EDEFAULT == null ? subscriberMessageLimit != null : !SUBSCRIBER_MESSAGE_LIMIT_EDEFAULT.equals(subscriberMessageLimit);
			case CommonPackage.TCA_CONFIGURATION__SUBSCRIBER_POLLING_INTERVAL:
				return SUBSCRIBER_POLLING_INTERVAL_EDEFAULT == null ? subscriberPollingInterval != null : !SUBSCRIBER_POLLING_INTERVAL_EDEFAULT.equals(subscriberPollingInterval);
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_HOST_NAME:
				return PUBLISHER_HOST_NAME_EDEFAULT == null ? publisherHostName != null : !PUBLISHER_HOST_NAME_EDEFAULT.equals(publisherHostName);
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_HOST_PORT:
				return PUBLISHER_HOST_PORT_EDEFAULT == null ? publisherHostPort != null : !PUBLISHER_HOST_PORT_EDEFAULT.equals(publisherHostPort);
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_TOPIC_NAME:
				return PUBLISHER_TOPIC_NAME_EDEFAULT == null ? publisherTopicName != null : !PUBLISHER_TOPIC_NAME_EDEFAULT.equals(publisherTopicName);
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_PROTOCOL:
				return PUBLISHER_PROTOCOL_EDEFAULT == null ? publisherProtocol != null : !PUBLISHER_PROTOCOL_EDEFAULT.equals(publisherProtocol);
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_USER_NAME:
				return PUBLISHER_USER_NAME_EDEFAULT == null ? publisherUserName != null : !PUBLISHER_USER_NAME_EDEFAULT.equals(publisherUserName);
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_USER_PASSWORD:
				return PUBLISHER_USER_PASSWORD_EDEFAULT == null ? publisherUserPassword != null : !PUBLISHER_USER_PASSWORD_EDEFAULT.equals(publisherUserPassword);
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_CONTENT_TYPE:
				return PUBLISHER_CONTENT_TYPE_EDEFAULT == null ? publisherContentType != null : !PUBLISHER_CONTENT_TYPE_EDEFAULT.equals(publisherContentType);
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_MAX_BATCH_SIZE:
				return PUBLISHER_MAX_BATCH_SIZE_EDEFAULT == null ? publisherMaxBatchSize != null : !PUBLISHER_MAX_BATCH_SIZE_EDEFAULT.equals(publisherMaxBatchSize);
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_MAX_RECOVERY_QUEUE_SIZE:
				return PUBLISHER_MAX_RECOVERY_QUEUE_SIZE_EDEFAULT == null ? publisherMaxRecoveryQueueSize != null : !PUBLISHER_MAX_RECOVERY_QUEUE_SIZE_EDEFAULT.equals(publisherMaxRecoveryQueueSize);
			case CommonPackage.TCA_CONFIGURATION__PUBLISHER_POLLING_INTERVAL:
				return PUBLISHER_POLLING_INTERVAL_EDEFAULT == null ? publisherPollingInterval != null : !PUBLISHER_POLLING_INTERVAL_EDEFAULT.equals(publisherPollingInterval);
			case CommonPackage.TCA_CONFIGURATION__METRICS_PER_FUNCTIONAL_ROLE:
				return metricsPerFunctionalRole != null && !metricsPerFunctionalRole.isEmpty();
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
		result.append(" (domain: ");
		result.append(domain);
		result.append(", subscriberHostName: ");
		result.append(subscriberHostName);
		result.append(", subscriberHostPort: ");
		result.append(subscriberHostPort);
		result.append(", subscriberTopicName: ");
		result.append(subscriberTopicName);
		result.append(", subscriberProtocol: ");
		result.append(subscriberProtocol);
		result.append(", subscriberUserName: ");
		result.append(subscriberUserName);
		result.append(", subscriberUserPassword: ");
		result.append(subscriberUserPassword);
		result.append(", subscriberContentType: ");
		result.append(subscriberContentType);
		result.append(", subscriberConsumerId: ");
		result.append(subscriberConsumerId);
		result.append(", subscriberConsumerGroup: ");
		result.append(subscriberConsumerGroup);
		result.append(", subscriberTimeoutMS: ");
		result.append(subscriberTimeoutMS);
		result.append(", subscriberMessageLimit: ");
		result.append(subscriberMessageLimit);
		result.append(", subscriberPollingInterval: ");
		result.append(subscriberPollingInterval);
		result.append(", publisherHostName: ");
		result.append(publisherHostName);
		result.append(", publisherHostPort: ");
		result.append(publisherHostPort);
		result.append(", publisherTopicName: ");
		result.append(publisherTopicName);
		result.append(", publisherProtocol: ");
		result.append(publisherProtocol);
		result.append(", publisherUserName: ");
		result.append(publisherUserName);
		result.append(", publisherUserPassword: ");
		result.append(publisherUserPassword);
		result.append(", publisherContentType: ");
		result.append(publisherContentType);
		result.append(", publisherMaxBatchSize: ");
		result.append(publisherMaxBatchSize);
		result.append(", publisherMaxRecoveryQueueSize: ");
		result.append(publisherMaxRecoveryQueueSize);
		result.append(", publisherPollingInterval: ");
		result.append(publisherPollingInterval);
		result.append(')');
		return result.toString();
	}

} //TcaConfigurationImpl
