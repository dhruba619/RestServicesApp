package com.honalolo.model.userModels;

import java.util.List;
/**
 * @author vebitot
 *
 */
public class UserDataModel {
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String password;
	private String about_user;
	private UserType userType;
	private List<AuditReportModel> audit;
	private List<SpecializationDescriptionModel> specialization;
	private List<QualificationDescriptionModel> qualifications;
	private List<ContactAndAddressesModel> contactsAndAddresses;
	private List<Object> Wildcard;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<AuditReportModel> getAudit() {
		return audit;
	}
	public void setAudit(List<AuditReportModel> audit) {
		this.audit = audit;
	}
	public List<SpecializationDescriptionModel> getSpecialization() {
		return specialization;
	}
	public void setSpecialization(
			List<SpecializationDescriptionModel> specialization) {
		this.specialization = specialization;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
	public String getAbout_user() {
		return about_user;
	}
	public void setAbout_user(String about_user) {
		this.about_user = about_user;
	}
	public UserType getUserType() {
		return userType;
	}
	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	public List<QualificationDescriptionModel> getQualifications() {
		return qualifications;
	}
	public void setQualifications(List<QualificationDescriptionModel> qualifications) {
		this.qualifications = qualifications;
	}
	public List<ContactAndAddressesModel> getContactsAndAddresses() {
		return contactsAndAddresses;
	}
	public void setContactsAndAddresses(List<ContactAndAddressesModel> contactsAndAddresses) {
		this.contactsAndAddresses = contactsAndAddresses;
	}

	public List<Object> getWildcard() {
		return Wildcard;
	}
	public void setWildcard(List<Object> wildcard) {
		Wildcard = wildcard;
	}

	public static enum UserType{
		DOCTOR,ADMIN,USERS
	}
}
