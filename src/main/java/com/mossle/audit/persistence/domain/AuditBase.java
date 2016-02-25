package com.mossle.audit.persistence.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "AUDIT_BASE")
public class AuditBase implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String user;
	private String resourceType;
	private String resourceId;
	private String action;
	private String result;
	private String application;
	private Date auditTime;
	private String client;
	private String server;
	private String description;
	private String tenantId;

	public AuditBase() {
	}

	public AuditBase(String user, String resourceType, String resourceId, String action, String result, String application, Date auditTime, String client, String server, String description, String tenantId) {
		this.user = user;
		this.resourceType = resourceType;
		this.resourceId = resourceId;
		this.action = action;
		this.result = result;
		this.application = application;
		this.auditTime = auditTime;
		this.client = client;
		this.server = server;
		this.description = description;
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

	@Column(name = "USER", length = 200)
	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	@Column(name = "RESOURCE_TYPE", length = 200)
	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	@Column(name = "RESOURCE_ID", length = 200)
	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	@Column(name = "ACTION", length = 200)
	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Column(name = "RESULT", length = 200)
	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	@Column(name = "APPLICATION", length = 200)
	public String getApplication() {
		return this.application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "AUDIT_TIME", length = 26)
	public Date getAuditTime() {
		return this.auditTime;
	}

	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	@Column(name = "CLIENT", length = 200)
	public String getClient() {
		return this.client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	@Column(name = "SERVER", length = 200)
	public String getServer() {
		return this.server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	@Column(name = "DESCRIPTION", length = 200)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
}
//need to confirm