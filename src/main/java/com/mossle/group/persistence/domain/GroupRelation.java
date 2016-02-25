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
@Table(name = "GROUP_RELATION")
public class GroupRelation implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private GroupInfo groupInfoByParentId;
	private GroupInfo groupInfoByChildId;
	private String tenantId;

	public GroupRelation() {
	}

	public GroupRelation(GroupInfo groupInfoByParentId, GroupInfo groupInfoByChildId, String tenantId) {
		this.groupInfoByParentId = groupInfoByParentId;
		this.groupInfoByChildId = groupInfoByChildId;
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
	@JoinColumn(name = "PARENT_ID")
	public GroupInfo getGroupInfoByParentId() {
		return this.groupInfoByParentId;
	}

	public void setGroupInfoByParentId(GroupInfo groupInfoByParentId) {
		this.groupInfoByParentId = groupInfoByParentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CHILD_ID")
	public GroupInfo getGroupInfoByChildId() {
		return this.groupInfoByChildId;
	}

	public void setGroupInfoByChildId(GroupInfo groupInfoByChildId) {
		this.groupInfoByChildId = groupInfoByChildId;
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