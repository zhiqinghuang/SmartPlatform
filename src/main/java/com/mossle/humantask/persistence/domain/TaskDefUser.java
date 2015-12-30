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
@Table(name = "TASK_DEF_USER")
public class TaskDefUser implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private TaskDefBase taskDefBase;
	private String value;
	private String type;
	private String catalog;

	public TaskDefUser() {
	}

	public TaskDefUser(TaskDefBase taskDefBase, String value, String type, String catalog) {
		this.taskDefBase = taskDefBase;
		this.value = value;
		this.type = type;
		this.catalog = catalog;
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
	@JoinColumn(name = "BASE_ID")
	public TaskDefBase getTaskDefBase() {
		return this.taskDefBase;
	}

	public void setTaskDefBase(TaskDefBase taskDefBase) {
		this.taskDefBase = taskDefBase;
	}

	@Column(name = "VALUE", length = 200)
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Column(name = "TYPE", length = 50)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "CATALOG", length = 200)
	public String getCatalog() {
		return this.catalog;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}
}