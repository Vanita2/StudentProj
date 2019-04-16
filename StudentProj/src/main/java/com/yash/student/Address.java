package com.yash.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int addrsssId;
	private String addrssType;
	private String addressLine1;
	private String addressLine2;
	
	public Address(){
		System.out.println("Loading Address bean");
		
	}
	public int getAddrsssId() {
		return addrsssId;
	}
	public void setAddrsssId(int addrsssId) {
		this.addrsssId = addrsssId;
	}
	public String getAddrssType() {
		return addrssType;
	}
	public void setAddrssType(String addrssType) {
		this.addrssType = addrssType;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	@Override
	public String toString() {
		return "Address [addrsssId=" + addrsssId + ", addrssType=" + addrssType + ", addressLine1=" + addressLine1
				+ ", addressLine2=" + addressLine2 + "]";
	}
	
	
	

	
}
