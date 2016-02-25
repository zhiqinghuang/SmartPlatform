package com.mossle.portal.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PORTAL_REF")
public class PortalRef implements java.io.Serializable {
	private static final long serialVersionUID = 0L;
	private Long id;
	private PortalInfo portalInfo;
	private String userId;
	private String tenantId;

	public PortalRef() {
	}

	public PortalRef(PortalInfo portalInfo, String userId, String tenantId) {
		this.portalInfo = portalInfo;
		this.userId = userId;
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
	@JoinColumn(name = "INFO_ID")
	public PortalInfo getPortalInfo() {
		return this.portalInfo;
	}

	public void setPortalInfo(PortalInfo portalInfo) {
		this.portalInfo = portalInfo;
	}

	@Column(name = "USER_ID", length = 64)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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