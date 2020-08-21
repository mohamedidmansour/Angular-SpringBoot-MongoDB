package com.io.idmansour.ordonance;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import com.io.idmansour.patient.Patient;
import com.io.idmansour.personne.Personne;
import com.io.idmansour.visite.Visite;

@Document(collection = "ordonances")
public class Ordonance{
	@Id	
	private String id;
	@Field(name = "titreOrd")
	@NotNull
	private String titreOrd;
	@Field(name = "dateOrd")
	@NotNull
	@DateTimeFormat(pattern="yyyy.MM.dd")
	private Date dateOrd;
	@Field(name = "observation")
	@NotNull
	private String observation;
	@Field(name = "traitement")
	@NotNull
	private String traitement;
	private Visite visite;
	private Patient patient;
	
	
}
