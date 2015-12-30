package com.mossle.org.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ORG_POSITION")
public class OrgPosition implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private OrgPositionType orgPositionType;
	private String name;
	private Integer priority;
	private String scopeId;

	public OrgPosition() {
	}

	public OrgPosition(OrgPositionType orgPositionType, String name, Integer priority, String scopeId) {
		this.orgPositionType = orgPositionType;
		this.name = name;
		this.priority = priority;
		this.scopeId = scopeId;
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
	public OrgPositionType getOrgPositionType() {
		return this.orgPositionType;
	}

	public void setOrgPositionType(OrgPositionType orgPositionType) {
		this.orgPositionType = orgPositionType;
	}

	@Column(name = "NAME", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "PRIORITY")
	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@Column(name = "SCOPE_ID", length = 50)
	public String getScopeId() {
		return this.scopeId;
	}

	public void setScopeId(String scopeId) {
		this.scopeId = scopeId;
	}
}