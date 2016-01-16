package app.repository.local;

import org.springframework.data.mongodb.repository.MongoRepository;

import app.model.VehicleInsPackage;


public interface VehicleInsPackLocalRepository extends MongoRepository<VehicleInsPackage, String>{

}
