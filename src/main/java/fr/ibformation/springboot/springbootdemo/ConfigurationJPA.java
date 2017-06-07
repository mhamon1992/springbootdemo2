package fr.ibformation.springboot.springbootdemo;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan("fr.ibformation.springboot.springbootdemo.models")
@ComponentScan
public class ConfigurationJPA {

}
