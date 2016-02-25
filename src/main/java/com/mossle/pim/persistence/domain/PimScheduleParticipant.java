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
@Table(name = "PIM_SCHEDULE_PARTICIPANT")
public class PimScheduleParticipant implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private PimSchedule pimSchedule;
	private Integer type;
	private String userId;
	private Integer status;
	private String tenantId;

	public PimScheduleParticipant() {
	}

	public PimScheduleParticipant(PimSchedule pimSchedule, Integer type, String userId, Integer status, String tenantId) {
		this.pimSchedule = pimSchedule;
		this.type = type;
		this.userId = userId;
		this.status = status;
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
	@JoinColumn(name = "SCHEDULE_ID")
	public PimSchedule getPimSchedule() {
		return this.pimSchedule;
	}

	public void setPimSchedule(PimSchedule pimSchedule) {
		this.pimSchedule = pimSchedule;
	}

	@Column(name = "TYPE")
	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Column(name = "USER_ID", length = 64)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "STATUS")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
}
//need to confirm