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
@Table(name = "JOB_INFO")
public class JobInfo implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private JobType jobType;
	private JobLevel jobLevel;
	private JobTitle jobTitle;
	private String name;
	private String tenantId;
	private Set<JobUser> jobUsers = new HashSet<JobUser>(0);

	public JobInfo() {
	}

	public JobInfo(JobType jobType, JobLevel jobLevel, JobTitle jobTitle, String name, String tenantId, Set<JobUser> jobUsers) {
		this.jobType = jobType;
		this.jobLevel = jobLevel;
		this.jobTitle = jobTitle;
		this.name = name;
		this.tenantId = tenantId;
		this.jobUsers = jobUsers;
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
	public JobType getJobType() {
		return this.jobType;
	}

	public void setJobType(JobType jobType) {
		this.jobType = jobType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LEVEL_ID")
	public JobLevel getJobLevel() {
		return this.jobLevel;
	}

	public void setJobLevel(JobLevel jobLevel) {
		this.jobLevel = jobLevel;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TITLE_ID")
	public JobTitle getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(JobTitle jobTitle) {
		this.jobTitle = jobTitle;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "jobInfo")
	public Set<JobUser> getJobUsers() {
		return this.jobUsers;
	}

	public void setJobUsers(Set<JobUser> jobUsers) {
		this.jobUsers = jobUsers;
	}
}