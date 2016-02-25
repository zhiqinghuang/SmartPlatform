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
@Table(name = "USER_BASE")
public class UserBase implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private UserRepo userRepo;
	private String username;
	private String displayName;
	private String password;
	private Integer status;
	private String ref;
	private String scopeId;
	private String email;
	private String mobile;
	private String firstName;
	private String lastName;
	private String fullName;
	private String nickName;
	private String avatar;
	private String description;
	private String gender;
	private Date birthday;
	private String location;
	private String station;
	private String telephone;
	private String language;
	private String country;
	private String timezone;
	private String employeeNo;
	private String cardNo;
	private Set<UserAttr> userAttrs = new HashSet<UserAttr>(0);
	private Set<UserAccount> userAccounts = new HashSet<UserAccount>(0);

	public UserBase() {
	}

	public UserBase(UserRepo userRepo, String username, String displayName, String password, Integer status, String ref, String scopeId, String email, String mobile, String firstName, String lastName, String fullName, String nickName, String avatar, String description, String gender, Date birthday, String location, String station, String telephone, String language, String country, String timezone, String employeeNo, String cardNo, Set<UserAttr> userAttrs, Set<UserAccount> userAccounts) {
		this.userRepo = userRepo;
		this.username = username;
		this.displayName = displayName;
		this.password = password;
		this.status = status;
		this.ref = ref;
		this.scopeId = scopeId;
		this.email = email;
		this.mobile = mobile;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = fullName;
		this.nickName = nickName;
		this.avatar = avatar;
		this.description = description;
		this.gender = gender;
		this.birthday = birthday;
		this.location = location;
		this.station = station;
		this.telephone = telephone;
		this.language = language;
		this.country = country;
		this.timezone = timezone;
		this.employeeNo = employeeNo;
		this.cardNo = cardNo;
		this.userAttrs = userAttrs;
		this.userAccounts = userAccounts;
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

	@Column(name = "USERNAME", length = 50)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "DISPLAY_NAME", length = 50)
	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
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

	@Column(name = "SCOPE_ID", length = 50)
	public String getScopeId() {
		return this.scopeId;
	}

	public void setScopeId(String scopeId) {
		this.scopeId = scopeId;
	}

	@Column(name = "EMAIL", length = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "MOBILE", length = 50)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "FIRST_NAME", length = 50)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LAST_NAME", length = 50)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "FULL_NAME", length = 50)
	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Column(name = "NICK_NAME", length = 50)
	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Column(name = "AVATAR", length = 200)
	public String getAvatar() {
		return this.avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Column(name = "DESCRIPTION", length = 200)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "GENDER", length = 10)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "BIRTHDAY", length = 10)
	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Column(name = "LOCATION", length = 50)
	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Column(name = "STATION", length = 50)
	public String getStation() {
		return this.station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	@Column(name = "TELEPHONE", length = 50)
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(name = "LANGUAGE", length = 50)
	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Column(name = "COUNTRY", length = 50)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "TIMEZONE", length = 50)
	public String getTimezone() {
		return this.timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	@Column(name = "EMPLOYEE_NO", length = 64)
	public String getEmployeeNo() {
		return this.employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	@Column(name = "CARD_NO", length = 64)
	public String getCardNo() {
		return this.cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userBase")
	public Set<UserAttr> getUserAttrs() {
		return this.userAttrs;
	}

	public void setUserAttrs(Set<UserAttr> userAttrs) {
		this.userAttrs = userAttrs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userBase")
	public Set<UserAccount> getUserAccounts() {
		return this.userAccounts;
	}

	public void setUserAccounts(Set<UserAccount> userAccounts) {
		this.userAccounts = userAccounts;
	}
}
//need to confirm