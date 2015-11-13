package com.mossle.user.persistence.domain;

// Generated by Hibernate Tools
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

/**
 * UserBase .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "USER_BASE")
public class UserBase implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	/** null. */
	private Long id;

	/** null. */
	private UserRepo userRepo;

	/** null. */
	private String username;

	/** null. */
	private String displayName;

	/** null. */
	private String password;

	/** null. */
	private Integer status;

	/** null. */
	private String ref;

	/** null. */
	private String scopeId;

	/** null. */
	private String email;

	/** null. */
	private String mobile;

	/** null. */
	private String firstName;

	/** null. */
	private String lastName;

	/** null. */
	private String fullName;

	/** null. */
	private String nickName;

	/** null. */
	private String avatar;

	/** null. */
	private String description;

	/** null. */
	private String gender;

	/** null. */
	private Date birthday;

	/** null. */
	private String location;

	/** null. */
	private String station;

	/** null. */
	private String telephone;

	/** null. */
	private String language;

	/** null. */
	private String country;

	/** null. */
	private String timezone;

	/** null. */
	private String employeeNo;

	/** null. */
	private String cardNo;

	/** . */
	private Set<UserAttr> userAttrs = new HashSet<UserAttr>(0);

	/** . */
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

	/** @return null. */
	@Id
	@GeneratedValue
	@Column(name = "ID", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	/**
	 * @param id
	 *            null.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/** @return null. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_REPO_ID")
	public UserRepo getUserRepo() {
		return this.userRepo;
	}

	/**
	 * @param userRepo
	 *            null.
	 */
	public void setUserRepo(UserRepo userRepo) {
		this.userRepo = userRepo;
	}

	/** @return null. */
	@Column(name = "USERNAME", length = 50)
	public String getUsername() {
		return this.username;
	}

	/**
	 * @param username
	 *            null.
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/** @return null. */
	@Column(name = "DISPLAY_NAME", length = 50)
	public String getDisplayName() {
		return this.displayName;
	}

	/**
	 * @param displayName
	 *            null.
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/** @return null. */
	@Column(name = "PASSWORD", length = 50)
	public String getPassword() {
		return this.password;
	}

	/**
	 * @param password
	 *            null.
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/** @return null. */
	@Column(name = "STATUS")
	public Integer getStatus() {
		return this.status;
	}

	/**
	 * @param status
	 *            null.
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/** @return null. */
	@Column(name = "REF", length = 200)
	public String getRef() {
		return this.ref;
	}

	/**
	 * @param ref
	 *            null.
	 */
	public void setRef(String ref) {
		this.ref = ref;
	}

	/** @return null. */
	@Column(name = "SCOPE_ID", length = 50)
	public String getScopeId() {
		return this.scopeId;
	}

	/**
	 * @param scopeId
	 *            null.
	 */
	public void setScopeId(String scopeId) {
		this.scopeId = scopeId;
	}

	/** @return null. */
	@Column(name = "EMAIL", length = 100)
	public String getEmail() {
		return this.email;
	}

	/**
	 * @param email
	 *            null.
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/** @return null. */
	@Column(name = "MOBILE", length = 50)
	public String getMobile() {
		return this.mobile;
	}

	/**
	 * @param mobile
	 *            null.
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/** @return null. */
	@Column(name = "FIRST_NAME", length = 50)
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * @param firstName
	 *            null.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/** @return null. */
	@Column(name = "LAST_NAME", length = 50)
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * @param lastName
	 *            null.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/** @return null. */
	@Column(name = "FULL_NAME", length = 50)
	public String getFullName() {
		return this.fullName;
	}

	/**
	 * @param fullName
	 *            null.
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/** @return null. */
	@Column(name = "NICK_NAME", length = 50)
	public String getNickName() {
		return this.nickName;
	}

	/**
	 * @param nickName
	 *            null.
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	/** @return null. */
	@Column(name = "AVATAR", length = 200)
	public String getAvatar() {
		return this.avatar;
	}

	/**
	 * @param avatar
	 *            null.
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	/** @return null. */
	@Column(name = "DESCRIPTION", length = 200)
	public String getDescription() {
		return this.description;
	}

	/**
	 * @param description
	 *            null.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/** @return null. */
	@Column(name = "GENDER", length = 10)
	public String getGender() {
		return this.gender;
	}

	/**
	 * @param gender
	 *            null.
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/** @return null. */
	@Temporal(TemporalType.DATE)
	@Column(name = "BIRTHDAY", length = 10)
	public Date getBirthday() {
		return this.birthday;
	}

	/**
	 * @param birthday
	 *            null.
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/** @return null. */
	@Column(name = "LOCATION", length = 50)
	public String getLocation() {
		return this.location;
	}

	/**
	 * @param location
	 *            null.
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/** @return null. */
	@Column(name = "STATION", length = 50)
	public String getStation() {
		return this.station;
	}

	/**
	 * @param station
	 *            null.
	 */
	public void setStation(String station) {
		this.station = station;
	}

	/** @return null. */
	@Column(name = "TELEPHONE", length = 50)
	public String getTelephone() {
		return this.telephone;
	}

	/**
	 * @param telephone
	 *            null.
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/** @return null. */
	@Column(name = "LANGUAGE", length = 50)
	public String getLanguage() {
		return this.language;
	}

	/**
	 * @param language
	 *            null.
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/** @return null. */
	@Column(name = "COUNTRY", length = 50)
	public String getCountry() {
		return this.country;
	}

	/**
	 * @param country
	 *            null.
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/** @return null. */
	@Column(name = "TIMEZONE", length = 50)
	public String getTimezone() {
		return this.timezone;
	}

	/**
	 * @param timezone
	 *            null.
	 */
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	/** @return null. */
	@Column(name = "EMPLOYEE_NO", length = 64)
	public String getEmployeeNo() {
		return this.employeeNo;
	}

	/**
	 * @param employeeNo
	 *            null.
	 */
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	/** @return null. */
	@Column(name = "CARD_NO", length = 64)
	public String getCardNo() {
		return this.cardNo;
	}

	/**
	 * @param cardNo
	 *            null.
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	/** @return . */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userBase")
	public Set<UserAttr> getUserAttrs() {
		return this.userAttrs;
	}

	/**
	 * @param userAttrs
	 *            .
	 */
	public void setUserAttrs(Set<UserAttr> userAttrs) {
		this.userAttrs = userAttrs;
	}

	/** @return . */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userBase")
	public Set<UserAccount> getUserAccounts() {
		return this.userAccounts;
	}

	/**
	 * @param userAccounts
	 *            .
	 */
	public void setUserAccounts(Set<UserAccount> userAccounts) {
		this.userAccounts = userAccounts;
	}
}
