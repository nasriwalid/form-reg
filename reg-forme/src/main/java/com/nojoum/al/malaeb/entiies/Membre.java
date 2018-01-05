package com.nojoum.al.malaeb.entiies;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;



@Entity
public class Membre implements Serializable{
	@Id @GeneratedValue
	private Long id;
	private String fname;
	private String sname;
	@DateTimeFormat (pattern="yyyy-MM-dd") 
	private Date bday;
	private String identity;
	private String identitycat;
	private String address;
	private String level;
	@ManyToOne
	@JoinColumn(name="countryid")
	private Country mcoutry;
	public Membre() {
		super();
	}
	
	public Membre(String fname, String sname ,@DateTimeFormat (pattern="yyyy-MM-dd")Date bday) {
		super();
		this.fname = fname;
		this.sname = sname;
		this.bday = bday;
	
	}
	//for name sname bearthday country adress 

	public Membre(String fname, String sname, @DateTimeFormat (pattern="yyyy-MM-dd")Date bday, String address, Country mcoutry) {
		super();
		this.fname = fname;
		this.sname = sname;
		this.bday = bday;
		this.address = address;
		this.mcoutry = mcoutry;
	}

	public Membre(String fname, String sname, Date bday, String identity, String identitycat, String level) {
		super();
		this.fname = fname;
		this.sname = sname;
		this.bday = bday;
		this.identity = identity;
		this.identitycat = identitycat;
		this.level = level;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Date getBday() {
		return bday;
	}
	public void setBday(Date bday) {
		this.bday = bday;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getIdentitycat() {
		return identitycat;
	}
	public void setIdentitycat(String identitycat) {
		this.identitycat = identitycat;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}

	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Country getMcoutry() {
		return mcoutry;
	}

	public void setMcoutry(Country mcoutry) {
		this.mcoutry = mcoutry;
	}

}
