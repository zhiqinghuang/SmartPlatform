package com.mossle.pim.persistence.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "WORK_REPORT_INFO")
public class WorkReportInfo implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String type;
	private String content;
	private Date reportDate;
	private Date createTime;
	private String userId;
	private String tenantId;
	private Set<WorkReportAttachment> workReportAttachments = new HashSet<WorkReportAttachment>(0);
	private Set<WorkReportAcl> workReportAcls = new HashSet<WorkReportAcl>(0);

	public WorkReportInfo() {
	}

	public WorkReportInfo(String type, String content, Date reportDate, Date createTime, String userId, String tenantId, Set<WorkReportAttachment> workReportAttachments, Set<WorkReportAcl> workReportAcls) {
		this.type = type;
		this.content = content;
		this.reportDate = reportDate;
		this.createTime = createTime;
		this.userId = userId;
		this.tenantId = tenantId;
		this.workReportAttachments = workReportAttachments;
		this.workReportAcls = workReportAcls;
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

	@Column(name = "TYPE", length = 50)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "CONTENT", length = 200)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "REPORT_DATE", length = 10)
	public Date getReportDate() {
		return this.reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME", length = 26)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "USER_ID", length = 64)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "workReportInfo")
	public Set<WorkReportAttachment> getWorkReportAttachments() {
		return this.workReportAttachments;
	}

	public void setWorkReportAttachments(Set<WorkReportAttachment> workReportAttachments) {
		this.workReportAttachments = workReportAttachments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "workReportInfo")
	public Set<WorkReportAcl> getWorkReportAcls() {
		return this.workReportAcls;
	}

	public void setWorkReportAcls(Set<WorkReportAcl> workReportAcls) {
		this.workReportAcls = workReportAcls;
	}
}
//need to confirm