package com.mossle.party.persistence.domain;

// Generated by Hibernate Tools
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * PartyStructType .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "PARTY_STRUCT_TYPE")
public class PartyStructType implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	/** null. */
	private Long id;

	/** null. */
	private String name;

	/** null. */
	private String ref;

	/** null. */
	private String tenantId;

	/** null. */
	private Integer priority;

	/** . */
	private Set<PartyStructRule> partyStructRules = new HashSet<PartyStructRule>(0);

	/** . */
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

	/** @return null. */
	@Id
	@GeneratedValue
	@Column(name = "ID", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	/**
	 * @param id
	 *            null.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/** @return null. */
	@Column(name = "NAME", length = 50)
	public String getName() {
		return this.name;
	}

	/**
	 * @param name
	 *            null.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** @return null. */
	@Column(name = "REF", length = 50)
	public String getRef() {
		return this.ref;
	}

	/**
	 * @param ref
	 *            null.
	 */
	public void setRef(String ref) {
		this.ref = ref;
	}

	/** @return null. */
	@Column(name = "TENANT_ID", length = 50)
	public String getTenantId() {
		return this.tenantId;
	}

	/**
	 * @param tenantId
	 *            null.
	 */
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	/** @return null. */
	@Column(name = "PRIORITY")
	public Integer getPriority() {
		return this.priority;
	}

	/**
	 * @param priority
	 *            null.
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	/** @return . */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "partyStructType")
	public Set<PartyStructRule> getPartyStructRules() {
		return this.partyStructRules;
	}

	/**
	 * @param partyStructRules
	 *            .
	 */
	public void setPartyStructRules(Set<PartyStructRule> partyStructRules) {
		this.partyStructRules = partyStructRules;
	}

	/** @return . */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "partyStructType")
	public Set<PartyStruct> getPartyStructs() {
		return this.partyStructs;
	}

	/**
	 * @param partyStructs
	 *            .
	 */
	public void setPartyStructs(Set<PartyStruct> partyStructs) {
		this.partyStructs = partyStructs;
	}
}
