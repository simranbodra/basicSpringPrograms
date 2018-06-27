package com.bridgelabz.autowirebytype.model;

public class Pancard {
	private String pancardHolderName;
	private String pancardNo;
	
	Pancard(){
		System.out.println("Pancard default constructor");
	}
	
	public String getPancardHolderName() {
		return pancardHolderName;
	}
	public void setPancardHolderName(String pancardHolderName) {
		System.out.println("setter pancardHolderName");
		this.pancardHolderName = pancardHolderName;
	}
	public String getPancardNo() {
		return pancardNo;
	}
	public void setPancardNo(String pancardNo) {
		this.pancardNo = pancardNo;
	}
}
