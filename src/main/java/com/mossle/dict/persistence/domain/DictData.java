package com.mossle.dict.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DICT_DATA")
public class DictData implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private DictSchema dictSchema;
	private DictInfo dictInfo;
	private String name;
	private String value;
	private String tenantId;

	public DictData() {
	}

	public DictData(DictSchema dictSchema, DictInfo dictInfo, String name, String value, String tenantId) {
		this.dictSchema = dictSchema;
		this.dictInfo = dictInfo;
		this.name = name;
		this.value = value;
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
	@JoinColumn(name = "SCHEMA_ID")
	public DictSchema getDictSchema() {
		return this.dictSchema;
	}

	public void setDictSchema(DictSchema dictSchema) {
		this.dictSchema = dictSchema;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INFO_ID")
	public DictInfo getDictInfo() {
		return this.dictInfo;
	}

	public void setDictInfo(DictInfo dictInfo) {
		this.dictInfo = dictInfo;
	}

	@Column(name = "NAME", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "VALUE", length = 200)
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
}