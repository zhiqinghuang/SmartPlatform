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
@Table(name = "JOB_USER")
public class JobUser implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private JobInfo jobInfo;
	private String userRef;
	private String tenantId;

	public JobUser() {
	}

	public JobUser(JobInfo jobInfo, String userRef, String tenantId) {
		this.jobInfo = jobInfo;
		this.userRef = userRef;
		this.tenantId = tenantId;
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
	@JoinColumn(name = "JOB_INFO_ID")
	public JobInfo getJobInfo() {
		return this.jobInfo;
	}

	public void setJobInfo(JobInfo jobInfo) {
		this.jobInfo = jobInfo;
	}

	@Column(name = "USER_REF", length = 50)
	public String getUserRef() {
		return this.userRef;
	}

	public void setUserRef(String userRef) {
		this.userRef = userRef;
	}

	@Column(name = "TENANT_ID", length = 50)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
}
//need to confirm