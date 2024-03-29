package com.io.idmansour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.io.idmansour.medecin.Medecin;
import com.io.idmansour.medecin.MedecinRepository;
import com.io.idmansour.patient.Patient;
import com.io.idmansour.patient.PatientRepository;
import com.io.idmansour.personne.Personne;
import com.io.idmansour.personne.PersonneRepository;
import com.io.idmansour.specialite.Specialite;
import com.io.idmansour.specialite.SpecialiteRepository;

@SpringBootApplication
public class CabinetMedicalCmApplication implements CommandLineRunner {

	@Autowired
	private PersonneRepository p;
	@Autowired
	private PatientRepository pp;
	@Autowired
	private MedecinRepository medecinRepository;
	@Autowired
	private SpecialiteRepository specialiteRepository;
	public static void main(String[] args) {
		
		SpringApplication.run(CabinetMedicalCmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		medecinRepository.save(new Medecin(null, "nom", "prenom", "adresse", "tel", "prestation", "login", "mdp", new Specialite(null, "Spec")));
		//pp.save(new Patient(null, "Ali", "Alaoui", "marrakech", "0643127526", 'H', new Date(), "ingénieur", "d", "AXA Maroc"));
		pp.findAll().forEach(personne->{
			System.out.println(personne.getId());
		});
		
	}

}
