package com.mossle.humantask.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TASK_DEF_ESCALATION")
public class TaskDefEscalation implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private TaskDefDeadline taskDefDeadline;
	private String type;
	private String status;
	private String condition;
	private String value;

	public TaskDefEscalation() {
	}

	public TaskDefEscalation(TaskDefDeadline taskDefDeadline, String type, String status, String condition, String value) {
		this.taskDefDeadline = taskDefDeadline;
		this.type = type;
		this.status = status;
		this.condition = condition;
		this.value = value;
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
	@JoinColumn(name = "DEADLINE_ID")
	public TaskDefDeadline getTaskDefDeadline() {
		return this.taskDefDeadline;
	}

	public void setTaskDefDeadline(TaskDefDeadline taskDefDeadline) {
		this.taskDefDeadline = taskDefDeadline;
	}

	@Column(name = "TYPE", length = 50)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "STATUS", length = 50)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "CONDITION", length = 200)
	public String getCondition() {
		return this.condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	@Column(name = "VALUE", length = 200)
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
//need to confirm