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
@Table(name = "DICT_INFO")
public class DictInfo implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private DictType dictType;
	private String name;
	private String value;
	private Integer priority;
	private String tenantId;
	private Set<DictData> dictDatas = new HashSet<DictData>(0);

	public DictInfo() {
	}

	public DictInfo(DictType dictType, String name, String value, Integer priority, String tenantId, Set<DictData> dictDatas) {
		this.dictType = dictType;
		this.name = name;
		this.value = value;
		this.priority = priority;
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

	@Column(name = "VALUE", length = 200)
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Column(name = "PRIORITY")
	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dictInfo")
	public Set<DictData> getDictDatas() {
		return this.dictDatas;
	}

	public void setDictDatas(Set<DictData> dictDatas) {
		this.dictDatas = dictDatas;
	}
}