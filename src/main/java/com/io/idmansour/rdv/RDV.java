package com.io.idmansour.rdv;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

import com.io.idmansour.medecin.Medecin;
import com.io.idmansour.patient.Patient;

@Document(collection = "rdvs")
public class RDV {
	
	@Id	
	private String id;
	@Field(name = "dateRDV")
	@NotNull
	@DateTimeFormat(pattern="yyyy.MM.dd")
	private Date dateRDV;
	@Field(name = "motif")
	@NotNull
	private String motif;
	private Medecin  medecin;
	private Patient patient;
	
	public RDV(String id, @NotNull Date dateRDV, @NotNull String motif, Medecin medecin, Patient patient) {
		super();
		this.id = id;
		this.dateRDV = dateRDV;
		this.motif = motif;
		this.medecin = medecin;
		this.patient = patient;
	}
	public RDV() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RDV(String id, @NotNull Date dateRDV, @NotNull String motif) {
		super();
		this.id = id;
		this.dateRDV = dateRDV;
		this.motif = motif;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDateRDV() {
		return dateRDV;
	}
	public void setDateRDV(Date dateRDV) {
		this.dateRDV = dateRDV;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	
	public Medecin getMedecin() {
		return medecin;
	}
	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	@Override
	public String toString() {
		return "RDV [id=" + id + ", dateRDV=" + dateRDV + ", motif=" + motif + "]";
	}
	
	
	
}
