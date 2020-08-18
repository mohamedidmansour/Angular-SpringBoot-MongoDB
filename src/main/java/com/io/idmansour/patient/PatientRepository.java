package com.io.idmansour.patient;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.io.idmansour.personne.Personne;
@Repository
public interface PatientRepository extends MongoRepository<Patient, String> {

}
