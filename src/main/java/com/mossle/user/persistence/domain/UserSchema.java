package com.mossle.user.persistence.domain;

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
@Table(name = "USER_SCHEMA")
public class UserSchema implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private UserRepo userRepo;
	private String code;
	private String name;
	private String type;
	private Integer readOnly;
	private Integer notNull;
	private Integer uniqueConstraint;
	private String validator;
	private String conversionPattern;
	private Integer multiple;
	private String enumerationKeys;
	private String enumerationValues;
	private String scopeId;
	private Set<UserAttr> userAttrs = new HashSet<UserAttr>(0);

	public UserSchema() {
	}

	public UserSchema(UserRepo userRepo, String code, String name, String type, Integer readOnly, Integer notNull, Integer uniqueConstraint, String validator, String conversionPattern, Integer multiple, String enumerationKeys, String enumerationValues, String scopeId, Set<UserAttr> userAttrs) {
		this.userRepo = userRepo;
		this.code = code;
		this.name = name;
		this.type = type;
		this.readOnly = readOnly;
		this.notNull = notNull;
		this.uniqueConstraint = uniqueConstraint;
		this.validator = validator;
		this.conversionPattern = conversionPattern;
		this.multiple = multiple;
		this.enumerationKeys = enumerationKeys;
		this.enumerationValues = enumerationValues;
		this.scopeId = scopeId;
		this.userAttrs = userAttrs;
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
	@JoinColumn(name = "USER_REPO_ID")
	public UserRepo getUserRepo() {
		return this.userRepo;
	}

	public void setUserRepo(UserRepo userRepo) {
		this.userRepo = userRepo;
	}

	@Column(name = "CODE", length = 50)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "NAME", length = 50)
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

	@Column(name = "READ_ONLY")
	public Integer getReadOnly() {
		return this.readOnly;
	}

	public void setReadOnly(Integer readOnly) {
		this.readOnly = readOnly;
	}

	@Column(name = "NOT_NULL")
	public Integer getNotNull() {
		return this.notNull;
	}

	public void setNotNull(Integer notNull) {
		this.notNull = notNull;
	}

	@Column(name = "UNIQUE_CONSTRAINT")
	public Integer getUniqueConstraint() {
		return this.uniqueConstraint;
	}

	public void setUniqueConstraint(Integer uniqueConstraint) {
		this.uniqueConstraint = uniqueConstraint;
	}

	@Column(name = "VALIDATOR", length = 200)
	public String getValidator() {
		return this.validator;
	}

	public void setValidator(String validator) {
		this.validator = validator;
	}

	@Column(name = "CONVERSION_PATTERN", length = 200)
	public String getConversionPattern() {
		return this.conversionPattern;
	}

	public void setConversionPattern(String conversionPattern) {
		this.conversionPattern = conversionPattern;
	}

	@Column(name = "MULTIPLE")
	public Integer getMultiple() {
		return this.multiple;
	}

	public void setMultiple(Integer multiple) {
		this.multiple = multiple;
	}

	@Column(name = "ENUMERATION_KEYS", length = 200)
	public String getEnumerationKeys() {
		return this.enumerationKeys;
	}

	public void setEnumerationKeys(String enumerationKeys) {
		this.enumerationKeys = enumerationKeys;
	}

	@Column(name = "ENUMERATION_VALUES", length = 200)
	public String getEnumerationValues() {
		return this.enumerationValues;
	}

	public void setEnumerationValues(String enumerationValues) {
		this.enumerationValues = enumerationValues;
	}

	@Column(name = "SCOPE_ID", length = 50)
	public String getScopeId() {
		return this.scopeId;
	}

	public void setScopeId(String scopeId) {
		this.scopeId = scopeId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userSchema")
	public Set<UserAttr> getUserAttrs() {
		return this.userAttrs;
	}

	public void setUserAttrs(Set<UserAttr> userAttrs) {
		this.userAttrs = userAttrs;
	}
}
//need to confirm