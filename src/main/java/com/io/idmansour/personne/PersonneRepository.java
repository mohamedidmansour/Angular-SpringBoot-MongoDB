package com.io.idmansour.personne;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PersonneRepository extends MongoRepository<Personne, String> {

}
