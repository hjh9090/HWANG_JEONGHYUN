package com.sesoc.student;


public class Bean {
	private String name;
	private String stuNum;
	private String perNum;
	private String perNum2;
	private String address;
	private String profile;
	
	public Bean() {
	}

	public Bean(String name, String stuNum, String perNum, String perNum2, String address, String profile) {
		super();
		this.name = name;
		this.stuNum = stuNum;
		this.perNum = perNum;
		this.perNum2 = perNum2;
		this.address = address;
		this.profile = profile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStuNum() {
		return stuNum;
	}

	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}

	public String getPerNum() {
		return perNum;
	}

	public void setPerNum(String perNum) {
		this.perNum = perNum;
	}

	public String getPerNum2() {
		return perNum2;
	}

	public void setPerNum2(String perNum2) {
		this.perNum2 = perNum2;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	
}
