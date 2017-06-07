package fr.ibformation.springboot.springbootdemo;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.ibformation.springboot.springbootdemo.models.Carnet;
import fr.ibformation.springboot.springbootdemo.models.Contact;
import fr.ibformation.springboot.springbootdemo.repository.CarnetRepository;
import fr.ibformation.springboot.springbootdemo.repository.ContactRepository;


@SpringBootApplication
public class SpringbootdemoApplication {

	// Lance l'application, elle a besoin de cette fonction pour être lancé _ bootstracké
	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}
	
	// args correspont à command linerunner 
	@Bean
	public CommandLineRunner demo (CarnetRepository cr){
		return (args)->{
			Carnet carnet = new Carnet("Famille");
			Contact c = new Contact("MARLEY", "BOB", "2");
			carnet.getContacts().add(c);
			cr.save(carnet);
			cr.findAll().forEach((Carnet)->{
				System.out.println(carnet.getNameCarnet());
			});
		};
	}
}
