package com.io.idmansour.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.io.idmansour.entity.Personne;
@Repository
public interface PersonneRepository extends MongoRepository<Personne, String> {

}
