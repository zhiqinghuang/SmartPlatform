package com.mossle.internal.whitelist.persistence.domain;

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
@Table(name = "WHITELIST_TYPE")
public class WhitelistType implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String name;
	private String code;
	private String tenantId;
	private Set<WhitelistApp> whitelistApps = new HashSet<WhitelistApp>(0);

	public WhitelistType() {
	}

	public WhitelistType(String name, String code, String tenantId, Set<WhitelistApp> whitelistApps) {
		this.name = name;
		this.code = code;
		this.tenantId = tenantId;
		this.whitelistApps = whitelistApps;
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

	@Column(name = "CODE", length = 50)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "whitelistType")
	public Set<WhitelistApp> getWhitelistApps() {
		return this.whitelistApps;
	}

	public void setWhitelistApps(Set<WhitelistApp> whitelistApps) {
		this.whitelistApps = whitelistApps;
	}
}
//need to confirm