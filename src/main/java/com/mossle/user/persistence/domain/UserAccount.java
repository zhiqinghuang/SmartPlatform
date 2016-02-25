package com.mossle.user.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER_ACCOUNT")
public class UserAccount implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private UserAccountType userAccountType;
	private UserBase userBase;
	private String username;
	private String password;
	private String scopeId;

	public UserAccount() {
	}

	public UserAccount(UserAccountType userAccountType, UserBase userBase, String username, String password, String scopeId) {
		this.userAccountType = userAccountType;
		this.userBase = userBase;
		this.username = username;
		this.password = password;
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
	@JoinColumn(name = "TYPE_ID")
	public UserAccountType getUserAccountType() {
		return this.userAccountType;
	}

	public void setUserAccountType(UserAccountType userAccountType) {
		this.userAccountType = userAccountType;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_BASE_ID")
	public UserBase getUserBase() {
		return this.userBase;
	}

	public void setUserBase(UserBase userBase) {
		this.userBase = userBase;
	}

	@Column(name = "USERNAME", length = 50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "PASSWORD", length = 50)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
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