package com.alyers.serviciorest.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alyers.serviciorest.beans.Pais;

@RestController
public class PaisController {
	
	@RequestMapping("/allpais")
	public List<Pais> getAllPais(){
		return null;
	}
}
