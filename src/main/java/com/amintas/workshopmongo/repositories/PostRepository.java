package com.amintas.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.amintas.workshopmongo.entities.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
