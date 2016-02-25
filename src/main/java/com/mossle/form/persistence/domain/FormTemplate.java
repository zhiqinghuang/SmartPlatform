package com.mossle.form.persistence.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "FORM_TEMPLATE")
public class FormTemplate implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private Integer type;
	private String name;
	private String content;
	private String code;
	private String tenantId;
	private String userId;
	private Date createTime;
	private Set<FormSchema> formSchemas = new HashSet<FormSchema>(0);

	public FormTemplate() {
	}

	public FormTemplate(Integer type, String name, String content, String code, String tenantId, String userId, Date createTime, Set<FormSchema> formSchemas) {
		this.type = type;
		this.name = name;
		this.content = content;
		this.code = code;
		this.tenantId = tenantId;
		this.userId = userId;
		this.createTime = createTime;
		this.formSchemas = formSchemas;
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

	@Column(name = "TYPE")
	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	@Column(name = "NAME", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "CONTENT", length = 65535)
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "CODE", length = 50)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@Column(name = "USER_ID", length = 64)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME", length = 26)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "formTemplate")
	public Set<FormSchema> getFormSchemas() {
		return this.formSchemas;
	}

	public void setFormSchemas(Set<FormSchema> formSchemas) {
		this.formSchemas = formSchemas;
	}
}
//need to confirm