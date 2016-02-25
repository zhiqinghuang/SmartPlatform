package com.mossle.party.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PARTY_STRUCT")
public class PartyStruct implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private PartyEntity parentEntity;
	private PartyEntity childEntity;
	private PartyStructType partyStructType;
	private Integer priority;
	private String tenantId;
	private Integer partTime;
	private Integer link;
	private Integer admin;

	public PartyStruct() {
	}

	public PartyStruct(PartyEntity childEntity, PartyStructType partyStructType) {
		this.childEntity = childEntity;
		this.partyStructType = partyStructType;
	}

	public PartyStruct(PartyEntity parentEntity, PartyEntity childEntity, PartyStructType partyStructType, Integer priority, String tenantId, Integer partTime, Integer link, Integer admin) {
		this.parentEntity = parentEntity;
		this.childEntity = childEntity;
		this.partyStructType = partyStructType;
		this.priority = priority;
		this.tenantId = tenantId;
		this.partTime = partTime;
		this.link = link;
		this.admin = admin;
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
	@JoinColumn(name = "PARENT_ENTITY_ID")
	public PartyEntity getParentEntity() {
		return this.parentEntity;
	}

	public void setParentEntity(PartyEntity parentEntity) {
		this.parentEntity = parentEntity;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CHILD_ENTITY_ID", nullable = false)
	public PartyEntity getChildEntity() {
		return this.childEntity;
	}

	public void setChildEntity(PartyEntity childEntity) {
		this.childEntity = childEntity;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STRUCT_TYPE_ID", nullable = false)
	public PartyStructType getPartyStructType() {
		return this.partyStructType;
	}

	public void setPartyStructType(PartyStructType partyStructType) {
		this.partyStructType = partyStructType;
	}

	@Column(name = "PRIORITY")
	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@Column(name = "TENANT_ID", length = 50)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@Column(name = "PART_TIME")
	public Integer getPartTime() {
		return this.partTime;
	}

	public void setPartTime(Integer partTime) {
		this.partTime = partTime;
	}

	@Column(name = "LINK")
	public Integer getLink() {
		return this.link;
	}

	public void setLink(Integer link) {
		this.link = link;
	}

	@Column(name = "ADMIN")
	public Integer getAdmin() {
		return this.admin;
	}

	public void setAdmin(Integer admin) {
		this.admin = admin;
	}
}
//need to confirm