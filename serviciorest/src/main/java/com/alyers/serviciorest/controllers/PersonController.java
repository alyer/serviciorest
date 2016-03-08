package com.alyers.serviciorest.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.alyers.serviciorest.beans.Persona;

@RestController 
public class PersonController {
	public List<Persona> getPersona(){
		List <Persona> lp= new ArrayList<Persona>();
		for (int i=0; i<10; i++){
			Persona p = new Persona();
		}
		return null;
	}
}
