package com.mossle.meeting.persistence.domain;

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
@Table(name = "MEETING_INFO")
public class MeetingInfo implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private MeetingRoom meetingRoom;
	private String subject;
	private String content;
	private Date createTime;
	private Date startTime;
	private Date endTime;
	private String organizer;
	private String meetingTimezone;
	private String type;
	private String catalog;
	private String status;
	private String tenantId;
	private Set<MeetingItem> meetingItems = new HashSet<MeetingItem>(0);
	private Set<MeetingAttendee> meetingAttendees = new HashSet<MeetingAttendee>(0);

	public MeetingInfo() {
	}

	public MeetingInfo(MeetingRoom meetingRoom, String subject, String content, Date createTime, Date startTime, Date endTime, String organizer, String meetingTimezone, String type, String catalog, String status, String tenantId, Set<MeetingItem> meetingItems, Set<MeetingAttendee> meetingAttendees) {
		this.meetingRoom = meetingRoom;
		this.subject = subject;
		this.content = content;
		this.createTime = createTime;
		this.startTime = startTime;
		this.endTime = endTime;
		this.organizer = organizer;
		this.meetingTimezone = meetingTimezone;
		this.type = type;
		this.catalog = catalog;
		this.status = status;
		this.tenantId = tenantId;
		this.meetingItems = meetingItems;
		this.meetingAttendees = meetingAttendees;
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
	@JoinColumn(name = "MEETING_ROOM_ID")
	public MeetingRoom getMeetingRoom() {
		return this.meetingRoom;
	}

	public void setMeetingRoom(MeetingRoom meetingRoom) {
		this.meetingRoom = meetingRoom;
	}

	@Column(name = "SUBJECT", length = 200)
	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Column(name = "CONTENT", length = 200)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME", length = 26)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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

	@Column(name = "ORGANIZER", length = 64)
	public String getOrganizer() {
		return this.organizer;
	}

	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}

	@Column(name = "MEETING_TIMEZONE", length = 50)
	public String getMeetingTimezone() {
		return this.meetingTimezone;
	}

	public void setMeetingTimezone(String meetingTimezone) {
		this.meetingTimezone = meetingTimezone;
	}

	@Column(name = "TYPE", length = 50)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "CATALOG", length = 50)
	public String getCatalog() {
		return this.catalog;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	@Column(name = "STATUS", length = 50)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "meetingInfo")
	public Set<MeetingItem> getMeetingItems() {
		return this.meetingItems;
	}

	public void setMeetingItems(Set<MeetingItem> meetingItems) {
		this.meetingItems = meetingItems;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "meetingInfo")
	public Set<MeetingAttendee> getMeetingAttendees() {
		return this.meetingAttendees;
	}

	public void setMeetingAttendees(Set<MeetingAttendee> meetingAttendees) {
		this.meetingAttendees = meetingAttendees;
	}
}
//need to confirm