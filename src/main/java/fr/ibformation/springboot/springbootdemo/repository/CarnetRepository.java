package fr.ibformation.springboot.springbootdemo.repository;

import org.springframework.data.repository.CrudRepository;

import fr.ibformation.springboot.springbootdemo.models.Carnet;


public interface CarnetRepository extends CrudRepository<Carnet, Long>{

}
