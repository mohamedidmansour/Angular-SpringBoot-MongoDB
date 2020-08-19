package com.io.idmansour.service;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.io.idmansour.personne.Personne;

@Document(collection = "services")
public class Service extends Personne{
	@Id
	private String id;
	@Field(name = "nomservice")
	@NotNull
	private String nomService;
	
	
	
}
