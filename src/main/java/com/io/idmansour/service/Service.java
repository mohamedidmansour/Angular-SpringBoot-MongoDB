package com.io.idmansour.service;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.io.idmansour.personne.Personne;
import com.io.idmansour.secretaire.Secretaire;

@Document(collection = "services")
public class Service{
	@Id
	private String id;
	@Field(name = "nomservice")
	@NotNull
	private String nomService;
	private Secretaire secretaire;
	public Service(String id, @NotNull String nomService, Secretaire secretaire) {
		super();
		this.id = id;
		this.nomService = nomService;
		this.secretaire = secretaire;
	}
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNomService() {
		return nomService;
	}
	public void setNomService(String nomService) {
		this.nomService = nomService;
	}
	public Secretaire getSecretaire() {
		return secretaire;
	}
	public void setSecretaire(Secretaire secretaire) {
		this.secretaire = secretaire;
	}
	@Override
	public String toString() {
		return "Service [id=" + id + ", nomService=" + nomService + ", secretaire=" + secretaire + "]";
	}
	
	
	
}
