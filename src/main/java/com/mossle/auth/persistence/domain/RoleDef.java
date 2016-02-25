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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "AUTH_ROLE_DEF")
public class RoleDef implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String name;
	private String descn;
	private String tenantId;
	private Set<Role> roles = new HashSet<Role>(0);
	private Set<Perm> perms = new HashSet<Perm>(0);

	public RoleDef() {
	}

	public RoleDef(String name, String descn, String tenantId, Set<Role> roles, Set<Perm> perms) {
		this.name = name;
		this.descn = descn;
		this.tenantId = tenantId;
		this.roles = roles;
		this.perms = perms;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "roleDef")
	public Set<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "AUTH_PERM_ROLE_DEF", joinColumns = { @JoinColumn(name = "ROLE_DEF_ID", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "PERM_ID", nullable = false, updatable = false) })
	public Set<Perm> getPerms() {
		return this.perms;
	}

	public void setPerms(Set<Perm> perms) {
		this.perms = perms;
	}
}
//need to confirm