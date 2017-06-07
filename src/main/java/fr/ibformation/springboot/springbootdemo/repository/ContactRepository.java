package fr.ibformation.springboot.springbootdemo.repository;

import org.springframework.data.repository.CrudRepository;
import fr.ibformation.springboot.springbootdemo.models.Contact;

public interface ContactRepository extends CrudRepository<Contact, Long> {
	Contact findByLastName(String lastName);
	void deleteByLastName(String lastName);

}
