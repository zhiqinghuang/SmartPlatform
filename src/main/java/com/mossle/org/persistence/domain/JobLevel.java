package com.mossle.org.persistence.domain;

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
@Table(name = "JOB_LEVEL")
public class JobLevel implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private JobGrade jobGrade;
	private String name;
	private String tenantId;
	private Integer priority;
	private Set<JobInfo> jobInfos = new HashSet<JobInfo>(0);

	public JobLevel() {
	}

	public JobLevel(JobGrade jobGrade, String name, String tenantId, Integer priority, Set<JobInfo> jobInfos) {
		this.jobGrade = jobGrade;
		this.name = name;
		this.tenantId = tenantId;
		this.priority = priority;
		this.jobInfos = jobInfos;
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
	@JoinColumn(name = "GRADE_ID")
	public JobGrade getJobGrade() {
		return this.jobGrade;
	}

	public void setJobGrade(JobGrade jobGrade) {
		this.jobGrade = jobGrade;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "jobLevel")
	public Set<JobInfo> getJobInfos() {
		return this.jobInfos;
	}

	public void setJobInfos(Set<JobInfo> jobInfos) {
		this.jobInfos = jobInfos;
	}
}