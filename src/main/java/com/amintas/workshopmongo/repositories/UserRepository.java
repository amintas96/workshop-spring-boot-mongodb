package com.amintas.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.amintas.workshopmongo.entities.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
