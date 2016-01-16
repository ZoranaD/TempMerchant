package app.repository.local;


import org.springframework.data.mongodb.repository.MongoRepository;

import app.model.AgeGroup;



public interface AgeGroupLocalRepository extends MongoRepository<AgeGroup,String> {

}
