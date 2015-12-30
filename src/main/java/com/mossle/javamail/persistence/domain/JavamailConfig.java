package com.mossle.javamail.persistence.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "JAVAMAIL_CONFIG")
public class JavamailConfig implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String username;
	private String password;
	private String receiveType;
	private String receiveHost;
	private String receivePort;
	private String receiveSecure;
	private String sendType;
	private String sendHost;
	private String sendPort;
	private String sendSecure;
	private Integer priority;
	private String userId;
	private Set<JavamailMessage> javamailMessages = new HashSet<JavamailMessage>(0);

	public JavamailConfig() {
	}

	public JavamailConfig(String username, String password, String receiveType, String receiveHost, String receivePort, String receiveSecure, String sendType, String sendHost, String sendPort, String sendSecure, Integer priority, String userId, Set<JavamailMessage> javamailMessages) {
		this.username = username;
		this.password = password;
		this.receiveType = receiveType;
		this.receiveHost = receiveHost;
		this.receivePort = receivePort;
		this.receiveSecure = receiveSecure;
		this.sendType = sendType;
		this.sendHost = sendHost;
		this.sendPort = sendPort;
		this.sendSecure = sendSecure;
		this.priority = priority;
		this.userId = userId;
		this.javamailMessages = javamailMessages;
	}

	@Id
	@GeneratedValue
	@Column(name = "ID", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "USERNAME", length = 200)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "PASSWORD", length = 200)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "RECEIVE_TYPE", length = 50)
	public String getReceiveType() {
		return this.receiveType;
	}

	public void setReceiveType(String receiveType) {
		this.receiveType = receiveType;
	}

	@Column(name = "RECEIVE_HOST", length = 200)
	public String getReceiveHost() {
		return this.receiveHost;
	}

	public void setReceiveHost(String receiveHost) {
		this.receiveHost = receiveHost;
	}

	@Column(name = "RECEIVE_PORT", length = 10)
	public String getReceivePort() {
		return this.receivePort;
	}

	public void setReceivePort(String receivePort) {
		this.receivePort = receivePort;
	}

	@Column(name = "RECEIVE_SECURE", length = 50)
	public String getReceiveSecure() {
		return this.receiveSecure;
	}

	public void setReceiveSecure(String receiveSecure) {
		this.receiveSecure = receiveSecure;
	}

	@Column(name = "SEND_TYPE", length = 50)
	public String getSendType() {
		return this.sendType;
	}

	public void setSendType(String sendType) {
		this.sendType = sendType;
	}

	@Column(name = "SEND_HOST", length = 50)
	public String getSendHost() {
		return this.sendHost;
	}

	public void setSendHost(String sendHost) {
		this.sendHost = sendHost;
	}

	@Column(name = "SEND_PORT", length = 10)
	public String getSendPort() {
		return this.sendPort;
	}

	public void setSendPort(String sendPort) {
		this.sendPort = sendPort;
	}

	@Column(name = "SEND_SECURE", length = 50)
	public String getSendSecure() {
		return this.sendSecure;
	}

	public void setSendSecure(String sendSecure) {
		this.sendSecure = sendSecure;
	}

	@Column(name = "PRIORITY")
	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@Column(name = "USER_ID", length = 64)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "javamailConfig")
	public Set<JavamailMessage> getJavamailMessages() {
		return this.javamailMessages;
	}

	public void setJavamailMessages(Set<JavamailMessage> javamailMessages) {
		this.javamailMessages = javamailMessages;
	}
}