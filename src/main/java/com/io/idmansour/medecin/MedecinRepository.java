package com.io.idmansour.medecin;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.io.idmansour.patient.Patient;
import com.io.idmansour.personne.Personne;
@Repository
public interface MedecinRepository extends MongoRepository<Medecin, String> {

}
