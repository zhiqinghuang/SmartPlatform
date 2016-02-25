package com.mossle.auth.persistence.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

@Entity
@Table(name = "AUTH_PERM_TYPE")
public class PermType implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String name;
	private Integer type;
	private Integer priority;
	private String descn;
	private String tenantId;
	private Set<Perm> perms = new HashSet<Perm>(0);

	public PermType() {
	}

	public PermType(String name, Integer type, Integer priority, String descn, String tenantId, Set<Perm> perms) {
		this.name = name;
		this.type = type;
		this.priority = priority;
		this.descn = descn;
		this.tenantId = tenantId;
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

	@Column(name = "TYPE")
	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Column(name = "PRIORITY")
	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "permType")
	@OrderBy("priority")
	public Set<Perm> getPerms() {
		return this.perms;
	}

	public void setPerms(Set<Perm> perms) {
		this.perms = perms;
	}
}
//need to confirm