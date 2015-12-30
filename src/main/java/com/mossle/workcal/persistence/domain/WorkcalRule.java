package com.mossle.workcal.persistence.domain;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "WORKCAL_RULE")
public class WorkcalRule implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private WorkcalType workcalType;
	private Integer year;
	private Integer week;
	private String name;
	private Date workDate;
	private Integer status;
	private String tenantId;
	private Set<WorkcalPart> workcalParts = new HashSet<WorkcalPart>(0);

	public WorkcalRule() {
	}

	public WorkcalRule(WorkcalType workcalType, Integer year, Integer week, String name, Date workDate, Integer status, String tenantId, Set<WorkcalPart> workcalParts) {
		this.workcalType = workcalType;
		this.year = year;
		this.week = week;
		this.name = name;
		this.workDate = workDate;
		this.status = status;
		this.tenantId = tenantId;
		this.workcalParts = workcalParts;
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
	public WorkcalType getWorkcalType() {
		return this.workcalType;
	}

	public void setWorkcalType(WorkcalType workcalType) {
		this.workcalType = workcalType;
	}

	@Column(name = "YEAR")
	public Integer getYear() {
		return this.year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Column(name = "WEEK")
	public Integer getWeek() {
		return this.week;
	}

	public void setWeek(Integer week) {
		this.week = week;
	}

	@Column(name = "NAME", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "WORK_DATE", length = 26)
	public Date getWorkDate() {
		return this.workDate;
	}

	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "workcalRule")
	public Set<WorkcalPart> getWorkcalParts() {
		return this.workcalParts;
	}

	public void setWorkcalParts(Set<WorkcalPart> workcalParts) {
		this.workcalParts = workcalParts;
	}
}