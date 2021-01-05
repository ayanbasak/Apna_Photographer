package com.apna.photographer.completeDemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apna.photographer.completeDemo.dao.UserRepository;
import com.apna.photographer.completeDemo.entity.User;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	@Autowired
	public UserServiceImpl(UserRepository theUserRepository) {
		this.userRepository = theUserRepository;
	}

	@Transactional
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Transactional
	public User findById(int theId) {

		Optional<User> result = userRepository.findById(theId);

		User theUser = null;

		if (result.isPresent()) {
			theUser = result.get();
		} else {
			// we did not find the employee
			throw new RuntimeException("Did not find User Id - " + theId);
		}
		return theUser;
	}

	
	@Transactional
	public void save(User theUser) {
		userRepository.save(theUser);

	}

	@Transactional
	public void deleteById(int theId) {
		userRepository.deleteById(theId);
	}

}
