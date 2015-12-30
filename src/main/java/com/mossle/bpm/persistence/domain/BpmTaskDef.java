package com.mossle.bpm.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BPM_TASK_DEF")
public class BpmTaskDef implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private BpmProcess bpmProcess;
	private String taskDefinitionKey;
	private String assignee;
	private String candidate;

	public BpmTaskDef() {
	}

	public BpmTaskDef(BpmProcess bpmProcess, String taskDefinitionKey, String assignee, String candidate) {
		this.bpmProcess = bpmProcess;
		this.taskDefinitionKey = taskDefinitionKey;
		this.assignee = assignee;
		this.candidate = candidate;
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
	@JoinColumn(name = "PROCESS_ID")
	public BpmProcess getBpmProcess() {
		return this.bpmProcess;
	}

	public void setBpmProcess(BpmProcess bpmProcess) {
		this.bpmProcess = bpmProcess;
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

	@Column(name = "CANDIDATE", length = 200)
	public String getCandidate() {
		return this.candidate;
	}

	public void setCandidate(String candidate) {
		this.candidate = candidate;
	}
}