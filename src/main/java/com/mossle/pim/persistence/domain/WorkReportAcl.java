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
@Table(name = "WORK_REPORT_ACL")
public class WorkReportAcl implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private WorkReportInfo workReportInfo;
	private String type;
	private String ref;
	private String tenantId;

	public WorkReportAcl() {
	}

	public WorkReportAcl(WorkReportInfo workReportInfo, String type, String ref, String tenantId) {
		this.workReportInfo = workReportInfo;
		this.type = type;
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

	@Column(name = "TYPE", length = 200)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
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