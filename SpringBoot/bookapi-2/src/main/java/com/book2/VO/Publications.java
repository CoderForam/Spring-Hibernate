package com.book2.VO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="publications")
public class Publications {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String publicationname;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPublicationname() {
		return publicationname;
	}
	public void setPublicationname(String publicationname) {
		this.publicationname = publicationname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Publications(int id, String publicationname, String city) {
		super();
		this.id = id;
		this.publicationname = publicationname;
		this.city = city;
	}
	public Publications() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Publications [id=" + id + ", publicationname=" + publicationname + ", city=" + city + ", getId()="
				+ getId() + ", getPublicationname()=" + getPublicationname() + ", getCity()=" + getCity()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
