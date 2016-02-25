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
@Table(name = "ACCOUNT_HISTORY_CREDENTIAL")
public class AccountHistoryCredential implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private AccountCredential accountCredential;
	private Date modifyTime;
	private String password;
	private String tenantId;

	public AccountHistoryCredential() {
	}

	public AccountHistoryCredential(AccountCredential accountCredential, Date modifyTime, String password, String tenantId) {
		this.accountCredential = accountCredential;
		this.modifyTime = modifyTime;
		this.password = password;
		this.tenantId = tenantId;
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
	@JoinColumn(name = "CREDENTIAL_ID")
	public AccountCredential getAccountCredential() {
		return this.accountCredential;
	}

	public void setAccountCredential(AccountCredential accountCredential) {
		this.accountCredential = accountCredential;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFY_TIME", length = 26)
	public Date getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	@Column(name = "PASSWORD", length = 100)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
}
//need to confirm