package com.mossle.humantask.persistence.domain;

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
@Table(name = "HT_HUMANTASK")
public class HtHumantask implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private HtHumantask htHumantask;
	private String name;
	private String description;
	private String assignee;
	private String owner;
	private String delegateStatus;
	private Integer priority;
	private Date createTime;
	private String duration;
	private String suspendStatus;
	private String category;
	private String code;
	private String form;
	private String taskId;
	private String executionId;
	private String processInstanceId;
	private String processDefinitionId;
	private String tenentId;
	private String status;
	private Date completeTime;
	private Set<HtParticipant> htParticipants = new HashSet<HtParticipant>(0);
	private Set<HtHumantask> htHumantasks = new HashSet<HtHumantask>(0);

	public HtHumantask() {
	}

	public HtHumantask(HtHumantask htHumantask, String name, String description, String assignee, String owner, String delegateStatus, Integer priority, Date createTime, String duration, String suspendStatus, String category, String code, String form, String taskId, String executionId, String processInstanceId, String processDefinitionId, String tenentId, String status, Date completeTime, Set<HtParticipant> htParticipants, Set<HtHumantask> htHumantasks) {
		this.htHumantask = htHumantask;
		this.name = name;
		this.description = description;
		this.assignee = assignee;
		this.owner = owner;
		this.delegateStatus = delegateStatus;
		this.priority = priority;
		this.createTime = createTime;
		this.duration = duration;
		this.suspendStatus = suspendStatus;
		this.category = category;
		this.code = code;
		this.form = form;
		this.taskId = taskId;
		this.executionId = executionId;
		this.processInstanceId = processInstanceId;
		this.processDefinitionId = processDefinitionId;
		this.tenentId = tenentId;
		this.status = status;
		this.completeTime = completeTime;
		this.htParticipants = htParticipants;
		this.htHumantasks = htHumantasks;
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
	@JoinColumn(name = "PARENT_ID")
	public HtHumantask getHtHumantask() {
		return this.htHumantask;
	}

	public void setHtHumantask(HtHumantask htHumantask) {
		this.htHumantask = htHumantask;
	}

	@Column(name = "NAME", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "DESCRIPTION", length = 200)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "ASSIGNEE", length = 64)
	public String getAssignee() {
		return this.assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	@Column(name = "OWNER", length = 64)
	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Column(name = "DELEGATE_STATUS", length = 50)
	public String getDelegateStatus() {
		return this.delegateStatus;
	}

	public void setDelegateStatus(String delegateStatus) {
		this.delegateStatus = delegateStatus;
	}

	@Column(name = "PRIORITY")
	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME", length = 26)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "DURATION", length = 50)
	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Column(name = "SUSPEND_STATUS", length = 50)
	public String getSuspendStatus() {
		return this.suspendStatus;
	}

	public void setSuspendStatus(String suspendStatus) {
		this.suspendStatus = suspendStatus;
	}

	@Column(name = "CATEGORY", length = 50)
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Column(name = "CODE", length = 200)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "FORM", length = 200)
	public String getForm() {
		return this.form;
	}

	public void setForm(String form) {
		this.form = form;
	}

	@Column(name = "TASK_ID", length = 200)
	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	@Column(name = "EXECUTION_ID", length = 200)
	public String getExecutionId() {
		return this.executionId;
	}

	public void setExecutionId(String executionId) {
		this.executionId = executionId;
	}

	@Column(name = "PROCESS_INSTANCE_ID", length = 200)
	public String getProcessInstanceId() {
		return this.processInstanceId;
	}

	public void setProcessInstanceId(String processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	@Column(name = "PROCESS_DEFINITION_ID", length = 200)
	public String getProcessDefinitionId() {
		return this.processDefinitionId;
	}

	public void setProcessDefinitionId(String processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
	}

	@Column(name = "TENENT_ID", length = 64)
	public String getTenentId() {
		return this.tenentId;
	}

	public void setTenentId(String tenentId) {
		this.tenentId = tenentId;
	}

	@Column(name = "STATUS", length = 50)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "COMPLETE_TIME", length = 26)
	public Date getCompleteTime() {
		return this.completeTime;
	}

	public void setCompleteTime(Date completeTime) {
		this.completeTime = completeTime;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "htHumantask")
	public Set<HtParticipant> getHtParticipants() {
		return this.htParticipants;
	}

	public void setHtParticipants(Set<HtParticipant> htParticipants) {
		this.htParticipants = htParticipants;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "htHumantask")
	public Set<HtHumantask> getHtHumantasks() {
		return this.htHumantasks;
	}

	public void setHtHumantasks(Set<HtHumantask> htHumantasks) {
		this.htHumantasks = htHumantasks;
	}
}
//need to confirm