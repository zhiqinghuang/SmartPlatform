package com.mossle.internal.sendmail.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SENDMAIL_ATTACHMENT")
public class SendmailAttachment implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private SendmailTemplate sendmailTemplate;
	private String name;
	private String path;
	private String tenantId;

	public SendmailAttachment() {
	}

	public SendmailAttachment(SendmailTemplate sendmailTemplate, String name, String path, String tenantId) {
		this.sendmailTemplate = sendmailTemplate;
		this.name = name;
		this.path = path;
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

	@Column(name = "NAME", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "PATH", length = 200)
	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Column(name = "TENANT_ID", length = 50)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
}