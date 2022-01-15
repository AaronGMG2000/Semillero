package com.prac2.practica2.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class Cliente implements Serializable {

	private static final long serialVersionUID = -734125466730897367L;
	
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "CLI_SEQ"
	)
	@SequenceGenerator(
			sequenceName = "cliente_seq",
			allocationSize = 1,
			name = "CLI_SEQ"
	)
	@Column(name = "DNI_CL")
	private Integer dniCl;
	
	@Column(name = "NOMBRE_CL")
	private String nombreCl;
	
	@Column(name = "APELLIDO_1")
	private String apellido1;
	
	@Column(name = "APELLIDO_2")
	private String apellido2;
	
	@Column(name = "CLASE_VIA")
	private String claseVia;
	
	@Column(name = "NOMBRE_VIA")
	private String nombreVia;
	
	@Column(name = "NUMERO_VIA")
	private Integer numeroVia;
	
	@Column(name = "COD_POSTAL")
	private Integer codPostal;
	
	@Column(name = "CIUDAD")
	private String ciudad;
	
	@Column(name = "TELEFONO")
	private Integer telefono;
	
	@Column(name = "OBSERVACION")
	private String observacion;
	
	@OneToMany(mappedBy = "dniCl")
	private List<Seguro> seguroList;

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

	public List<Seguro> getSeguroList() {
		return seguroList;
	}

	public void setSeguroList(List<Seguro> seguroList) {
		this.seguroList = seguroList;
	}

}
