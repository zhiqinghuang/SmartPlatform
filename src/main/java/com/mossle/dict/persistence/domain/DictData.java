package com.mossle.dict.persistence.domain;

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
 * DictData 数据字典.
 * 
 * @author Lingo
 */
@Entity
@Table(name = "DICT_DATA")
public class DictData implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	/** 唯一主键. */
	private Long id;

	/** 外键，DICT_SCHEMA. */
	private DictSchema dictSchema;

	/** 外键，DICT_INFO. */
	private DictInfo dictInfo;

	/** 名称. */
	private String name;

	/** 数据. */
	private String value;

	/** null. */
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

	/** @return 唯一主键. */
	@Id
	@GeneratedValue
	@Column(name = "ID", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	/**
	 * @param id
	 *            唯一主键.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/** @return 外键，DICT_SCHEMA. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SCHEMA_ID")
	public DictSchema getDictSchema() {
		return this.dictSchema;
	}

	/**
	 * @param dictSchema
	 *            外键，DICT_SCHEMA.
	 */
	public void setDictSchema(DictSchema dictSchema) {
		this.dictSchema = dictSchema;
	}

	/** @return 外键，DICT_INFO. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INFO_ID")
	public DictInfo getDictInfo() {
		return this.dictInfo;
	}

	/**
	 * @param dictInfo
	 *            外键，DICT_INFO.
	 */
	public void setDictInfo(DictInfo dictInfo) {
		this.dictInfo = dictInfo;
	}

	/** @return 名称. */
	@Column(name = "NAME", length = 200)
	public String getName() {
		return this.name;
	}

	/**
	 * @param name
	 *            名称.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/** @return 数据. */
	@Column(name = "VALUE", length = 200)
	public String getValue() {
		return this.value;
	}

	/**
	 * @param value
	 *            数据.
	 */
	public void setValue(String value) {
		this.value = value;
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
}
