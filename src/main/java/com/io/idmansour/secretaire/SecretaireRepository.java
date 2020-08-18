package com.io.idmansour.secretaire;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.io.idmansour.admin.Admin;
import com.io.idmansour.medecin.Medecin;
import com.io.idmansour.patient.Patient;
import com.io.idmansour.personne.Personne;
@Repository
public interface SecretaireRepository extends MongoRepository<Secretaire, String> {

}
