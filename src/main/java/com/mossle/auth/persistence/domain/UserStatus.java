package com.mossle.auth.persistence.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "AUTH_USER_STATUS")
public class UserStatus implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String username;
	private String password;
	private Integer status;
	private String ref;
	private String userRepoRef;
	private String tenantId;
	private Set<Role> roles = new HashSet<Role>(0);

	public UserStatus() {
	}

	public UserStatus(String username, String password, Integer status, String ref, String userRepoRef, String tenantId, Set<Role> roles) {
		this.username = username;
		this.password = password;
		this.status = status;
		this.ref = ref;
		this.userRepoRef = userRepoRef;
		this.tenantId = tenantId;
		this.roles = roles;
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

	@Column(name = "STATUS")
	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	@Column(name = "REF", length = 200)
	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	@Column(name = "USER_REPO_REF", length = 50)
	public String getUserRepoRef() {
		return this.userRepoRef;
	}

	public void setUserRepoRef(String userRepoRef) {
		this.userRepoRef = userRepoRef;
	}

	@Column(name = "TENANT_ID", length = 50)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "AUTH_USER_ROLE", joinColumns = { @JoinColumn(name = "USER_STATUS_ID", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "ROLE_ID", nullable = false, updatable = false) })
	public Set<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
}