package com.mossle.internal.whitelist.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "WHITELIST_IP")
public class WhitelistIp implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private WhitelistApp whitelistApp;
	private String value;
	private Integer priority;
	private String tenantId;

	public WhitelistIp() {
	}

	public WhitelistIp(WhitelistApp whitelistApp, String value, Integer priority, String tenantId) {
		this.whitelistApp = whitelistApp;
		this.value = value;
		this.priority = priority;
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
	@JoinColumn(name = "APP_ID")
	public WhitelistApp getWhitelistApp() {
		return this.whitelistApp;
	}

	public void setWhitelistApp(WhitelistApp whitelistApp) {
		this.whitelistApp = whitelistApp;
	}

	@Column(name = "VALUE", length = 50)
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Column(name = "PRIORITY")
	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
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