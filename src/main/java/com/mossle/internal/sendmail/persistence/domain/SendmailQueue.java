package com.mossle.internal.sendmail.persistence.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "SENDMAIL_QUEUE")
public class SendmailQueue implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private SendmailTemplate sendmailTemplate;
	private SendmailConfig sendmailConfig;
	private String subject;
	private String sender;
	private String receiver;
	private String cc;
	private String bcc;
	private String content;
	private String attachment;
	private String data;
	private Date createTime;
	private String status;
	private String info;
	private String tenantId;

	public SendmailQueue() {
	}

	public SendmailQueue(SendmailTemplate sendmailTemplate, SendmailConfig sendmailConfig, String subject, String sender, String receiver, String cc, String bcc, String content, String attachment, String data, Date createTime, String status, String info, String tenantId) {
		this.sendmailTemplate = sendmailTemplate;
		this.sendmailConfig = sendmailConfig;
		this.subject = subject;
		this.sender = sender;
		this.receiver = receiver;
		this.cc = cc;
		this.bcc = bcc;
		this.content = content;
		this.attachment = attachment;
		this.data = data;
		this.createTime = createTime;
		this.status = status;
		this.info = info;
		this.tenantId = tenantId;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TEMPLATE_ID")
	public SendmailTemplate getSendmailTemplate() {
		return this.sendmailTemplate;
	}

	public void setSendmailTemplate(SendmailTemplate sendmailTemplate) {
		this.sendmailTemplate = sendmailTemplate;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CONFIG_ID")
	public SendmailConfig getSendmailConfig() {
		return this.sendmailConfig;
	}

	public void setSendmailConfig(SendmailConfig sendmailConfig) {
		this.sendmailConfig = sendmailConfig;
	}

	@Column(name = "SUBJECT", length = 50)
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Column(name = "SENDER", length = 200)
	public String getSender() {
		return this.sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	@Column(name = "RECEIVER", length = 200)
	public String getReceiver() {
		return this.receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
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

	@Column(name = "CONTENT", length = 65535)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "ATTACHMENT", length = 200)
	public String getAttachment() {
		return this.attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}

	@Column(name = "DATA", length = 65535)
	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME", length = 26)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "STATUS", length = 50)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "INFO", length = 200)
	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Column(name = "TENANT_ID", length = 50)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
}
//need to confirm