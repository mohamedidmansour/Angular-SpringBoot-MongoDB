package com.io.idmansour.patient;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import com.io.idmansour.personne.Personne;

@Document(collection = "patients")
public class Patient extends Personne{
	@Field(name = "sexe")
	@NotNull
	private char sexe;
	@Field(name = "dateNaissance")
	@NotNull
	@DateTimeFormat(pattern="yyyy.MM.dd")
	private Date dateNaissance;
	@Field(name = "profession")
	@NotNull
	private String profession;
	@Field(name = "etatcivile")
	@NotNull
	private String etatcivile;
	@Field(name = "assurence")
	@NotNull
	private String assurence;
	public Patient(String id, @NotNull String nom, @NotNull String prenom, @NotNull String adresse, @NotNull String tel,
			@NotNull char sexe, @NotNull Date dateNaissance, @NotNull String profession, @NotNull String etatcivile,
			@NotNull String assurence) {
		super(id, nom, prenom, adresse, tel);
		this.sexe = sexe;
		this.dateNaissance = dateNaissance;
		this.profession = profession;
		this.etatcivile = etatcivile;
		this.assurence = assurence;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(String id, @NotNull String nom, @NotNull String prenom, @NotNull String adresse,
			@NotNull String tel) {
		super(id, nom, prenom, adresse, tel);
		// TODO Auto-generated constructor stub
	}
	public char getSexe() {
		return sexe;
	}
	public void setSexe(char sexe) {
		this.sexe = sexe;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getEtatcivile() {
		return etatcivile;
	}
	public void setEtatcivile(String etatcivile) {
		this.etatcivile = etatcivile;
	}
	public String getAssurence() {
		return assurence;
	}
	public void setAssurence(String assurence) {
		this.assurence = assurence;
	}
	@Override
	public String toString() {
		return "Patient [sexe=" + sexe + ", dateNaissance=" + dateNaissance + ", profession=" + profession
				+ ", etatcivile=" + etatcivile + ", assurence=" + assurence + "]";
	}
	
	
}
