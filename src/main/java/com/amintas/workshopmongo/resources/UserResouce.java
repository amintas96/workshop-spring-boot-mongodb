package com.amintas.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amintas.workshopmongo.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResouce {

	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		
		User maria = new User(null, "maria brown", "maria@gmail.com");
		User alex = new User(null, "alex green", "alex@gmail.com");
		
		List<User> list = new ArrayList<>();
		
		list.addAll(Arrays.asList(maria, alex));
		return ResponseEntity.ok().body(list);
	}
}
