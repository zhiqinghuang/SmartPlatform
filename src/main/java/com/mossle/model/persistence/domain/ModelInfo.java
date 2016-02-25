package com.mossle.model.persistence.domain;

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
@Table(name = "MODEL_INFO")
public class ModelInfo implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String code;
	private String name;
	private String type;
	private String tenantId;
	private Set<ModelField> modelFields = new HashSet<ModelField>(0);

	public ModelInfo() {
	}

	public ModelInfo(String code, String name, String type, String tenantId, Set<ModelField> modelFields) {
		this.code = code;
		this.name = name;
		this.type = type;
		this.tenantId = tenantId;
		this.modelFields = modelFields;
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

	@Column(name = "CODE", length = 200)
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

	@Column(name = "TYPE", length = 50)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "modelInfo")
	public Set<ModelField> getModelFields() {
		return this.modelFields;
	}

	public void setModelFields(Set<ModelField> modelFields) {
		this.modelFields = modelFields;
	}
}
//need to confirm