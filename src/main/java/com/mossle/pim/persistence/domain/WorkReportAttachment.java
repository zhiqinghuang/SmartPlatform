package com.mossle.pim.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "WORK_REPORT_ATTACHMENT")
public class WorkReportAttachment implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private WorkReportInfo workReportInfo;
	private String name;
	private Long fileSize;
	private String ref;
	private String tenantId;

	public WorkReportAttachment() {
	}

	public WorkReportAttachment(WorkReportInfo workReportInfo, String name, Long fileSize, String ref, String tenantId) {
		this.workReportInfo = workReportInfo;
		this.name = name;
		this.fileSize = fileSize;
		this.ref = ref;
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
	@JoinColumn(name = "INFO_ID")
	public WorkReportInfo getWorkReportInfo() {
		return this.workReportInfo;
	}

	public void setWorkReportInfo(WorkReportInfo workReportInfo) {
		this.workReportInfo = workReportInfo;
	}

	@Column(name = "NAME", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "FILE_SIZE")
	public Long getFileSize() {
		return this.fileSize;
	}

	public void setFileSize(Long fileSize) {
		this.fileSize = fileSize;
	}

	@Column(name = "REF", length = 200)
	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
}