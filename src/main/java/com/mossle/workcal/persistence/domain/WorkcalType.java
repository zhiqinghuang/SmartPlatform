package com.mossle.workcal.persistence.domain;

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
@Table(name = "WORKCAL_TYPE")
public class WorkcalType implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String name;
	private String tenantId;
	private Set<WorkcalRule> workcalRules = new HashSet<WorkcalRule>(0);

	public WorkcalType() {
	}

	public WorkcalType(String name, String tenantId, Set<WorkcalRule> workcalRules) {
		this.name = name;
		this.tenantId = tenantId;
		this.workcalRules = workcalRules;
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

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "workcalType")
	public Set<WorkcalRule> getWorkcalRules() {
		return this.workcalRules;
	}

	public void setWorkcalRules(Set<WorkcalRule> workcalRules) {
		this.workcalRules = workcalRules;
	}
}
//need to confirm