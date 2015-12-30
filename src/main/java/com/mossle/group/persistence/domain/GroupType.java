package com.mossle.group.persistence.domain;

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
@Table(name = "GROUP_TYPE")
public class GroupType implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String name;
	private String tenantId;
	private Set<GroupInfo> groupInfos = new HashSet<GroupInfo>(0);

	public GroupType() {
	}

	public GroupType(String name, String tenantId, Set<GroupInfo> groupInfos) {
		this.name = name;
		this.tenantId = tenantId;
		this.groupInfos = groupInfos;
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

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "groupType")
	public Set<GroupInfo> getGroupInfos() {
		return this.groupInfos;
	}

	public void setGroupInfos(Set<GroupInfo> groupInfos) {
		this.groupInfos = groupInfos;
	}
}