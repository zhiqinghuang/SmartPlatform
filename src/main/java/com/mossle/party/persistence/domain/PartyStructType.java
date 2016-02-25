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
@Table(name = "PARTY_STRUCT_TYPE")
public class PartyStructType implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String name;
	private String ref;
	private String tenantId;
	private Integer priority;
	private Set<PartyStructRule> partyStructRules = new HashSet<PartyStructRule>(0);
	private Set<PartyStruct> partyStructs = new HashSet<PartyStruct>(0);

	public PartyStructType() {
	}

	public PartyStructType(String name, String ref, String tenantId, Integer priority, Set<PartyStructRule> partyStructRules, Set<PartyStruct> partyStructs) {
		this.name = name;
		this.ref = ref;
		this.tenantId = tenantId;
		this.priority = priority;
		this.partyStructRules = partyStructRules;
		this.partyStructs = partyStructs;
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

	@Column(name = "REF", length = 50)
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

	@Column(name = "PRIORITY")
	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "partyStructType")
	public Set<PartyStructRule> getPartyStructRules() {
		return this.partyStructRules;
	}

	public void setPartyStructRules(Set<PartyStructRule> partyStructRules) {
		this.partyStructRules = partyStructRules;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "partyStructType")
	public Set<PartyStruct> getPartyStructs() {
		return this.partyStructs;
	}

	public void setPartyStructs(Set<PartyStruct> partyStructs) {
		this.partyStructs = partyStructs;
	}
}
//need to confirm