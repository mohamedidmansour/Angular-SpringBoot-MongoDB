package com.io.idmansour.mesure;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import com.io.idmansour.infermiere.Infermiere;
import com.io.idmansour.personne.Personne;
import com.io.idmansour.visite.Visite;

@Document(collection = "mesures")
public class Mesure{
	@Id
	private String id;
	@Field(name = "dateDebut")
	@DateTimeFormat(pattern="yyyy.MM.dd")
	@NotNull
	private Date dateDebut;
	@Field(name = "dateFin")
	@DateTimeFormat(pattern="yyyy.MM.dd")
	@NotNull
	private Date dateFin;
	@Field(name = "tauxCellule")
	@NotNull
	private String tauxCellule;
	@Field(name = "cgc")
	@NotNull
	private String cgc;
	@Field(name = "poids")
	@NotNull
	private String poids;
	@Field(name = "taille")
	@NotNull
	private String taille;
	private Infermiere infermiere;
	private Visite visite;
	public Mesure(String id, @NotNull Date dateDebut, @NotNull Date dateFin, @NotNull String tauxCellule,
			@NotNull String cgc, @NotNull String poids, @NotNull String taille, Infermiere infermiere, Visite visite) {
		super();
		this.id = id;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.tauxCellule = tauxCellule;
		this.cgc = cgc;
		this.poids = poids;
		this.taille = taille;
		this.infermiere = infermiere;
		this.visite = visite;
	}
	public Mesure() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public String getTauxCellule() {
		return tauxCellule;
	}
	public void setTauxCellule(String tauxCellule) {
		this.tauxCellule = tauxCellule;
	}
	public String getCgc() {
		return cgc;
	}
	public void setCgc(String cgc) {
		this.cgc = cgc;
	}
	public String getPoids() {
		return poids;
	}
	public void setPoids(String poids) {
		this.poids = poids;
	}
	public String getTaille() {
		return taille;
	}
	public void setTaille(String taille) {
		this.taille = taille;
	}
	public Infermiere getInfermiere() {
		return infermiere;
	}
	public void setInfermiere(Infermiere infermiere) {
		this.infermiere = infermiere;
	}
	public Visite getVisite() {
		return visite;
	}
	public void setVisite(Visite visite) {
		this.visite = visite;
	}
	
	
}
