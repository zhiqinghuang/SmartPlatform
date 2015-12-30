package com.mossle.org.persistence.domain;

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
@Table(name = "ORG_POSITION_TYPE")
public class OrgPositionType implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String name;
	private String scopeId;
	private Set<OrgPosition> orgPositions = new HashSet<OrgPosition>(0);

	public OrgPositionType() {
	}

	public OrgPositionType(String name, String scopeId, Set<OrgPosition> orgPositions) {
		this.name = name;
		this.scopeId = scopeId;
		this.orgPositions = orgPositions;
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

	@Column(name = "NAME", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "SCOPE_ID", length = 50)
	public String getScopeId() {
		return this.scopeId;
	}

	public void setScopeId(String scopeId) {
		this.scopeId = scopeId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "orgPositionType")
	public Set<OrgPosition> getOrgPositions() {
		return this.orgPositions;
	}

	public void setOrgPositions(Set<OrgPosition> orgPositions) {
		this.orgPositions = orgPositions;
	}
}