package com.io.idmansour.lignevisitechambre;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import com.io.idmansour.chambre.Chambre;
import com.io.idmansour.visite.Visite;

@Document(collection = "ligneVisite")
public class LigneVisiteChambre {
	@Field(name = "dateDebut")
	@NotNull
	@DateTimeFormat(pattern="yyyy.MM.dd")
	private Date dateDebut;
	@Field(name = "dateFin")
	@NotNull
	@DateTimeFormat(pattern="yyyy.MM.dd")
	private Date dateFin;
	private Visite visite;
	private Chambre chambre;
	public LigneVisiteChambre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LigneVisiteChambre(@NotNull Date dateDebut, @NotNull Date dateFin, Visite visite, Chambre chambre) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.visite = visite;
		this.chambre = chambre;
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
	public Visite getVisite() {
		return visite;
	}
	public void setVisite(Visite visite) {
		this.visite = visite;
	}
	public Chambre getChambre() {
		return chambre;
	}
	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}
	@Override
	public String toString() {
		return "LigneVisiteChambre [dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", visite=" + visite
				+ ", chambre=" + chambre + "]";
	}
	
	
}
