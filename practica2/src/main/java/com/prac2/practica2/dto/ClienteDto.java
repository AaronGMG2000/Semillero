package com.prac2.practica2.dto;

import java.io.Serializable;

public class ClienteDto implements Serializable {

	private static final long serialVersionUID = -5600905142391045509L;
	
	private Integer dniCl;
	private String nombreCl;
	private String apellido1;
	private String apellido2;
	private String claseVia;
	private String nombreVia;
	private Integer numeroVia;
	private Integer codPostal;
	private String ciudad;
	private Integer telefono;
	private String observacion;
	
	public Integer getDniCl() {
		return dniCl;
	}
	public void setDniCl(Integer dniCl) {
		this.dniCl = dniCl;
	}
	public String getNombreCl() {
		return nombreCl;
	}
	public void setNombreCl(String nombreCl) {
		this.nombreCl = nombreCl;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getClaseVia() {
		return claseVia;
	}
	public void setClaseVia(String claseVia) {
		this.claseVia = claseVia;
	}
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	public Integer getNumeroVia() {
		return numeroVia;
	}
	public void setNumeroVia(Integer numeroVia) {
		this.numeroVia = numeroVia;
	}
	public Integer getCodPostal() {
		return codPostal;
	}
	public void setCodPostal(Integer codPostal) {
		this.codPostal = codPostal;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	

}
