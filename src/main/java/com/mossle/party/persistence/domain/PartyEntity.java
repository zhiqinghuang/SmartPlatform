package com.mossle.party.persistence.domain;

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
@Table(name = "PARTY_ENTITY")
public class PartyEntity implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private PartyType partyType;
	private String name;
	private String ref;
	private String tenantId;
	private Integer level;
	private Set<PartyStruct> parentStructs = new HashSet<PartyStruct>(0);
	private Set<PartyStruct> childStructs = new HashSet<PartyStruct>(0);

	public PartyEntity() {
	}

	public PartyEntity(PartyType partyType, String name, String ref, String tenantId, Integer level, Set<PartyStruct> parentStructs, Set<PartyStruct> childStructs) {
		this.partyType = partyType;
		this.name = name;
		this.ref = ref;
		this.tenantId = tenantId;
		this.level = level;
		this.parentStructs = parentStructs;
		this.childStructs = childStructs;
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
	public PartyType getPartyType() {
		return this.partyType;
	}

	public void setPartyType(PartyType partyType) {
		this.partyType = partyType;
	}

	@Column(name = "NAME", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "REF", length = 100)
	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	@Column(name = "TENANT_ID", length = 50)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@Column(name = "LEVEL")
	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "childEntity")
	public Set<PartyStruct> getParentStructs() {
		return this.parentStructs;
	}

	public void setParentStructs(Set<PartyStruct> parentStructs) {
		this.parentStructs = parentStructs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parentEntity")
	public Set<PartyStruct> getChildStructs() {
		return this.childStructs;
	}

	public void setChildStructs(Set<PartyStruct> childStructs) {
		this.childStructs = childStructs;
	}
}