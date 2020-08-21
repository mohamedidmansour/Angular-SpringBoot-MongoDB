package com.io.idmansour.facture;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import com.io.idmansour.personne.Personne;
import com.io.idmansour.visite.Visite;

@Document(collection = "factures")
public class Facture{
	@Id	
	private String id;
	@Field(name = "dateFacture")
	@NotNull
	@DateTimeFormat(pattern="yyyy.MM.dd")
	private Date dateFacture;
	@Field(name = "type")
	@NotNull
	private String type;
	@Field(name = "nbrSeanceFacture")
	@NotNull
	private int nbrSeanceFacture;
	@Field(name = "montant")
	@NotNull
	private double montant;
	private Visite visite;
	public Facture(String id, @NotNull Date dateFacture, @NotNull String type, @NotNull int nbrSeanceFacture,
			@NotNull double montant, Visite visite) {
		super();
		this.id = id;
		this.dateFacture = dateFacture;
		this.type = type;
		this.nbrSeanceFacture = nbrSeanceFacture;
		this.montant = montant;
		this.visite = visite;
	}
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDateFacture() {
		return dateFacture;
	}
	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNbrSeanceFacture() {
		return nbrSeanceFacture;
	}
	public void setNbrSeanceFacture(int nbrSeanceFacture) {
		this.nbrSeanceFacture = nbrSeanceFacture;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	public Visite getVisite() {
		return visite;
	}
	public void setVisite(Visite visite) {
		this.visite = visite;
	}
	@Override
	public String toString() {
		return "Facture [id=" + id + ", dateFacture=" + dateFacture + ", type=" + type + ", nbrSeanceFacture="
				+ nbrSeanceFacture + ", montant=" + montant + ", visite=" + visite + "]";
	}
	
}
