package com.mossle.internal.whitelist.persistence.domain;

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

@Entity
@Table(name = "WHITELIST_APP")
public class WhitelistApp implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private WhitelistType whitelistType;
	private String name;
	private String userId;
	private String description;
	private Integer forceRelogin;
	private String code;
	private String username;
	private String password;
	private Integer level;
	private String tenantId;
	private Set<WhitelistHost> whitelistHosts = new HashSet<WhitelistHost>(0);
	private Set<WhitelistIp> whitelistIps = new HashSet<WhitelistIp>(0);

	public WhitelistApp() {
	}

	public WhitelistApp(WhitelistType whitelistType, String name, String userId, String description, Integer forceRelogin, String code, String username, String password, Integer level, String tenantId, Set<WhitelistHost> whitelistHosts, Set<WhitelistIp> whitelistIps) {
		this.whitelistType = whitelistType;
		this.name = name;
		this.userId = userId;
		this.description = description;
		this.forceRelogin = forceRelogin;
		this.code = code;
		this.username = username;
		this.password = password;
		this.level = level;
		this.tenantId = tenantId;
		this.whitelistHosts = whitelistHosts;
		this.whitelistIps = whitelistIps;
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
	@JoinColumn(name = "TYPE_ID")
	public WhitelistType getWhitelistType() {
		return this.whitelistType;
	}

	public void setWhitelistType(WhitelistType whitelistType) {
		this.whitelistType = whitelistType;
	}

	@Column(name = "NAME", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "USER_ID", length = 50)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "DESCRIPTION", length = 200)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "FORCE_RELOGIN")
	public Integer getForceRelogin() {
		return this.forceRelogin;
	}

	public void setForceRelogin(Integer forceRelogin) {
		this.forceRelogin = forceRelogin;
	}

	@Column(name = "CODE", length = 64)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "USERNAME", length = 64)
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

	@Column(name = "LEVEL")
	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "whitelistApp")
	public Set<WhitelistHost> getWhitelistHosts() {
		return this.whitelistHosts;
	}

	public void setWhitelistHosts(Set<WhitelistHost> whitelistHosts) {
		this.whitelistHosts = whitelistHosts;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "whitelistApp")
	public Set<WhitelistIp> getWhitelistIps() {
		return this.whitelistIps;
	}

	public void setWhitelistIps(Set<WhitelistIp> whitelistIps) {
		this.whitelistIps = whitelistIps;
	}
}
//need to confirm