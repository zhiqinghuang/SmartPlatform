package com.mossle.dict.persistence.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DICT_SCHEMA")
public class DictSchema implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private DictType dictType;
	private String name;
	private String type;
	private Integer priority;
	private String descn;
	private String tenantId;
	private Set<DictData> dictDatas = new HashSet<DictData>(0);

	public DictSchema() {
	}

	public DictSchema(DictType dictType, String name, String type, Integer priority, String descn, String tenantId, Set<DictData> dictDatas) {
		this.dictType = dictType;
		this.name = name;
		this.type = type;
		this.priority = priority;
		this.descn = descn;
		this.tenantId = tenantId;
		this.dictDatas = dictDatas;
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
	@JoinColumn(name = "TYPE_ID")
	public DictType getDictType() {
		return this.dictType;
	}

	public void setDictType(DictType dictType) {
		this.dictType = dictType;
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

	@Column(name = "PRIORITY")
	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@Column(name = "DESCN", length = 200)
	public String getDescn() {
		return this.descn;
	}

	public void setDescn(String descn) {
		this.descn = descn;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dictSchema")
	public Set<DictData> getDictDatas() {
		return this.dictDatas;
	}

	public void setDictDatas(Set<DictData> dictDatas) {
		this.dictDatas = dictDatas;
	}
}