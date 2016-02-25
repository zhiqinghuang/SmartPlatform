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
@Table(name = "SENDMAIL_TEMPLATE")
public class SendmailTemplate implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String name;
	private String receiver;
	private String sender;
	private String cc;
	private String bcc;
	private String subject;
	private String content;
	private Integer manual;
	private String tenantId;
	private Set<SendmailAttachment> sendmailAttachments = new HashSet<SendmailAttachment>(0);
	private Set<SendmailHistory> sendmailHistories = new HashSet<SendmailHistory>(0);
	private Set<SendmailQueue> sendmailQueues = new HashSet<SendmailQueue>(0);

	public SendmailTemplate() {
	}

	public SendmailTemplate(String name, String receiver, String sender, String cc, String bcc, String subject, String content, Integer manual, String tenantId, Set<SendmailAttachment> sendmailAttachments, Set<SendmailHistory> sendmailHistories, Set<SendmailQueue> sendmailQueues) {
		this.name = name;
		this.receiver = receiver;
		this.sender = sender;
		this.cc = cc;
		this.bcc = bcc;
		this.subject = subject;
		this.content = content;
		this.manual = manual;
		this.tenantId = tenantId;
		this.sendmailAttachments = sendmailAttachments;
		this.sendmailHistories = sendmailHistories;
		this.sendmailQueues = sendmailQueues;
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

	@Column(name = "RECEIVER", length = 200)
	public String getReceiver() {
		return this.receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	@Column(name = "SENDER", length = 200)
	public String getSender() {
		return this.sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	@Column(name = "CC", length = 200)
	public String getCc() {
		return this.cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	@Column(name = "BCC", length = 200)
	public String getBcc() {
		return this.bcc;
	}

	public void setBcc(String bcc) {
		this.bcc = bcc;
	}

	@Column(name = "SUBJECT", length = 200)
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Column(name = "CONTENT", length = 65535)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "MANUAL")
	public Integer getManual() {
		return this.manual;
	}

	public void setManual(Integer manual) {
		this.manual = manual;
	}

	@Column(name = "TENANT_ID", length = 50)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sendmailTemplate")
	public Set<SendmailAttachment> getSendmailAttachments() {
		return this.sendmailAttachments;
	}

	public void setSendmailAttachments(Set<SendmailAttachment> sendmailAttachments) {
		this.sendmailAttachments = sendmailAttachments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sendmailTemplate")
	public Set<SendmailHistory> getSendmailHistories() {
		return this.sendmailHistories;
	}

	public void setSendmailHistories(Set<SendmailHistory> sendmailHistories) {
		this.sendmailHistories = sendmailHistories;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sendmailTemplate")
	public Set<SendmailQueue> getSendmailQueues() {
		return this.sendmailQueues;
	}

	public void setSendmailQueues(Set<SendmailQueue> sendmailQueues) {
		this.sendmailQueues = sendmailQueues;
	}
}
//need to confirm