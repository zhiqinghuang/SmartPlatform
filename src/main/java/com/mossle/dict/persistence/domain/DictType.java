package com.mossle.dict.persistence.domain;

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
@Table(name = "DICT_TYPE")
public class DictType implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String name;
	private String type;
	private String descn;
	private String tenantId;
	private Set<DictSchema> dictSchemas = new HashSet<DictSchema>(0);
	private Set<DictInfo> dictInfos = new HashSet<DictInfo>(0);

	public DictType() {
	}

	public DictType(String name, String type, String descn, String tenantId, Set<DictSchema> dictSchemas, Set<DictInfo> dictInfos) {
		this.name = name;
		this.type = type;
		this.descn = descn;
		this.tenantId = tenantId;
		this.dictSchemas = dictSchemas;
		this.dictInfos = dictInfos;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dictType")
	public Set<DictSchema> getDictSchemas() {
		return this.dictSchemas;
	}

	public void setDictSchemas(Set<DictSchema> dictSchemas) {
		this.dictSchemas = dictSchemas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "dictType")
	public Set<DictInfo> getDictInfos() {
		return this.dictInfos;
	}

	public void setDictInfos(Set<DictInfo> dictInfos) {
		this.dictInfos = dictInfos;
	}
}