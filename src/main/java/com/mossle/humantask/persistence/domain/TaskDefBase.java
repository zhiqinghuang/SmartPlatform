package com.mossle.humantask.persistence.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TASK_DEF_BASE")
public class TaskDefBase implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String code;
	private String name;
	private String processDefinitionId;
	private String formKey;
	private String formType;
	private String countersignType;
	private String countersignUser;
	private String countersignStrategy;
	private Integer countersignRate;
	private String assignStrategy;
	private Set<TaskDefDeadline> taskDefDeadlines = new HashSet<TaskDefDeadline>(0);
	private Set<TaskDefNotification> taskDefNotifications = new HashSet<TaskDefNotification>(0);
	private Set<TaskDefUser> taskDefUsers = new HashSet<TaskDefUser>(0);
	private Set<TaskDefOperation> taskDefOperations = new HashSet<TaskDefOperation>(0);

	public TaskDefBase() {
	}

	public TaskDefBase(String code, String name, String processDefinitionId, String formKey, String formType, String countersignType, String countersignUser, String countersignStrategy, Integer countersignRate, String assignStrategy, Set<TaskDefDeadline> taskDefDeadlines, Set<TaskDefNotification> taskDefNotifications, Set<TaskDefUser> taskDefUsers, Set<TaskDefOperation> taskDefOperations) {
		this.code = code;
		this.name = name;
		this.processDefinitionId = processDefinitionId;
		this.formKey = formKey;
		this.formType = formType;
		this.countersignType = countersignType;
		this.countersignUser = countersignUser;
		this.countersignStrategy = countersignStrategy;
		this.countersignRate = countersignRate;
		this.assignStrategy = assignStrategy;
		this.taskDefDeadlines = taskDefDeadlines;
		this.taskDefNotifications = taskDefNotifications;
		this.taskDefUsers = taskDefUsers;
		this.taskDefOperations = taskDefOperations;
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

	@Column(name = "CODE", length = 100)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "NAME", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "PROCESS_DEFINITION_ID", length = 200)
	public String getProcessDefinitionId() {
		return this.processDefinitionId;
	}

	public void setProcessDefinitionId(String processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
	}

	@Column(name = "FORM_KEY", length = 200)
	public String getFormKey() {
		return this.formKey;
	}

	public void setFormKey(String formKey) {
		this.formKey = formKey;
	}

	@Column(name = "FORM_TYPE", length = 50)
	public String getFormType() {
		return this.formType;
	}

	public void setFormType(String formType) {
		this.formType = formType;
	}

	@Column(name = "COUNTERSIGN_TYPE", length = 50)
	public String getCountersignType() {
		return this.countersignType;
	}

	public void setCountersignType(String countersignType) {
		this.countersignType = countersignType;
	}

	@Column(name = "COUNTERSIGN_USER", length = 200)
	public String getCountersignUser() {
		return this.countersignUser;
	}

	public void setCountersignUser(String countersignUser) {
		this.countersignUser = countersignUser;
	}

	@Column(name = "COUNTERSIGN_STRATEGY", length = 50)
	public String getCountersignStrategy() {
		return this.countersignStrategy;
	}

	public void setCountersignStrategy(String countersignStrategy) {
		this.countersignStrategy = countersignStrategy;
	}

	@Column(name = "COUNTERSIGN_RATE")
	public Integer getCountersignRate() {
		return this.countersignRate;
	}

	public void setCountersignRate(Integer countersignRate) {
		this.countersignRate = countersignRate;
	}

	@Column(name = "ASSIGN_STRATEGY", length = 100)
	public String getAssignStrategy() {
		return this.assignStrategy;
	}

	public void setAssignStrategy(String assignStrategy) {
		this.assignStrategy = assignStrategy;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "taskDefBase")
	public Set<TaskDefDeadline> getTaskDefDeadlines() {
		return this.taskDefDeadlines;
	}

	public void setTaskDefDeadlines(Set<TaskDefDeadline> taskDefDeadlines) {
		this.taskDefDeadlines = taskDefDeadlines;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "taskDefBase")
	public Set<TaskDefNotification> getTaskDefNotifications() {
		return this.taskDefNotifications;
	}

	public void setTaskDefNotifications(Set<TaskDefNotification> taskDefNotifications) {
		this.taskDefNotifications = taskDefNotifications;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "taskDefBase")
	public Set<TaskDefUser> getTaskDefUsers() {
		return this.taskDefUsers;
	}

	public void setTaskDefUsers(Set<TaskDefUser> taskDefUsers) {
		this.taskDefUsers = taskDefUsers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "taskDefBase")
	public Set<TaskDefOperation> getTaskDefOperations() {
		return this.taskDefOperations;
	}

	public void setTaskDefOperations(Set<TaskDefOperation> taskDefOperations) {
		this.taskDefOperations = taskDefOperations;
	}
}