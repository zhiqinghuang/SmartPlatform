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
@Table(name = "JOB_TYPE")
public class JobType implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private JobType jobType;
	private String name;
	private String tenantId;
	private Set<JobInfo> jobInfos = new HashSet<JobInfo>(0);
	private Set<JobType> jobTypes = new HashSet<JobType>(0);

	public JobType() {
	}

	public JobType(JobType jobType, String name, String tenantId, Set<JobInfo> jobInfos, Set<JobType> jobTypes) {
		this.jobType = jobType;
		this.name = name;
		this.tenantId = tenantId;
		this.jobInfos = jobInfos;
		this.jobTypes = jobTypes;
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
	@JoinColumn(name = "PARENT_ID")
	public JobType getJobType() {
		return this.jobType;
	}

	public void setJobType(JobType jobType) {
		this.jobType = jobType;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "jobType")
	public Set<JobInfo> getJobInfos() {
		return this.jobInfos;
	}

	public void setJobInfos(Set<JobInfo> jobInfos) {
		this.jobInfos = jobInfos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "jobType")
	public Set<JobType> getJobTypes() {
		return this.jobTypes;
	}

	public void setJobTypes(Set<JobType> jobTypes) {
		this.jobTypes = jobTypes;
	}
}
//need to confirm