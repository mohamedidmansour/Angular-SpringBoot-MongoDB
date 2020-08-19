package com.io.idmansour.visite;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import com.io.idmansour.personne.Personne;

@Document(collection = "visites")
public class Visite{
	@Id	
	private String id;
	@Field(name = "dateDebut")
	@NotNull
	@DateTimeFormat(pattern="yyyy.MM.dd")
	private Date dateDebut;
	@Field(name = "dateFin")
	@NotNull
	@DateTimeFormat(pattern="yyyy.MM.dd")
	private Date dateFin;
	@Field(name = "typeVisite")
	@NotNull
	private String typeVisite;
	@Field(name = "nbrVisiteEffectuer")
	@NotNull
	private int nbrVisiteEffectuer;
	
}
