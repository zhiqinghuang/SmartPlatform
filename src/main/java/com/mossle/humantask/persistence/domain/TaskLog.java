package com.mossle.humantask.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TaskLog .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "TASK_LOG")
public class TaskLog implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	/** null. */
	private Long id;

	/** null. */
	private TaskInfo taskInfo;

	/** null. */
	private String eventType;

	/** null. */
	private Date eventTime;

	/** null. */
	private String creator;

	/** null. */
	private String startOwner;

	/** null. */
	private String endOwner;

	/** null. */
	private String taskStatus;

	/** null. */
	private String content;

	/** null. */
	private Integer priority;

	public TaskLog() {
	}

	public TaskLog(TaskInfo taskInfo, String eventType, Date eventTime, String creator, String startOwner, String endOwner, String taskStatus, String content, Integer priority) {
		this.taskInfo = taskInfo;
		this.eventType = eventType;
		this.eventTime = eventTime;
		this.creator = creator;
		this.startOwner = startOwner;
		this.endOwner = endOwner;
		this.taskStatus = taskStatus;
		this.content = content;
		this.priority = priority;
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
	@JoinColumn(name = "TASK_ID")
	public TaskInfo getTaskInfo() {
		return this.taskInfo;
	}

	/**
	 * @param taskInfo
	 *            null.
	 */
	public void setTaskInfo(TaskInfo taskInfo) {
		this.taskInfo = taskInfo;
	}

	/** @return null. */
	@Column(name = "EVENT_TYPE", length = 100)
	public String getEventType() {
		return this.eventType;
	}

	/**
	 * @param eventType
	 *            null.
	 */
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	/** @return null. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "EVENT_TIME", length = 26)
	public Date getEventTime() {
		return this.eventTime;
	}

	/**
	 * @param eventTime
	 *            null.
	 */
	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
	}

	/** @return null. */
	@Column(name = "CREATOR", length = 64)
	public String getCreator() {
		return this.creator;
	}

	/**
	 * @param creator
	 *            null.
	 */
	public void setCreator(String creator) {
		this.creator = creator;
	}

	/** @return null. */
	@Column(name = "START_OWNER", length = 64)
	public String getStartOwner() {
		return this.startOwner;
	}

	/**
	 * @param startOwner
	 *            null.
	 */
	public void setStartOwner(String startOwner) {
		this.startOwner = startOwner;
	}

	/** @return null. */
	@Column(name = "END_OWNER", length = 64)
	public String getEndOwner() {
		return this.endOwner;
	}

	/**
	 * @param endOwner
	 *            null.
	 */
	public void setEndOwner(String endOwner) {
		this.endOwner = endOwner;
	}

	/** @return null. */
	@Column(name = "TASK_STATUS", length = 50)
	public String getTaskStatus() {
		return this.taskStatus;
	}

	/**
	 * @param taskStatus
	 *            null.
	 */
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

	/** @return null. */
	@Column(name = "CONTENT", length = 65535)
	public String getContent() {
		return this.content;
	}

	/**
	 * @param content
	 *            null.
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/** @return null. */
	@Column(name = "PRIORITY")
	public Integer getPriority() {
		return this.priority;
	}

	/**
	 * @param priority
	 *            null.
	 */
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
}
