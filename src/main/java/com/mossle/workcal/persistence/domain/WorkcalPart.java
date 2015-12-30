package com.mossle.workcal.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "WORKCAL_PART")
public class WorkcalPart implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private WorkcalRule workcalRule;
	private Integer shift;
	private String startTime;
	private String endTime;
	private String tenantId;

	public WorkcalPart() {
	}

	public WorkcalPart(WorkcalRule workcalRule, Integer shift, String startTime, String endTime, String tenantId) {
		this.workcalRule = workcalRule;
		this.shift = shift;
		this.startTime = startTime;
		this.endTime = endTime;
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
	@JoinColumn(name = "RULE_ID")
	public WorkcalRule getWorkcalRule() {
		return this.workcalRule;
	}

	public void setWorkcalRule(WorkcalRule workcalRule) {
		this.workcalRule = workcalRule;
	}

	@Column(name = "SHIFT")
	public Integer getShift() {
		return this.shift;
	}

	public void setShift(Integer shift) {
		this.shift = shift;
	}

	@Column(name = "START_TIME", length = 5)
	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	@Column(name = "END_TIME", length = 5)
	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
}