package com.test;

import java.util.Date;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	@Size(min=3, max=50)
	@NotEmpty(message="enter your name")
	private String name;
	
	@Email(message="enter a valid e-mail address")
	@NotBlank
	private String email;
	
	@NotBlank
	@Size(min=6, max=20)
	private String password;
	
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date birthday;
	
	@NotBlank
	private String gender;
	
	@NotBlank
	private String profession;
	
	@AssertTrue
	private boolean married;
	
	@Min(20_000)
	@Max(200_000)
	private long income;
	
	@Size(max=50)
	private String note;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public long getIncome() {
		return income;
	}
	public void setIncome(long income) {
		this.income = income;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	public String toString()
	{
		return "User [name="+name+", email="+email+", password="+password+", "
				+ "birthday="+birthday+", gender="+gender+", prefession="+profession+""
						+ ", married="+married+", income="+income+", note="+note+"]";
	}
	
}
