package com.io.idmansour.mesure;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import com.io.idmansour.personne.Personne;

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
	
	
	
}
