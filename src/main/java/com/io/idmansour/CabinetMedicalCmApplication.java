package com.io.idmansour;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.io.idmansour.entity.Personne;
import com.io.idmansour.repository.PersonneRepository;

@SpringBootApplication
public class CabinetMedicalCmApplication implements CommandLineRunner {

	@Autowired
	private PersonneRepository p;
	public static void main(String[] args) {
		SpringApplication.run(CabinetMedicalCmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		p.findAll().forEach(personne->{
			System.out.println(personne.getId());
		});
		
	}

}
