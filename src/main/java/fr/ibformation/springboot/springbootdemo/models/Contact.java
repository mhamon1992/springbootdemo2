package fr.ibformation.springboot.springbootdemo.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity

public class Contact implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5371582894763902923L;

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", lastName=" + lastName + ", firstName=" + firstName + ", phone="
				+ phone + ", book=" + book + "]";
	}

        @Id
        //generer automatique id 
        @GeneratedValue(strategy = GenerationType.AUTO)
	private Long contactId;
	private String lastName;
	private String firstName;
	private String phone;
	@ManyToOne
	private Carnet book;
	
	public Contact() {}

	public Contact(Long contactId, String lastName, String firstName, String phone,Carnet book) {
		this.contactId = contactId;
		this.lastName = lastName;
		this.firstName = firstName;
		this.phone = phone;
		this.book = book;
	}

	public Contact(String lastName, String firstName, String phone) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.phone = phone;
	}

	public Long getContactId() {
		return contactId;
	}

	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}

	public Carnet getBook() {
		return book;
	}

	public void setBook(Carnet book) {
		this.book = book;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}