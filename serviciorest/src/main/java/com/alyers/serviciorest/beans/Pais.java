package com.alyers.serviciorest.beans;

public class Pais {
	private String idPais;
	private String pais;
	
	public Pais(String id, String pais){
		this.idPais=id;
		this.pais=pais;
	}
	
	public String getIdPais() {
		return idPais;
	}
	public void setIdPais(String idPais) {
		this.idPais = idPais;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
}
