package com.mossle.user.persistence.domain;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ACCOUNT_CREDENTIAL")
public class AccountCredential implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private AccountInfo accountInfo;
	private String password;
	private Date modifyTime;
	private Date expireTime;
	private String expireStatus;
	private String required;
	private String couldModify;
	private String type;
	private String catalog;
	private String data;
	private String status;
	private String tenantId;
	private Set<AccountHistoryCredential> accountHistoryCredentials = new HashSet<AccountHistoryCredential>(0);

	public AccountCredential() {
	}

	public AccountCredential(AccountInfo accountInfo, String password, Date modifyTime, Date expireTime, String expireStatus, String required, String couldModify, String type, String catalog, String data, String status, String tenantId, Set<AccountHistoryCredential> accountHistoryCredentials) {
		this.accountInfo = accountInfo;
		this.password = password;
		this.modifyTime = modifyTime;
		this.expireTime = expireTime;
		this.expireStatus = expireStatus;
		this.required = required;
		this.couldModify = couldModify;
		this.type = type;
		this.catalog = catalog;
		this.data = data;
		this.status = status;
		this.tenantId = tenantId;
		this.accountHistoryCredentials = accountHistoryCredentials;
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
	@JoinColumn(name = "ACCOUNT_ID")
	public AccountInfo getAccountInfo() {
		return this.accountInfo;
	}

	public void setAccountInfo(AccountInfo accountInfo) {
		this.accountInfo = accountInfo;
	}

	@Column(name = "PASSWORD", length = 50)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFY_TIME", length = 26)
	public Date getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "EXPIRE_TIME", length = 26)
	public Date getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}

	@Column(name = "EXPIRE_STATUS", length = 50)
	public String getExpireStatus() {
		return this.expireStatus;
	}

	public void setExpireStatus(String expireStatus) {
		this.expireStatus = expireStatus;
	}

	@Column(name = "REQUIRED", length = 50)
	public String getRequired() {
		return this.required;
	}

	public void setRequired(String required) {
		this.required = required;
	}

	@Column(name = "COULD_MODIFY", length = 50)
	public String getCouldModify() {
		return this.couldModify;
	}

	public void setCouldModify(String couldModify) {
		this.couldModify = couldModify;
	}

	@Column(name = "TYPE", length = 50)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "CATALOG", length = 50)
	public String getCatalog() {
		return this.catalog;
	}

	public void setCatalog(String catalog) {
		this.catalog = catalog;
	}

	@Column(name = "DATA", length = 200)
	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Column(name = "STATUS", length = 50)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "accountCredential")
	public Set<AccountHistoryCredential> getAccountHistoryCredentials() {
		return this.accountHistoryCredentials;
	}

	public void setAccountHistoryCredentials(Set<AccountHistoryCredential> accountHistoryCredentials) {
		this.accountHistoryCredentials = accountHistoryCredentials;
	}
}