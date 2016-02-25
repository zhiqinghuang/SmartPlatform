package com.mossle.party.persistence.domain;

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
@Table(name = "PARTY_TYPE")
public class PartyType implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String name;
	private String tenantId;
	private Integer type;
	private String ref;
	private Set<PartyStructRule> parentStructRules = new HashSet<PartyStructRule>(0);
	private Set<PartyStructRule> childStructRules = new HashSet<PartyStructRule>(0);
	private Set<PartyEntity> partyEntities = new HashSet<PartyEntity>(0);

	public PartyType() {
	}

	public PartyType(String name, String tenantId, Integer type, String ref, Set<PartyStructRule> parentStructRules, Set<PartyStructRule> childStructRules, Set<PartyEntity> partyEntities) {
		this.name = name;
		this.tenantId = tenantId;
		this.type = type;
		this.ref = ref;
		this.parentStructRules = parentStructRules;
		this.childStructRules = childStructRules;
		this.partyEntities = partyEntities;
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

	@Column(name = "TENANT_ID", length = 50)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@Column(name = "TYPE")
	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Column(name = "REF", length = 50)
	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "childType")
	public Set<PartyStructRule> getParentStructRules() {
		return this.parentStructRules;
	}

	public void setParentStructRules(Set<PartyStructRule> parentStructRules) {
		this.parentStructRules = parentStructRules;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parentType")
	public Set<PartyStructRule> getChildStructRules() {
		return this.childStructRules;
	}

	public void setChildStructRules(Set<PartyStructRule> childStructRules) {
		this.childStructRules = childStructRules;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "partyType")
	public Set<PartyEntity> getPartyEntities() {
		return this.partyEntities;
	}

	public void setPartyEntities(Set<PartyEntity> partyEntities) {
		this.partyEntities = partyEntities;
	}
}
//need to confirm