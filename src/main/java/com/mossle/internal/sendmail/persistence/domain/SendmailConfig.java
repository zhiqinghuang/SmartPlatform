package com.mossle.internal.sendmail.persistence.domain;

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
@Table(name = "SENDMAIL_CONFIG")
public class SendmailConfig implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String name;
	private String host;
	private String username;
	private String password;
	private Integer smtpAuth;
	private Integer smtpStarttls;
	private String status;
	private String defaultFrom;
	private String testMail;
	private String tenantId;
	private Integer port;
	private Integer smtpSsl;
	private Set<SendmailQueue> sendmailQueues = new HashSet<SendmailQueue>(0);
	private Set<SendmailHistory> sendmailHistories = new HashSet<SendmailHistory>(0);

	public SendmailConfig() {
	}

	public SendmailConfig(String name, String host, String username, String password, Integer smtpAuth, Integer smtpStarttls, String status, String defaultFrom, String testMail, String tenantId, Integer port, Integer smtpSsl, Set<SendmailQueue> sendmailQueues, Set<SendmailHistory> sendmailHistories) {
		this.name = name;
		this.host = host;
		this.username = username;
		this.password = password;
		this.smtpAuth = smtpAuth;
		this.smtpStarttls = smtpStarttls;
		this.status = status;
		this.defaultFrom = defaultFrom;
		this.testMail = testMail;
		this.tenantId = tenantId;
		this.port = port;
		this.smtpSsl = smtpSsl;
		this.sendmailQueues = sendmailQueues;
		this.sendmailHistories = sendmailHistories;
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

	@Column(name = "NAME", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "HOST", length = 200)
	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
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

	@Column(name = "SMTP_AUTH")
	public Integer getSmtpAuth() {
		return this.smtpAuth;
	}

	public void setSmtpAuth(Integer smtpAuth) {
		this.smtpAuth = smtpAuth;
	}

	@Column(name = "SMTP_STARTTLS")
	public Integer getSmtpStarttls() {
		return this.smtpStarttls;
	}

	public void setSmtpStarttls(Integer smtpStarttls) {
		this.smtpStarttls = smtpStarttls;
	}

	@Column(name = "STATUS", length = 50)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "DEFAULT_FROM", length = 200)
	public String getDefaultFrom() {
		return this.defaultFrom;
	}

	public void setDefaultFrom(String defaultFrom) {
		this.defaultFrom = defaultFrom;
	}

	@Column(name = "TEST_MAIL", length = 200)
	public String getTestMail() {
		return this.testMail;
	}

	public void setTestMail(String testMail) {
		this.testMail = testMail;
	}

	@Column(name = "TENANT_ID", length = 50)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@Column(name = "PORT")
	public Integer getPort() {
		return this.port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	@Column(name = "SMTP_SSL")
	public Integer getSmtpSsl() {
		return this.smtpSsl;
	}

	public void setSmtpSsl(Integer smtpSsl) {
		this.smtpSsl = smtpSsl;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sendmailConfig")
	public Set<SendmailQueue> getSendmailQueues() {
		return this.sendmailQueues;
	}

	public void setSendmailQueues(Set<SendmailQueue> sendmailQueues) {
		this.sendmailQueues = sendmailQueues;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sendmailConfig")
	public Set<SendmailHistory> getSendmailHistories() {
		return this.sendmailHistories;
	}

	public void setSendmailHistories(Set<SendmailHistory> sendmailHistories) {
		this.sendmailHistories = sendmailHistories;
	}
}