package com.io.idmansour.entity;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "personnes")
public class Personne {
	@Id
	private String id;
	@Field(name = "nom")
	@NotNull
	private String nom;
	@Field(name = "prenom")
	@NotNull
	private String prenom;
	@Field(name = "adresse")
	@NotNull
	private String adresse;
	@Field(name = "tel")
	@NotNull
	private String tel;
	public Personne(String id, @NotNull String nom, @NotNull String prenom, @NotNull String adresse,
			@NotNull String tel) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.tel = tel;
	}
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}
