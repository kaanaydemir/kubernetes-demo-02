package com.kaanaydemir.directorapi.repositories;

import com.kaanaydemir.directorapi.entities.Director;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends MongoRepository<Director,String> {
}
