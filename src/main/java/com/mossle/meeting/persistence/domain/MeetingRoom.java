package com.mossle.meeting.persistence.domain;

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
@Table(name = "MEETING_ROOM")
public class MeetingRoom implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String name;
	private String mapRef;
	private Integer num;
	private String projector;
	private String type;
	private Date startTime;
	private Date endTime;
	private String building;
	private String floor;
	private String tenantId;
	private Set<MeetingInfo> meetingInfos = new HashSet<MeetingInfo>(0);

	public MeetingRoom() {
	}

	public MeetingRoom(String name, String mapRef, Integer num, String projector, String type, Date startTime, Date endTime, String building, String floor, String tenantId, Set<MeetingInfo> meetingInfos) {
		this.name = name;
		this.mapRef = mapRef;
		this.num = num;
		this.projector = projector;
		this.type = type;
		this.startTime = startTime;
		this.endTime = endTime;
		this.building = building;
		this.floor = floor;
		this.tenantId = tenantId;
		this.meetingInfos = meetingInfos;
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

	@Column(name = "MAP_REF", length = 200)
	public String getMapRef() {
		return this.mapRef;
	}

	public void setMapRef(String mapRef) {
		this.mapRef = mapRef;
	}

	@Column(name = "NUM")
	public Integer getNum() {
		return this.num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	@Column(name = "PROJECTOR", length = 50)
	public String getProjector() {
		return this.projector;
	}

	public void setProjector(String projector) {
		this.projector = projector;
	}

	@Column(name = "TYPE", length = 50)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
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

	@Column(name = "BUILDING", length = 200)
	public String getBuilding() {
		return this.building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	@Column(name = "FLOOR", length = 50)
	public String getFloor() {
		return this.floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "meetingRoom")
	public Set<MeetingInfo> getMeetingInfos() {
		return this.meetingInfos;
	}

	public void setMeetingInfos(Set<MeetingInfo> meetingInfos) {
		this.meetingInfos = meetingInfos;
	}
}