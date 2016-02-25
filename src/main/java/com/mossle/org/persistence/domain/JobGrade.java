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
@Table(name = "JOB_GRADE")
public class JobGrade implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String name;
	private String tenantId;
	private Integer priority;
	private Set<JobLevel> jobLevels = new HashSet<JobLevel>(0);

	public JobGrade() {
	}

	public JobGrade(String name, String tenantId, Integer priority, Set<JobLevel> jobLevels) {
		this.name = name;
		this.tenantId = tenantId;
		this.priority = priority;
		this.jobLevels = jobLevels;
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

	@Column(name = "PRIORITY")
	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "jobGrade")
	public Set<JobLevel> getJobLevels() {
		return this.jobLevels;
	}

	public void setJobLevels(Set<JobLevel> jobLevels) {
		this.jobLevels = jobLevels;
	}
}
//need to confirm