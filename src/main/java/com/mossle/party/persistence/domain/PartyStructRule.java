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
@Table(name = "PARTY_STRUCT_RULE")
public class PartyStructRule implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private PartyType parentType;
	private PartyType childType;
	private PartyStructType partyStructType;
	private String tenantId;

	public PartyStructRule() {
	}

	public PartyStructRule(PartyType childType, PartyStructType partyStructType) {
		this.childType = childType;
		this.partyStructType = partyStructType;
	}

	public PartyStructRule(PartyType parentType, PartyType childType, PartyStructType partyStructType, String tenantId) {
		this.parentType = parentType;
		this.childType = childType;
		this.partyStructType = partyStructType;
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
	@JoinColumn(name = "PARENT_TYPE_ID")
	public PartyType getParentType() {
		return this.parentType;
	}

	public void setParentType(PartyType parentType) {
		this.parentType = parentType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CHILD_TYPE_ID", nullable = false)
	public PartyType getChildType() {
		return this.childType;
	}

	public void setChildType(PartyType childType) {
		this.childType = childType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STRUCT_TYPE_ID", nullable = false)
	public PartyStructType getPartyStructType() {
		return this.partyStructType;
	}

	public void setPartyStructType(PartyStructType partyStructType) {
		this.partyStructType = partyStructType;
	}

	@Column(name = "TENANT_ID", length = 50)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
}