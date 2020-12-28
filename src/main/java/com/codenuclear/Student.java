 package com.codenuclear;

public class Student 
{
	String stuName;
	String stuCity;
	int stuId;
	public void setSurname(String surname) {
		this.surname = surname;
	}
	String surname;
	public String getSurname(){
		return surname;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	
	public String getStuCity() {
		return stuCity;
	}
	public void setStuCity(String stuCity) {
		this.stuCity = stuCity;
	}
	
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
}
