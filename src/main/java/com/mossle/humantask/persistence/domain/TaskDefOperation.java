package com.mossle.humantask.persistence.domain;

// Generated by Hibernate Tools
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TaskDefOperation .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "TASK_DEF_OPERATION")
public class TaskDefOperation implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	/** null. */
	private Long id;

	/** null. */
	private TaskDefBase taskDefBase;

	/** null. */
	private String value;

	/** null. */
	private String type;

	/** null. */
	private String status;

	/** null. */
	private Integer priority;

	public TaskDefOperation() {
	}

	public TaskDefOperation(TaskDefBase taskDefBase, String value, String type, String status, Integer priority) {
		this.taskDefBase = taskDefBase;
		this.value = value;
		this.type = type;
		this.status = status;
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
	@JoinColumn(name = "BASE_ID")
	public TaskDefBase getTaskDefBase() {
		return this.taskDefBase;
	}

	/**
	 * @param taskDefBase
	 *            null.
	 */
	public void setTaskDefBase(TaskDefBase taskDefBase) {
		this.taskDefBase = taskDefBase;
	}

	/** @return null. */
	@Column(name = "VALUE", length = 200)
	public String getValue() {
		return this.value;
	}

	/**
	 * @param value
	 *            null.
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/** @return null. */
	@Column(name = "TYPE", length = 50)
	public String getType() {
		return this.type;
	}

	/**
	 * @param type
	 *            null.
	 */
	public void setType(String type) {
		this.type = type;
	}

	/** @return null. */
	@Column(name = "STATUS", length = 50)
	public String getStatus() {
		return this.status;
	}

	/**
	 * @param status
	 *            null.
	 */
	public void setStatus(String status) {
		this.status = status;
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
