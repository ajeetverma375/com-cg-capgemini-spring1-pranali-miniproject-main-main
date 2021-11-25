package com.capgemini.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address_table") 
public class Address {
	// should be auto-generated and used for internal purpose
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long addressId;
	 @Column
	private int flatOrHouseNumber;
	 @Column
	private String buildingName;
	 @Column
	private String landmark;
	 @Column
	private String village;
	 @Column
	private String taluka;
	 @Column
	private String district;
	 @Column
	private String state;
	 @Column
	private Integer pincode;
	
	public Address()
	{
		super();
	}
	
	public Address(Long addressId, int flatOrHouseNumber, String buildingName, String landmark, String village,
			String taluka, String district, String state, Integer pincode) {
		super();
		this.addressId = addressId;
		this.flatOrHouseNumber = flatOrHouseNumber;
		this.buildingName = buildingName;
		this.landmark = landmark;
		this.village = village;
		this.taluka = taluka;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
	}
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public int getFlatOrHouseNumber() {
		return flatOrHouseNumber;
	}
	public void setFlatOrHouseNumber(int flatOrHouseNumber) {
		this.flatOrHouseNumber = flatOrHouseNumber;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getTaluka() {
		return taluka;
	}
	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", flatOrHouseNumber=" + flatOrHouseNumber + ", buildingName="
				+ buildingName + ", landmark=" + landmark + ", village=" + village + ", taluka=" + taluka
				+ ", district=" + district + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
}