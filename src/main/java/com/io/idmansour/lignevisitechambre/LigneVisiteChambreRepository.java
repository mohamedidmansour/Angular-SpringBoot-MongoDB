package com.io.idmansour.lignevisitechambre;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneVisiteChambreRepository extends MongoRepository<LigneVisiteChambre, String> {

}
