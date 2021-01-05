package com.hamburger.ecommerce.branch;

public class Address {
	private String streetAddress;
	private Double latitude;
	private Double longitude;
	private String phoneNumber;
	
	
	
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "Address [streetAddress=" + streetAddress + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
	

	
}
