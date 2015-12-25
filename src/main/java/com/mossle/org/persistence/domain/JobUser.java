package com.mossle.org.persistence.domain;

// Generated by Hibernate Tools
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * JobUser .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "JOB_USER")
public class JobUser implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	/** null. */
	private Long id;

	/** null. */
	private JobInfo jobInfo;

	/** null. */
	private String userRef;

	/** null. */
	private String tenantId;

	public JobUser() {
	}

	public JobUser(JobInfo jobInfo, String userRef, String tenantId) {
		this.jobInfo = jobInfo;
		this.userRef = userRef;
		this.tenantId = tenantId;
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
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "JOB_INFO_ID")
	public JobInfo getJobInfo() {
		return this.jobInfo;
	}

	/**
	 * @param jobInfo
	 *            null.
	 */
	public void setJobInfo(JobInfo jobInfo) {
		this.jobInfo = jobInfo;
	}

	/** @return null. */
	@Column(name = "USER_REF", length = 50)
	public String getUserRef() {
		return this.userRef;
	}

	/**
	 * @param userRef
	 *            null.
	 */
	public void setUserRef(String userRef) {
		this.userRef = userRef;
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
}
