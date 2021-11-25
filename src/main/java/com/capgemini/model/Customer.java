package com.capgemini.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Column;

import javax.persistence.Id;


@Entity
@Table(name = "customer_table") 
//public class Customer extends User 
public class Customer
{
	// should be auto-generated
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerId;
	
	 @Column(name="addharNumber",unique= true)
	private Long addharNumber;
	 
	 @Column(name="firstName")
	private String firstName;
	 
	 @Column(name="middleName")
	private String middleName;
	
	 @Column(name="lastName")
	private String lastName;
	
	 @Column (name="mobileNumber", unique= true)
	private String mobileNumber;
	 
	 @Column(name="email")
	private String email;
	 
//	 @Enumerated(EnumType.STRING)
	@Column(name = "gender")
	private String gender;
	 
	 
	 public Customer()
	 {
		 
		 super();
	}

	public Customer(Long customerId, Long addharNumber, String firstName, String middleName, String lastName,
			String mobileNumber, String email, String gender) {
		super();
		this.customerId = customerId;
		this.addharNumber = addharNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.gender = gender;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Long getAddharNumber() {
		return addharNumber;
	}
	public void setAddharNumber(Long addharNumber) {
		this.addharNumber = addharNumber;
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
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", addharNumber=" + addharNumber + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber
				+ ", email=" + email + ", gender=" + gender + "]";
	}
	
}