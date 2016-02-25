package com.mossle.group.persistence.domain;

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
@Table(name = "GROUP_INFO")
public class GroupInfo implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private GroupType groupType;
	private String code;
	private String name;
	private String ref;
	private String tenantId;
	private Set<GroupRelation> groupRelationsForChildId = new HashSet<GroupRelation>(0);
	private Set<GroupMember> groupMembers = new HashSet<GroupMember>(0);
	private Set<GroupAlias> groupAliases = new HashSet<GroupAlias>(0);
	private Set<GroupRelation> groupRelationsForParentId = new HashSet<GroupRelation>(0);

	public GroupInfo() {
	}

	public GroupInfo(GroupType groupType, String code, String name, String ref, String tenantId, Set<GroupRelation> groupRelationsForChildId, Set<GroupMember> groupMembers, Set<GroupAlias> groupAliases, Set<GroupRelation> groupRelationsForParentId) {
		this.groupType = groupType;
		this.code = code;
		this.name = name;
		this.ref = ref;
		this.tenantId = tenantId;
		this.groupRelationsForChildId = groupRelationsForChildId;
		this.groupMembers = groupMembers;
		this.groupAliases = groupAliases;
		this.groupRelationsForParentId = groupRelationsForParentId;
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
	public GroupType getGroupType() {
		return this.groupType;
	}

	public void setGroupType(GroupType groupType) {
		this.groupType = groupType;
	}

	@Column(name = "CODE", length = 50)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "NAME", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "REF", length = 200)
	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "groupInfoByChildId")
	public Set<GroupRelation> getGroupRelationsForChildId() {
		return this.groupRelationsForChildId;
	}

	public void setGroupRelationsForChildId(Set<GroupRelation> groupRelationsForChildId) {
		this.groupRelationsForChildId = groupRelationsForChildId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "groupInfo")
	public Set<GroupMember> getGroupMembers() {
		return this.groupMembers;
	}

	public void setGroupMembers(Set<GroupMember> groupMembers) {
		this.groupMembers = groupMembers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "groupInfo")
	public Set<GroupAlias> getGroupAliases() {
		return this.groupAliases;
	}

	public void setGroupAliases(Set<GroupAlias> groupAliases) {
		this.groupAliases = groupAliases;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "groupInfoByParentId")
	public Set<GroupRelation> getGroupRelationsForParentId() {
		return this.groupRelationsForParentId;
	}

	public void setGroupRelationsForParentId(Set<GroupRelation> groupRelationsForParentId) {
		this.groupRelationsForParentId = groupRelationsForParentId;
	}
}
//need to confirm