package com.mossle.user.persistence.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PERSON_INFO")
public class PersonInfo implements java.io.Serializable {
	private static final long serialVersionUID = 0L;

	private Long id;
	private String code;
	private String username;
	private String familyName;
	private String givenName;
	private String fullName;
	private String cellphone;
	private String telephone;
	private String email;
	private String im;
	private String country;
	private String province;
	private String city;
	private String building;
	private String floor;
	private String seat;
	private String employeeNo;
	private String employeeType;
	private String card;
	private String companyCode;
	private String companyName;
	private String departmentCode;
	private String departmentName;
	private String positionCode;
	private String positionName;
	private String gender;
	private Date birthday;
	private String idCardType;
	private String idCardValue;
	private String nationality;
	private String star;
	private String blood;
	private String clothSize;
	private String tenantId;

	public PersonInfo() {
	}

	public PersonInfo(String code, String username, String familyName, String givenName, String fullName, String cellphone, String telephone, String email, String im, String country, String province, String city, String building, String floor, String seat, String employeeNo, String employeeType, String card, String companyCode, String companyName, String departmentCode, String departmentName, String positionCode, String positionName, String gender, Date birthday, String idCardType, String idCardValue, String nationality, String star, String blood, String clothSize, String tenantId) {
		this.code = code;
		this.username = username;
		this.familyName = familyName;
		this.givenName = givenName;
		this.fullName = fullName;
		this.cellphone = cellphone;
		this.telephone = telephone;
		this.email = email;
		this.im = im;
		this.country = country;
		this.province = province;
		this.city = city;
		this.building = building;
		this.floor = floor;
		this.seat = seat;
		this.employeeNo = employeeNo;
		this.employeeType = employeeType;
		this.card = card;
		this.companyCode = companyCode;
		this.companyName = companyName;
		this.departmentCode = departmentCode;
		this.departmentName = departmentName;
		this.positionCode = positionCode;
		this.positionName = positionName;
		this.gender = gender;
		this.birthday = birthday;
		this.idCardType = idCardType;
		this.idCardValue = idCardValue;
		this.nationality = nationality;
		this.star = star;
		this.blood = blood;
		this.clothSize = clothSize;
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

	@Column(name = "CODE", length = 200)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "USERNAME", length = 200)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "FAMILY_NAME", length = 200)
	public String getFamilyName() {
		return this.familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	@Column(name = "GIVEN_NAME", length = 200)
	public String getGivenName() {
		return this.givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	@Column(name = "FULL_NAME", length = 200)
	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Column(name = "CELLPHONE", length = 50)
	public String getCellphone() {
		return this.cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	@Column(name = "TELEPHONE", length = 200)
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(name = "EMAIL", length = 200)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "IM", length = 200)
	public String getIm() {
		return this.im;
	}

	public void setIm(String im) {
		this.im = im;
	}

	@Column(name = "COUNTRY", length = 200)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Column(name = "PROVINCE", length = 200)
	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Column(name = "CITY", length = 200)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "BUILDING", length = 200)
	public String getBuilding() {
		return this.building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	@Column(name = "FLOOR", length = 200)
	public String getFloor() {
		return this.floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	@Column(name = "SEAT", length = 200)
	public String getSeat() {
		return this.seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	@Column(name = "EMPLOYEE_NO", length = 50)
	public String getEmployeeNo() {
		return this.employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	@Column(name = "EMPLOYEE_TYPE", length = 50)
	public String getEmployeeType() {
		return this.employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	@Column(name = "CARD", length = 200)
	public String getCard() {
		return this.card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	@Column(name = "COMPANY_CODE", length = 200)
	public String getCompanyCode() {
		return this.companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	@Column(name = "COMPANY_NAME", length = 200)
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Column(name = "DEPARTMENT_CODE", length = 200)
	public String getDepartmentCode() {
		return this.departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	@Column(name = "DEPARTMENT_NAME", length = 200)
	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@Column(name = "POSITION_CODE", length = 200)
	public String getPositionCode() {
		return this.positionCode;
	}

	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	@Column(name = "POSITION_NAME", length = 200)
	public String getPositionName() {
		return this.positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	@Column(name = "GENDER", length = 500)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BIRTHDAY", length = 26)
	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Column(name = "ID_CARD_TYPE", length = 50)
	public String getIdCardType() {
		return this.idCardType;
	}

	public void setIdCardType(String idCardType) {
		this.idCardType = idCardType;
	}

	@Column(name = "ID_CARD_VALUE", length = 50)
	public String getIdCardValue() {
		return this.idCardValue;
	}

	public void setIdCardValue(String idCardValue) {
		this.idCardValue = idCardValue;
	}

	@Column(name = "NATIONALITY", length = 200)
	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	@Column(name = "STAR", length = 50)
	public String getStar() {
		return this.star;
	}

	public void setStar(String star) {
		this.star = star;
	}

	@Column(name = "BLOOD", length = 50)
	public String getBlood() {
		return this.blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	@Column(name = "CLOTH_SIZE", length = 50)
	public String getClothSize() {
		return this.clothSize;
	}

	public void setClothSize(String clothSize) {
		this.clothSize = clothSize;
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