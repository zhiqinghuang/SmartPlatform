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
@Table(name = "PIM_SCHEDULE")
public class PimSchedule implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String name;
	private String location;
	private String content;
	private Integer type;
	private Date startTime;
	private Date endTime;
	private String alertTime;
	private String userId;
	private Integer status;
	private String ref;
	private String tenantId;
	private Set<PimScheduleParticipant> pimScheduleParticipants = new HashSet<PimScheduleParticipant>(0);

	public PimSchedule() {
	}

	public PimSchedule(String name, String location, String content, Integer type, Date startTime, Date endTime, String alertTime, String userId, Integer status, String ref, String tenantId, Set<PimScheduleParticipant> pimScheduleParticipants) {
		this.name = name;
		this.location = location;
		this.content = content;
		this.type = type;
		this.startTime = startTime;
		this.endTime = endTime;
		this.alertTime = alertTime;
		this.userId = userId;
		this.status = status;
		this.ref = ref;
		this.tenantId = tenantId;
		this.pimScheduleParticipants = pimScheduleParticipants;
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

	@Column(name = "NAME", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "LOCATION", length = 200)
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name = "CONTENT", length = 200)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "TYPE")
	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "START_TIME", length = 26)
	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "END_TIME", length = 26)
	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	@Column(name = "ALERT_TIME", length = 50)
	public String getAlertTime() {
		return this.alertTime;
	}

	public void setAlertTime(String alertTime) {
		this.alertTime = alertTime;
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

	@Column(name = "REF", length = 100)
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pimSchedule")
	public Set<PimScheduleParticipant> getPimScheduleParticipants() {
		return this.pimScheduleParticipants;
	}

	public void setPimScheduleParticipants(Set<PimScheduleParticipant> pimScheduleParticipants) {
		this.pimScheduleParticipants = pimScheduleParticipants;
	}
}

//need to confirm