package com.mossle.auth.persistence.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "AUTH_ROLE")
public class Role implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private RoleDef roleDef;
	private String name;
	private String descn;
	private String tenantId;
	private Set<UserStatus> userStatuses = new HashSet<UserStatus>(0);

	public Role() {
	}

	public Role(RoleDef roleDef, String name, String descn, String tenantId, Set<UserStatus> userStatuses) {
		this.roleDef = roleDef;
		this.name = name;
		this.descn = descn;
		this.tenantId = tenantId;
		this.userStatuses = userStatuses;
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
	@JoinColumn(name = "ROLE_DEF_ID")
	public RoleDef getRoleDef() {
		return this.roleDef;
	}

	public void setRoleDef(RoleDef roleDef) {
		this.roleDef = roleDef;
	}

	@Column(name = "NAME", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "DESCN", length = 200)
	public String getDescn() {
		return this.descn;
	}

	public void setDescn(String descn) {
		this.descn = descn;
	}

	@Column(name = "TENANT_ID", length = 50)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "AUTH_USER_ROLE", joinColumns = { @JoinColumn(name = "ROLE_ID", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "USER_STATUS_ID", nullable = false, updatable = false) })
	public Set<UserStatus> getUserStatuses() {
		return this.userStatuses;
	}

	public void setUserStatuses(Set<UserStatus> userStatuses) {
		this.userStatuses = userStatuses;
	}
}
//need to confirm