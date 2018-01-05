package com.nojoum.al.malaeb.entiies;
import java.awt.List;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Country implements Serializable{
	@Id @GeneratedValue
	private Long id;
	private String name;
	@OneToMany(mappedBy ="country")
	private java.util.List<Membre>membres;
	public Country(String name) {
		super();
		this.name = name;
	}
	public Country() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
