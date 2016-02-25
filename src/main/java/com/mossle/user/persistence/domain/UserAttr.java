package com.mossle.user.persistence.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "USER_ATTR")
public class UserAttr implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private UserBase userBase;
	private UserSchema userSchema;
	private Integer booleanValue;
	private Date dateValue;
	private Long longValue;
	private Double doubleValue;
	private String stringValue;
	private String scopeId;

	public UserAttr() {
	}

	public UserAttr(UserBase userBase, UserSchema userSchema, Integer booleanValue, Date dateValue, Long longValue, Double doubleValue, String stringValue, String scopeId) {
		this.userBase = userBase;
		this.userSchema = userSchema;
		this.booleanValue = booleanValue;
		this.dateValue = dateValue;
		this.longValue = longValue;
		this.doubleValue = doubleValue;
		this.stringValue = stringValue;
		this.scopeId = scopeId;
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
	@JoinColumn(name = "USER_BASE_ID")
	public UserBase getUserBase() {
		return this.userBase;
	}

	public void setUserBase(UserBase userBase) {
		this.userBase = userBase;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_SCHEMA_ID")
	public UserSchema getUserSchema() {
		return this.userSchema;
	}

	public void setUserSchema(UserSchema userSchema) {
		this.userSchema = userSchema;
	}

	@Column(name = "BOOLEAN_VALUE")
	public Integer getBooleanValue() {
		return this.booleanValue;
	}

	public void setBooleanValue(Integer booleanValue) {
		this.booleanValue = booleanValue;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_VALUE", length = 26)
	public Date getDateValue() {
		return this.dateValue;
	}

	public void setDateValue(Date dateValue) {
		this.dateValue = dateValue;
	}

	@Column(name = "LONG_VALUE")
	public Long getLongValue() {
		return this.longValue;
	}

	public void setLongValue(Long longValue) {
		this.longValue = longValue;
	}

	@Column(name = "DOUBLE_VALUE", precision = 64, scale = 0)
	public Double getDoubleValue() {
		return this.doubleValue;
	}

	public void setDoubleValue(Double doubleValue) {
		this.doubleValue = doubleValue;
	}

	@Column(name = "STRING_VALUE", length = 200)
	public String getStringValue() {
		return this.stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	@Column(name = "SCOPE_ID", length = 50)
	public String getScopeId() {
		return this.scopeId;
	}

	public void setScopeId(String scopeId) {
		this.scopeId = scopeId;
	}
}
//need to confirm