package com.mossle.bpm.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BPM_TASK_CONF")
public class BpmTaskConf implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String businessKey;
	private String taskDefinitionKey;
	private String assignee;

	public BpmTaskConf() {
	}

	public BpmTaskConf(String businessKey, String taskDefinitionKey, String assignee) {
		this.businessKey = businessKey;
		this.taskDefinitionKey = taskDefinitionKey;
		this.assignee = assignee;
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

	@Column(name = "BUSINESS_KEY", length = 200)
	public String getBusinessKey() {
		return this.businessKey;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	@Column(name = "TASK_DEFINITION_KEY", length = 200)
	public String getTaskDefinitionKey() {
		return this.taskDefinitionKey;
	}

	public void setTaskDefinitionKey(String taskDefinitionKey) {
		this.taskDefinitionKey = taskDefinitionKey;
	}

	@Column(name = "ASSIGNEE", length = 200)
	public String getAssignee() {
		return this.assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
}