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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "AUTH_PERM")
public class Perm implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private PermType permType;
	private String code;
	private String name;
	private String tenantId;
	private Integer priority;
	private Set<RoleDef> roleDefs = new HashSet<RoleDef>(0);
	private Set<Access> accesses = new HashSet<Access>(0);
	private Set<Menu> menus = new HashSet<Menu>(0);

	public Perm() {
	}

	public Perm(PermType permType) {
		this.permType = permType;
	}

	public Perm(PermType permType, String code, String name, String tenantId, Integer priority, Set<RoleDef> roleDefs, Set<Access> accesses, Set<Menu> menus) {
		this.permType = permType;
		this.code = code;
		this.name = name;
		this.tenantId = tenantId;
		this.priority = priority;
		this.roleDefs = roleDefs;
		this.accesses = accesses;
		this.menus = menus;
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
	@JoinColumn(name = "PERM_TYPE_ID", nullable = false)
	public PermType getPermType() {
		return this.permType;
	}

	public void setPermType(PermType permType) {
		this.permType = permType;
	}

	@Column(name = "CODE", length = 200)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "NAME", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "TENANT_ID", length = 50)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@Column(name = "PRIORITY")
	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "AUTH_PERM_ROLE_DEF", joinColumns = { @JoinColumn(name = "PERM_ID", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "ROLE_DEF_ID", nullable = false, updatable = false) })
	public Set<RoleDef> getRoleDefs() {
		return this.roleDefs;
	}

	public void setRoleDefs(Set<RoleDef> roleDefs) {
		this.roleDefs = roleDefs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "perm")
	public Set<Access> getAccesses() {
		return this.accesses;
	}

	public void setAccesses(Set<Access> accesses) {
		this.accesses = accesses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "perm")
	public Set<Menu> getMenus() {
		return this.menus;
	}

	public void setMenus(Set<Menu> menus) {
		this.menus = menus;
	}
}