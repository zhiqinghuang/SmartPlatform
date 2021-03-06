package com.mossle.humantask.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TASK_CONF_USER")
public class TaskConfUser implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String businessKey;
	private String code;
	private String value;

	public TaskConfUser() {
	}

	public TaskConfUser(String businessKey, String code, String value) {
		this.businessKey = businessKey;
		this.code = code;
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

	@Column(name = "BUSINESS_KEY", length = 200)
	public String getBusinessKey() {
		return this.businessKey;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	@Column(name = "CODE", length = 200)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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