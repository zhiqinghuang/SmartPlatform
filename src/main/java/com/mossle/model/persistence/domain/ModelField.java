package com.mossle.model.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MODEL_FIELD")
public class ModelField implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private ModelInfo modelInfo;
	private String code;
	private String name;
	private String type;
	private Integer priority;
	private String searchable;
	private String displayable;
	private String viewList;
	private String viewForm;
	private String tenantId;

	public ModelField() {
	}

	public ModelField(ModelInfo modelInfo, String code, String name, String type, Integer priority, String searchable, String displayable, String viewList, String viewForm, String tenantId) {
		this.modelInfo = modelInfo;
		this.code = code;
		this.name = name;
		this.type = type;
		this.priority = priority;
		this.searchable = searchable;
		this.displayable = displayable;
		this.viewList = viewList;
		this.viewForm = viewForm;
		this.tenantId = tenantId;
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
	@JoinColumn(name = "INFO_ID")
	public ModelInfo getModelInfo() {
		return this.modelInfo;
	}

	public void setModelInfo(ModelInfo modelInfo) {
		this.modelInfo = modelInfo;
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

	@Column(name = "TYPE", length = 200)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "PRIORITY")
	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@Column(name = "SEARCHABLE", length = 10)
	public String getSearchable() {
		return this.searchable;
	}

	public void setSearchable(String searchable) {
		this.searchable = searchable;
	}

	@Column(name = "DISPLAYABLE", length = 10)
	public String getDisplayable() {
		return this.displayable;
	}

	public void setDisplayable(String displayable) {
		this.displayable = displayable;
	}

	@Column(name = "VIEW_LIST", length = 10)
	public String getViewList() {
		return this.viewList;
	}

	public void setViewList(String viewList) {
		this.viewList = viewList;
	}

	@Column(name = "VIEW_FORM", length = 10)
	public String getViewForm() {
		return this.viewForm;
	}

	public void setViewForm(String viewForm) {
		this.viewForm = viewForm;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
}