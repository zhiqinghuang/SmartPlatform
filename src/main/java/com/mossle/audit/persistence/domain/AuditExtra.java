package com.mossle.audit.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AUDIT_EXTRA")
public class AuditExtra implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String name;
	private String value;
	private Long auditBaseId;
	private String tenantId;

	public AuditExtra() {
	}

	public AuditExtra(String name, String value, Long auditBaseId, String tenantId) {
		this.name = name;
		this.value = value;
		this.auditBaseId = auditBaseId;
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

	@Column(name = "NAME", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "VALUE", length = 200)
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Column(name = "AUDIT_BASE_ID")
	public Long getAuditBaseId() {
		return this.auditBaseId;
	}

	public void setAuditBaseId(Long auditBaseId) {
		this.auditBaseId = auditBaseId;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
}