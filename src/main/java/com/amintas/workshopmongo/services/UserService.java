package com.amintas.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amintas.workshopmongo.dto.UserDTO;
import com.amintas.workshopmongo.entities.User;
import com.amintas.workshopmongo.repositories.UserRepository;
import com.amintas.workshopmongo.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {

		return repo.findAll();

	}

	public User findById(String id) {

		Optional<User> user = repo.findById(id);

		return user.orElseThrow(() -> new ObjectNotFoundException(id));
	}

	public User insert(User user) {

		return repo.insert(user);
	}

	public void Delete(String id) {
		findById(id);
		repo.deleteById(id);
	}

	public User fromDTO(UserDTO objDTO) {

		return new User(objDTO.getId(), objDTO.getName(), objDTO.getEmail());

	}
}
