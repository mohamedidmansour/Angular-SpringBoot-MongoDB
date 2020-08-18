package com.io.idmansour.rdv;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.format.annotation.DateTimeFormat;

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
	@Override
	public String toString() {
		return "RDV [id=" + id + ", dateRDV=" + dateRDV + ", motif=" + motif + "]";
	}
	
	
	
}
