package com.mossle.bpm.persistence.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

@Entity
@Table(name = "BPM_CATEGORY")
public class BpmCategory implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String name;
	private Integer priority;
	private String tenantId;
	private Set<BpmProcess> bpmProcesses = new HashSet<BpmProcess>(0);

	public BpmCategory() {
	}

	public BpmCategory(String name, Integer priority, String tenantId, Set<BpmProcess> bpmProcesses) {
		this.name = name;
		this.priority = priority;
		this.tenantId = tenantId;
		this.bpmProcesses = bpmProcesses;
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

	@Column(name = "PRIORITY")
	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bpmCategory")
	@OrderBy("priority")
	public Set<BpmProcess> getBpmProcesses() {
		return this.bpmProcesses;
	}

	public void setBpmProcesses(Set<BpmProcess> bpmProcesses) {
		this.bpmProcesses = bpmProcesses;
	}
}
//need to confirm