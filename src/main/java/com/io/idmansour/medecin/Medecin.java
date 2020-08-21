package com.io.idmansour.medecin;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.io.idmansour.personne.Personne;
import com.io.idmansour.specialite.Specialite;
import com.io.idmansour.visite.Visite;

@Document(collection = "medecins")
public class Medecin extends Personne{
	@Field(name = "prestation")
	@NotNull
	private String prestation;
	@Field(name = "login")
	@NotNull
	private String login;
	@Field(name = "mdp")
	@NotNull
	private String mdp;
	private Specialite specialite;
	private Visite visite;
	public Medecin(String id, @NotNull String nom, @NotNull String prenom, @NotNull String adresse, @NotNull String tel,
			@NotNull String prestation, @NotNull String login, @NotNull String mdp, Specialite specialite,
			Visite visite) {
		super(id, nom, prenom, adresse, tel);
		this.prestation = prestation;
		this.login = login;
		this.mdp = mdp;
		this.specialite = specialite;
		this.visite = visite;
	}
	public Visite getVisite() {
		return visite;
	}
	public void setVisite(Visite visite) {
		this.visite = visite;
	}
	public String getPrestation() {
		return prestation;
	}
	public void setPrestation(String prestation) {
		this.prestation = prestation;
	}
	public Specialite getSpecialite() {
		return specialite;
	}
	public void setSpecialite(Specialite specialite) {
		this.specialite = specialite;
	}
	
	
	public Medecin(String id, @NotNull String nom, @NotNull String prenom, @NotNull String adresse, @NotNull String tel,
			@NotNull String prestation, @NotNull String login, @NotNull String mdp) {
		super(id, nom, prenom, adresse, tel);
		this.prestation = prestation;
		this.login = login;
		this.mdp = mdp;
	}
	public Medecin(String id, @NotNull String nom, @NotNull String prenom, @NotNull String adresse, @NotNull String tel,
			@NotNull String prestation, @NotNull String login, @NotNull String mdp, Specialite specialite) {
		super(id, nom, prenom, adresse, tel);
		this.prestation = prestation;
		this.login = login;
		this.mdp = mdp;
		this.specialite = specialite;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	@Override
	public String toString() {
		return "Admin [login=" + login + ", mdp=" + mdp + "]";
	}
	
}
