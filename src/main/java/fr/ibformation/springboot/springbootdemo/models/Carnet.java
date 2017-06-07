package fr.ibformation.springboot.springbootdemo.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Carnet implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCarnet;
	private String NameCarnet;
	@OneToMany(mappedBy="book",cascade = CascadeType.ALL)
	private List<Contact> contacts = new ArrayList<>();
	
	/**
	 * 
	 */
	public Carnet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nameCarnet
	 */
	public Carnet( String nameCarnet) {
		super();
		NameCarnet = nameCarnet;
	}
	
	public Long getCarnet() {
		return idCarnet;
	}
	
	public void setCarnet(Long idCarnet) {
		this.idCarnet = idCarnet;
	}
	public String getNameCarnet() {
		return NameCarnet;
	}
	public void setNameCarnet(String nameCarnet) {
		NameCarnet = nameCarnet;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
}
