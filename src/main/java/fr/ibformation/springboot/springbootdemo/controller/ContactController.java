package fr.ibformation.springboot.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import fr.ibformation.springboot.springbootdemo.models.Contact;
import fr.ibformation.springboot.springbootdemo.repository.ContactRepository;



@Controller
@RequestMapping(path="/demo") 
public class ContactController {
	@Autowired
	private ContactRepository contactRepository;
	@GetMapping(path="/add")
	public @ResponseBody String addNewContact(@RequestParam String nom, @RequestParam String prenom, @RequestParam String numero){
		Contact c = new Contact();
		c.setLastName(nom);
		c.setFirstName(prenom);
		c.setPhone(numero);
		contactRepository.save(c);
		return "saved";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Contact> getAllContact() {
		// This returns a JSON or XML with the users
		return contactRepository.findAll();
	}
	
//	@GetMapping(path="/all")
//	public @ResponseBody Iterable<Contact> getAllContact() {
//		// This returns a JSON or XML with the users
//	return contactRepository.findAll();
//	}
	
	
}

