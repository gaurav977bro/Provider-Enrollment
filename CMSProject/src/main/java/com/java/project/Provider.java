package com.java.project;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mysql.cj.xdevapi.Type;

@Entity
@Table(name = "Provider")
@ManagedBean(name = "provider")
@ViewScoped
public class Provider {

	@Id
	@Column(name = "pId")
	private String providerId;
	@Column(name = "pDob")
	private Date providerDob;
	@Column(name ="firstName")
	private String fristName;
	@Column(name= "middleName")
	private String middleName;
	@Column(name= "lastName")
	private String lastName;
	@Enumerated(EnumType.STRING)
	@Column(name = "pGender")
	private Gender providerGender;
	@Column(name = "specialization")
	private String specialization;
	@Column(name = "experience")
	private String experience;
	
	@Column(name="licenseId")
	private String licenseId;
	
	@Column(name="aadharNo")
	private String aadharNo;
	/*@Enumerated(EnumType.STRING)
	@Column(name = "language")
	private Language language;*/
	@Column(name="State")
	private String state;
	@Column(name = "city")
	private String city;
	@Column(name="StreetName")
	private String streetName;
	@Column(name="landmark")
	private String landMark;
	@Column(name="Address1")
	private String address1;
	@Column(name="Address2")
	private String address2;
	
	@Column(name = "MobileNo")
	private String phoneNo;
	@Column(name = "pEmailId")
	private String providerEmailId;
	@Enumerated(EnumType.STRING)
	@Column(name = "question")
	private Questions questions;
	
	@Enumerated(EnumType.STRING)
	@Column(name="question2")
	private Questions question2;
	@Column(name="answer")
	private String answer;
	
	@Column(name="answer2")
	private String answer2;
	
	@Column(name="username")
	private String username;
	
	@Column(name="education")
	private String education;
	@Column(name="council")
	private String council;
	@Column(name="category")
	private String category;
	@Column(name="speciality")
	private String speciality;
	@Column(name="pincode")
	private String pincode;
	
	
	/*@Column(name="pStatus")
	private ProviderStatus providerStatus;*/
	
	
	
	
	/*public ProviderStatus getProviderStatus() {
		return providerStatus;
	}
	public void setProviderStatus(ProviderStatus providerStatus) {
		this.providerStatus = providerStatus;
	}*/
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getCouncil() {
		return council;
	}
	public void setCouncil(String council) {
		this.council = council;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getLicenseId() {
		return licenseId;
	}
	public void setLicenseId(String licenseId) {
		this.licenseId = licenseId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Questions getQuestion2() {
		return question2;
	}
	public void setQuestion2(Questions question2) {
		this.question2 = question2;
	}
	public String getAnswer2() {
		return answer2;
	}
	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}
	public String getProviderId() {
		return providerId;
	}
	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}
	public Date getProviderDob() {
		return providerDob;
	}
	public void setProviderDob(Date providerDob) {
		this.providerDob = providerDob;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Gender getProviderGender() {
		return providerGender;
	}
	public void setProviderGender(Gender providerGender) {
		this.providerGender = providerGender;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	
	/*public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}*/
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getProviderEmailId() {
		return providerEmailId;
	}
	public void setProviderEmailId(String providerEmailId) {
		this.providerEmailId = providerEmailId;
	}
	public Questions getQuestions() {
		return questions;
	}
	public void setQuestions(Questions questions) {
		this.questions = questions;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Provider [providerId=" + providerId + ", providerDob=" + providerDob + ", fristName=" + fristName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", providerGender=" + providerGender
				+ ", specialization=" + specialization + ", experience=" + experience + ", licenseId=" + licenseId
				+ ", aadharNo=" + aadharNo + ", state=" + state + ", city=" + city + ", streetName=" + streetName
				+ ", landMark=" + landMark + ", address1=" + address1 + ", address2=" + address2 + ", phoneNo="
				+ phoneNo + ", providerEmailId=" + providerEmailId + ", questions=" + questions + ", question2="
				+ question2 + ", answer=" + answer + ", answer2=" + answer2 + ", username=" + username + ", education="
				+ education + ", council=" + council + ", category=" + category + ", speciality=" + speciality
				+ ", pincode=" + pincode + "]";
	}
	
	
}
