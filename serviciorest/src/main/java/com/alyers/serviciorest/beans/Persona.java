package com.alyers.serviciorest.beans;

public class Persona {
	private String nombre;
	private String ap_paterno;
	private String ap_materno;
	private String movil;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
		//
	}
	public String getAp_paterno() {
		return ap_paterno;
		//
	}
	public void setAp_paterno(String ap_paterno) {
		this.ap_paterno = ap_paterno;
		//
	}
	public String getAp_materno() {
		return ap_materno;
	}
	public void setAp_materno(String ap_materno) {
		this.ap_materno = ap_materno;
	}
	public String getMovil() {
		return movil;
	}
	public void setMovil(String movil) {
		this.movil = movil;
	}
}
