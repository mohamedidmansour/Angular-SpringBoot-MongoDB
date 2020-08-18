package com.io.idmansour.specialite;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "specialites")
public class Specialite {
	
	@Id	
	private String id;
	@Field(name = "nomSpeacialite")
	private String nomSpecialite;
	public Specialite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Specialite(String id, String nomSpecialite) {
		super();
		this.id = id;
		this.nomSpecialite = nomSpecialite;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNomSpecialite() {
		return nomSpecialite;
	}
	public void setNomSpecialite(String nomSpecialite) {
		this.nomSpecialite = nomSpecialite;
	}
	@Override
	public String toString() {
		return "Specialite [id=" + id + ", nomSpecialite=" + nomSpecialite + "]";
	}
	
}
