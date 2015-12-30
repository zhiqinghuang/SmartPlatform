package com.mossle.javamail.persistence.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "JAVAMAIL_MESSAGE")
public class JavamailMessage implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private JavamailConfig javamailConfig;
	private String sender;
	private String receiver;
	private String cc;
	private String bcc;
	private String subject;
	private String content;
	private Date sendTime;
	private Date receiveTime;
	private String status;
	private String folder;
	private String messageId;
	private Integer messageNumber;
	private Set<JavamailAttachment> javamailAttachments = new HashSet<JavamailAttachment>(0);

	public JavamailMessage() {
	}

	public JavamailMessage(JavamailConfig javamailConfig, String sender, String receiver, String cc, String bcc, String subject, String content, Date sendTime, Date receiveTime, String status, String folder, String messageId, Integer messageNumber, Set<JavamailAttachment> javamailAttachments) {
		this.javamailConfig = javamailConfig;
		this.sender = sender;
		this.receiver = receiver;
		this.cc = cc;
		this.bcc = bcc;
		this.subject = subject;
		this.content = content;
		this.sendTime = sendTime;
		this.receiveTime = receiveTime;
		this.status = status;
		this.folder = folder;
		this.messageId = messageId;
		this.messageNumber = messageNumber;
		this.javamailAttachments = javamailAttachments;
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
	@JoinColumn(name = "CONFIG_ID")
	public JavamailConfig getJavamailConfig() {
		return this.javamailConfig;
	}

	public void setJavamailConfig(JavamailConfig javamailConfig) {
		this.javamailConfig = javamailConfig;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "SEND_TIME", length = 26)
	public Date getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RECEIVE_TIME", length = 26)
	public Date getReceiveTime() {
		return this.receiveTime;
	}

	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
	}

	@Column(name = "STATUS", length = 50)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "FOLDER", length = 200)
	public String getFolder() {
		return this.folder;
	}

	public void setFolder(String folder) {
		this.folder = folder;
	}

	@Column(name = "MESSAGE_ID", length = 200)
	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	@Column(name = "MESSAGE_NUMBER")
	public Integer getMessageNumber() {
		return this.messageNumber;
	}

	public void setMessageNumber(Integer messageNumber) {
		this.messageNumber = messageNumber;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "javamailMessage")
	public Set<JavamailAttachment> getJavamailAttachments() {
		return this.javamailAttachments;
	}

	public void setJavamailAttachments(Set<JavamailAttachment> javamailAttachments) {
		this.javamailAttachments = javamailAttachments;
	}
}