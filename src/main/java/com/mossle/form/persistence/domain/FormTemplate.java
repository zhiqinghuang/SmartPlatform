package com.mossle.form.persistence.domain;

// Generated by Hibernate Tools
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

/**
 * FormTemplate .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "FORM_TEMPLATE")
public class FormTemplate implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	/** null. */
	private Long id;

	/** null. */
	private Integer type;

	/** null. */
	private String name;

	/** null. */
	private String content;

	/** null. */
	private String code;

	/** null. */
	private String tenantId;

	/** null. */
	private String userId;

	/** null. */
	private Date createTime;

	/** . */
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
	@Column(name = "TYPE")
	public Integer getType() {
		return this.type;
	}

	/**
	 * @param type
	 *            null.
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/** @return null. */
	@Column(name = "NAME", length = 200)
	public String getName() {
		return this.name;
	}

	/**
	 * @param name
	 *            null.
	 */
	public void setName(String name) {
		this.name = name;
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
	@Column(name = "CODE", length = 50)
	public String getCode() {
		return this.code;
	}

	/**
	 * @param code
	 *            null.
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/** @return null. */
	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	/**
	 * @param tenantId
	 *            null.
	 */
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	/** @return null. */
	@Column(name = "USER_ID", length = 64)
	public String getUserId() {
		return this.userId;
	}

	/**
	 * @param userId
	 *            null.
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/** @return null. */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME", length = 26)
	public Date getCreateTime() {
		return this.createTime;
	}

	/**
	 * @param createTime
	 *            null.
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/** @return . */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "formTemplate")
	public Set<FormSchema> getFormSchemas() {
		return this.formSchemas;
	}

	/**
	 * @param formSchemas
	 *            .
	 */
	public void setFormSchemas(Set<FormSchema> formSchemas) {
		this.formSchemas = formSchemas;
	}
}
