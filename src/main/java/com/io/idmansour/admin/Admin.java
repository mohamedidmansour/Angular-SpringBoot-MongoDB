package com.io.idmansour.admin;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.io.idmansour.personne.Personne;

@Document(collection = "admins")
public class Admin extends Personne{
	@Field(name = "login")
	@NotNull
	private String login;
	@Field(name = "mdp")
	@NotNull
	private String mdp;
	public Admin(String id, @NotNull String nom, @NotNull String prenom, @NotNull String adresse, @NotNull String tel,
			@NotNull String login, @NotNull String mdp) {
		super(id, nom, prenom, adresse, tel);
		this.login = login;
		this.mdp = mdp;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String id, @NotNull String nom, @NotNull String prenom, @NotNull String adresse, @NotNull String tel) {
		super(id, nom, prenom, adresse, tel);
		// TODO Auto-generated constructor stub
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
