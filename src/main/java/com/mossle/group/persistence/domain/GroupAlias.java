package com.mossle.group.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "GROUP_ALIAS")
public class GroupAlias implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private GroupInfo groupInfo;
	private String name;
	private String tenantId;

	public GroupAlias() {
	}

	public GroupAlias(GroupInfo groupInfo, String name, String tenantId) {
		this.groupInfo = groupInfo;
		this.name = name;
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
	public GroupInfo getGroupInfo() {
		return this.groupInfo;
	}

	public void setGroupInfo(GroupInfo groupInfo) {
		this.groupInfo = groupInfo;
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
}
//need to confirm