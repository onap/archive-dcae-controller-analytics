
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

import org.openecomp.dcae.controller.service.cdap.CdapServiceInstanceConfiguration;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tca Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getDomain <em>Domain</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberHostName <em>Subscriber Host Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberHostPort <em>Subscriber Host Port</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberTopicName <em>Subscriber Topic Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberProtocol <em>Subscriber Protocol</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberUserName <em>Subscriber User Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberUserPassword <em>Subscriber User Password</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberContentType <em>Subscriber Content Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberConsumerId <em>Subscriber Consumer Id</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberConsumerGroup <em>Subscriber Consumer Group</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberTimeoutMS <em>Subscriber Timeout MS</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberMessageLimit <em>Subscriber Message Limit</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberPollingInterval <em>Subscriber Polling Interval</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherHostName <em>Publisher Host Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherHostPort <em>Publisher Host Port</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherTopicName <em>Publisher Topic Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherProtocol <em>Publisher Protocol</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherUserName <em>Publisher User Name</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherUserPassword <em>Publisher User Password</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherContentType <em>Publisher Content Type</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherMaxBatchSize <em>Publisher Max Batch Size</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherMaxRecoveryQueueSize <em>Publisher Max Recovery Queue Size</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherPollingInterval <em>Publisher Polling Interval</em>}</li>
 *   <li>{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getMetricsPerFunctionalRole <em>Metrics Per Functional Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaConfiguration()
 * @model
 * @generated
 */
public interface TcaConfiguration extends CdapServiceInstanceConfiguration {
	/**
	 * Returns the value of the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' attribute.
	 * @see #setDomain(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaConfiguration_Domain()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:domain'"
	 * @generated
	 */
	String getDomain();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getDomain <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' attribute.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(String value);

	/**
	 * Returns the value of the '<em><b>Subscriber Host Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber Host Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber Host Name</em>' attribute.
	 * @see #setSubscriberHostName(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaConfiguration_SubscriberHostName()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:subscriberHostName'"
	 * @generated
	 */
	String getSubscriberHostName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberHostName <em>Subscriber Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber Host Name</em>' attribute.
	 * @see #getSubscriberHostName()
	 * @generated
	 */
	void setSubscriberHostName(String value);

	/**
	 * Returns the value of the '<em><b>Subscriber Host Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber Host Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber Host Port</em>' attribute.
	 * @see #setSubscriberHostPort(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaConfiguration_SubscriberHostPort()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:subscriberHostPort'"
	 * @generated
	 */
	String getSubscriberHostPort();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberHostPort <em>Subscriber Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber Host Port</em>' attribute.
	 * @see #getSubscriberHostPort()
	 * @generated
	 */
	void setSubscriberHostPort(String value);

	/**
	 * Returns the value of the '<em><b>Subscriber Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber Topic Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber Topic Name</em>' attribute.
	 * @see #setSubscriberTopicName(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaConfiguration_SubscriberTopicName()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:subscriberTopicName'"
	 * @generated
	 */
	String getSubscriberTopicName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberTopicName <em>Subscriber Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber Topic Name</em>' attribute.
	 * @see #getSubscriberTopicName()
	 * @generated
	 */
	void setSubscriberTopicName(String value);

	/**
	 * Returns the value of the '<em><b>Subscriber Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber Protocol</em>' attribute.
	 * @see #setSubscriberProtocol(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaConfiguration_SubscriberProtocol()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:subscriberProtocol'"
	 * @generated
	 */
	String getSubscriberProtocol();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberProtocol <em>Subscriber Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber Protocol</em>' attribute.
	 * @see #getSubscriberProtocol()
	 * @generated
	 */
	void setSubscriberProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Subscriber User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber User Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber User Name</em>' attribute.
	 * @see #setSubscriberUserName(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaConfiguration_SubscriberUserName()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:subscriberUserName'"
	 * @generated
	 */
	String getSubscriberUserName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberUserName <em>Subscriber User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber User Name</em>' attribute.
	 * @see #getSubscriberUserName()
	 * @generated
	 */
	void setSubscriberUserName(String value);

	/**
	 * Returns the value of the '<em><b>Subscriber User Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber User Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber User Password</em>' attribute.
	 * @see #setSubscriberUserPassword(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaConfiguration_SubscriberUserPassword()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:subscriberUserPassword'"
	 * @generated
	 */
	String getSubscriberUserPassword();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberUserPassword <em>Subscriber User Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber User Password</em>' attribute.
	 * @see #getSubscriberUserPassword()
	 * @generated
	 */
	void setSubscriberUserPassword(String value);

	/**
	 * Returns the value of the '<em><b>Subscriber Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber Content Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber Content Type</em>' attribute.
	 * @see #setSubscriberContentType(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaConfiguration_SubscriberContentType()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:subscriberContentType'"
	 * @generated
	 */
	String getSubscriberContentType();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberContentType <em>Subscriber Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber Content Type</em>' attribute.
	 * @see #getSubscriberContentType()
	 * @generated
	 */
	void setSubscriberContentType(String value);

	/**
	 * Returns the value of the '<em><b>Subscriber Consumer Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber Consumer Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber Consumer Id</em>' attribute.
	 * @see #setSubscriberConsumerId(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaConfiguration_SubscriberConsumerId()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:subscriberConsumerId'"
	 * @generated
	 */
	String getSubscriberConsumerId();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberConsumerId <em>Subscriber Consumer Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber Consumer Id</em>' attribute.
	 * @see #getSubscriberConsumerId()
	 * @generated
	 */
	void setSubscriberConsumerId(String value);

	/**
	 * Returns the value of the '<em><b>Subscriber Consumer Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber Consumer Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber Consumer Group</em>' attribute.
	 * @see #setSubscriberConsumerGroup(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaConfiguration_SubscriberConsumerGroup()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:subscriberConsumerGroup'"
	 * @generated
	 */
	String getSubscriberConsumerGroup();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberConsumerGroup <em>Subscriber Consumer Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber Consumer Group</em>' attribute.
	 * @see #getSubscriberConsumerGroup()
	 * @generated
	 */
	void setSubscriberConsumerGroup(String value);

	/**
	 * Returns the value of the '<em><b>Subscriber Timeout MS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber Timeout MS</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber Timeout MS</em>' attribute.
	 * @see #setSubscriberTimeoutMS(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaConfiguration_SubscriberTimeoutMS()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:subscriberTimeoutMS'"
	 * @generated
	 */
	String getSubscriberTimeoutMS();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberTimeoutMS <em>Subscriber Timeout MS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber Timeout MS</em>' attribute.
	 * @see #getSubscriberTimeoutMS()
	 * @generated
	 */
	void setSubscriberTimeoutMS(String value);

	/**
	 * Returns the value of the '<em><b>Subscriber Message Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber Message Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber Message Limit</em>' attribute.
	 * @see #setSubscriberMessageLimit(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaConfiguration_SubscriberMessageLimit()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:subscriberMessageLimit'"
	 * @generated
	 */
	String getSubscriberMessageLimit();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberMessageLimit <em>Subscriber Message Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber Message Limit</em>' attribute.
	 * @see #getSubscriberMessageLimit()
	 * @generated
	 */
	void setSubscriberMessageLimit(String value);

	/**
	 * Returns the value of the '<em><b>Subscriber Polling Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscriber Polling Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscriber Polling Interval</em>' attribute.
	 * @see #setSubscriberPollingInterval(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaConfiguration_SubscriberPollingInterval()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:subscriberPollingInterval'"
	 * @generated
	 */
	String getSubscriberPollingInterval();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getSubscriberPollingInterval <em>Subscriber Polling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscriber Polling Interval</em>' attribute.
	 * @see #getSubscriberPollingInterval()
	 * @generated
	 */
	void setSubscriberPollingInterval(String value);

	/**
	 * Returns the value of the '<em><b>Publisher Host Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher Host Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher Host Name</em>' attribute.
	 * @see #setPublisherHostName(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaConfiguration_PublisherHostName()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:publisherHostName'"
	 * @generated
	 */
	String getPublisherHostName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherHostName <em>Publisher Host Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Host Name</em>' attribute.
	 * @see #getPublisherHostName()
	 * @generated
	 */
	void setPublisherHostName(String value);

	/**
	 * Returns the value of the '<em><b>Publisher Host Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher Host Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher Host Port</em>' attribute.
	 * @see #setPublisherHostPort(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaConfiguration_PublisherHostPort()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:publisherHostPort'"
	 * @generated
	 */
	String getPublisherHostPort();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherHostPort <em>Publisher Host Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Host Port</em>' attribute.
	 * @see #getPublisherHostPort()
	 * @generated
	 */
	void setPublisherHostPort(String value);

	/**
	 * Returns the value of the '<em><b>Publisher Topic Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher Topic Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher Topic Name</em>' attribute.
	 * @see #setPublisherTopicName(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaConfiguration_PublisherTopicName()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:publisherTopicName'"
	 * @generated
	 */
	String getPublisherTopicName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherTopicName <em>Publisher Topic Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Topic Name</em>' attribute.
	 * @see #getPublisherTopicName()
	 * @generated
	 */
	void setPublisherTopicName(String value);

	/**
	 * Returns the value of the '<em><b>Publisher Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher Protocol</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher Protocol</em>' attribute.
	 * @see #setPublisherProtocol(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaConfiguration_PublisherProtocol()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:publisherProtocol'"
	 * @generated
	 */
	String getPublisherProtocol();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherProtocol <em>Publisher Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Protocol</em>' attribute.
	 * @see #getPublisherProtocol()
	 * @generated
	 */
	void setPublisherProtocol(String value);

	/**
	 * Returns the value of the '<em><b>Publisher User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher User Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher User Name</em>' attribute.
	 * @see #setPublisherUserName(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaConfiguration_PublisherUserName()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:publisherUserName'"
	 * @generated
	 */
	String getPublisherUserName();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherUserName <em>Publisher User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher User Name</em>' attribute.
	 * @see #getPublisherUserName()
	 * @generated
	 */
	void setPublisherUserName(String value);

	/**
	 * Returns the value of the '<em><b>Publisher User Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher User Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher User Password</em>' attribute.
	 * @see #setPublisherUserPassword(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaConfiguration_PublisherUserPassword()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:publisherUserPassword'"
	 * @generated
	 */
	String getPublisherUserPassword();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherUserPassword <em>Publisher User Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher User Password</em>' attribute.
	 * @see #getPublisherUserPassword()
	 * @generated
	 */
	void setPublisherUserPassword(String value);

	/**
	 * Returns the value of the '<em><b>Publisher Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher Content Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher Content Type</em>' attribute.
	 * @see #setPublisherContentType(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaConfiguration_PublisherContentType()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:publisherContentType'"
	 * @generated
	 */
	String getPublisherContentType();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherContentType <em>Publisher Content Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Content Type</em>' attribute.
	 * @see #getPublisherContentType()
	 * @generated
	 */
	void setPublisherContentType(String value);

	/**
	 * Returns the value of the '<em><b>Publisher Max Batch Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher Max Batch Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher Max Batch Size</em>' attribute.
	 * @see #setPublisherMaxBatchSize(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaConfiguration_PublisherMaxBatchSize()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:publisherMaxBatchSize'"
	 * @generated
	 */
	String getPublisherMaxBatchSize();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherMaxBatchSize <em>Publisher Max Batch Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Max Batch Size</em>' attribute.
	 * @see #getPublisherMaxBatchSize()
	 * @generated
	 */
	void setPublisherMaxBatchSize(String value);

	/**
	 * Returns the value of the '<em><b>Publisher Max Recovery Queue Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher Max Recovery Queue Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher Max Recovery Queue Size</em>' attribute.
	 * @see #setPublisherMaxRecoveryQueueSize(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaConfiguration_PublisherMaxRecoveryQueueSize()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:publisherMaxRecoveryQueueSize'"
	 * @generated
	 */
	String getPublisherMaxRecoveryQueueSize();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherMaxRecoveryQueueSize <em>Publisher Max Recovery Queue Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Max Recovery Queue Size</em>' attribute.
	 * @see #getPublisherMaxRecoveryQueueSize()
	 * @generated
	 */
	void setPublisherMaxRecoveryQueueSize(String value);

	/**
	 * Returns the value of the '<em><b>Publisher Polling Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher Polling Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher Polling Interval</em>' attribute.
	 * @see #setPublisherPollingInterval(String)
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaConfiguration_PublisherPollingInterval()
	 * @model unique="false"
	 *        annotation="http://openecomp.org type='configuration'"
	 *        annotation="http://openecomp.org/cdap destination='namespace-prefs:cdap-tca:publisherPollingInterval'"
	 * @generated
	 */
	String getPublisherPollingInterval();

	/**
	 * Sets the value of the '{@link org.openecomp.dcae.analytics.cdap.common.TcaConfiguration#getPublisherPollingInterval <em>Publisher Polling Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher Polling Interval</em>' attribute.
	 * @see #getPublisherPollingInterval()
	 * @generated
	 */
	void setPublisherPollingInterval(String value);

	/**
	 * Returns the value of the '<em><b>Metrics Per Functional Role</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.dcae.analytics.cdap.common.TcaMetrics}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metrics Per Functional Role</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics Per Functional Role</em>' containment reference list.
	 * @see org.openecomp.dcae.analytics.cdap.common.CommonPackage#getTcaConfiguration_MetricsPerFunctionalRole()
	 * @model containment="true"
	 * @generated
	 */
	EList<TcaMetrics> getMetricsPerFunctionalRole();

} // TcaConfiguration
