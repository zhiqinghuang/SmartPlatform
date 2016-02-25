package com.mossle.user.persistence.domain;

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
@Table(name = "USER_REPO")
public class UserRepo implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String code;
	private String name;
	private String ref;
	private String scopeId;
	private Set<UserBase> userBases = new HashSet<UserBase>(0);
	private Set<UserSchema> userSchemas = new HashSet<UserSchema>(0);

	public UserRepo() {
	}

	public UserRepo(String code, String name, String ref, String scopeId, Set<UserBase> userBases, Set<UserSchema> userSchemas) {
		this.code = code;
		this.name = name;
		this.ref = ref;
		this.scopeId = scopeId;
		this.userBases = userBases;
		this.userSchemas = userSchemas;
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

	@Column(name = "REF", length = 50)
	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	@Column(name = "SCOPE_ID", length = 50)
	public String getScopeId() {
		return this.scopeId;
	}

	public void setScopeId(String scopeId) {
		this.scopeId = scopeId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userRepo")
	public Set<UserBase> getUserBases() {
		return this.userBases;
	}

	public void setUserBases(Set<UserBase> userBases) {
		this.userBases = userBases;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userRepo")
	public Set<UserSchema> getUserSchemas() {
		return this.userSchemas;
	}

	public void setUserSchemas(Set<UserSchema> userSchemas) {
		this.userSchemas = userSchemas;
	}
}
//need to confirm