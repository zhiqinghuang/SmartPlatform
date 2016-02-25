package com.mossle.user.persistence.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ACCOUNT_INFO")
public class AccountInfo implements Serializable {
	private static final long serialVersionUID = -4106101233651023142L;

	private Long id;
	private String code;
	private String username;
	private String type;
	private String displayName;
	private String status;
	private String passwordRequired;
	private String locked;
	private Date createTime;
	private Date closeTime;
	private Date loginTime;
	private String nickName;
	private String description;
	private String language;
	private String timezone;
	private String tenantId;
	private Set<AccountCredential> accountCredentials = new HashSet<AccountCredential>(0);
	private Set<AccountAvatar> accountAvatars = new HashSet<AccountAvatar>(0);

	public AccountInfo() {
	}

	public AccountInfo(String code, String username, String type, String displayName, String status, String passwordRequired, String locked, Date createTime, Date closeTime, Date loginTime, String nickName, String description, String language, String timezone, String tenantId, Set<AccountCredential> accountCredentials, Set<AccountAvatar> accountAvatars) {
		this.code = code;
		this.username = username;
		this.type = type;
		this.displayName = displayName;
		this.status = status;
		this.passwordRequired = passwordRequired;
		this.locked = locked;
		this.createTime = createTime;
		this.closeTime = closeTime;
		this.loginTime = loginTime;
		this.nickName = nickName;
		this.description = description;
		this.language = language;
		this.timezone = timezone;
		this.tenantId = tenantId;
		this.accountCredentials = accountCredentials;
		this.accountAvatars = accountAvatars;
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

	@Column(name = "USERNAME", length = 50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "TYPE", length = 50)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "DISPLAY_NAME", length = 200)
	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@Column(name = "STATUS", length = 50)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "PASSWORD_REQUIRED", length = 50)
	public String getPasswordRequired() {
		return this.passwordRequired;
	}

	public void setPasswordRequired(String passwordRequired) {
		this.passwordRequired = passwordRequired;
	}

	@Column(name = "LOCKED", length = 50)
	public String getLocked() {
		return this.locked;
	}

	public void setLocked(String locked) {
		this.locked = locked;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_TIME", length = 26)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CLOSE_TIME", length = 26)
	public Date getCloseTime() {
		return this.closeTime;
	}

	public void setCloseTime(Date closeTime) {
		this.closeTime = closeTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOGIN_TIME", length = 26)
	public Date getLoginTime() {
		return this.loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	@Column(name = "NICK_NAME", length = 200)
	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Column(name = "DESCRIPTION", length = 200)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "LANGUAGE", length = 50)
	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Column(name = "TIMEZONE", length = 50)
	public String getTimezone() {
		return this.timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	@Column(name = "TENANT_ID", length = 64)
	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "accountInfo")
	public Set<AccountCredential> getAccountCredentials() {
		return this.accountCredentials;
	}

	public void setAccountCredentials(Set<AccountCredential> accountCredentials) {
		this.accountCredentials = accountCredentials;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "accountInfo")
	public Set<AccountAvatar> getAccountAvatars() {
		return this.accountAvatars;
	}

	public void setAccountAvatars(Set<AccountAvatar> accountAvatars) {
		this.accountAvatars = accountAvatars;
	}
}
//need to confirm