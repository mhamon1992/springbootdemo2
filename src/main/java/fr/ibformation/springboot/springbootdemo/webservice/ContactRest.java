package fr.ibformation.springboot.springbootdemo.webservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformation.springboot.springbootdemo.models.Contact;

@RestController
public class ContactRest {

    private final AtomicLong counter = new AtomicLong();
	
	 @RequestMapping("/contactrest")
	    public Contact contactrest(@RequestParam(value="name", defaultValue="World") String name) {
	        return new Contact((Long)counter.incrementAndGet(),name,"","",null);
	    }
}
