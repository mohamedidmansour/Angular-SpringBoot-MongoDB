package com.io.idmansour.facture;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import com.io.idmansour.personne.Personne;

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
	
}
