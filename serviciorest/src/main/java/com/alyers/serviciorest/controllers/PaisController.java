package com.alyers.serviciorest.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alyers.serviciorest.beans.Pais;

@RestController
public class PaisController {
	
	@RequestMapping("/allpais")
	public List<Pais> getAllPais(){
		List<Pais> pais=new ArrayList<Pais>();
		for(int i=0; i<10; i++){
			Pais p=new Pais(String.valueOf(i),"pais"+1);
			pais.add(p);
		}
		return pais;
	}
}
