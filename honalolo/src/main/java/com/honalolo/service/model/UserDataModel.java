package com.honalolo.service.model;

import java.util.Map;
/**
 * @author vebitot
 *
 */
public class UserDataModel {
	private String firstName;
	private String middleName;
	private String lastName;
	private String about_user;
	private UserType userType;
	/**
	 * Will have the type of qualification with description if required
	 */
	private Map<String,Object> qualifications;
	
	/**
	 * Will have all details like email, phone, etc
	 */
	private Map<String, Object> contactsAndAddresses;
	
	private Map<String, Object> practices;
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
	public Map<String, Object> getQualifications() {
		return qualifications;
	}
	public void setQualifications(Map<String, Object> qualifications) {
		this.qualifications = qualifications;
	}
	public Map<String, Object> getContactsAndAddresses() {
		return contactsAndAddresses;
	}
	public void setContactsAndAddresses(Map<String, Object> contactsAndAddresses) {
		this.contactsAndAddresses = contactsAndAddresses;
	}
	public Map<String, Object> getPractices() {
		return practices;
	}
	public void setPractices(Map<String, Object> practices) {
		this.practices = practices;
	}
	public static enum UserType{
		DOCTOR,ADMIN,USERS
	}
}
