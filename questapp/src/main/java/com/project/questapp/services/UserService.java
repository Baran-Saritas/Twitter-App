package com.project.questapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.project.questapp.entities.User;
import com.project.questapp.repos.UserRepository;

@Service
public class UserService {
	public UserRepository userRepository;  // sag click source => generate constructor fields ilede yaptirabilirsin
										   // constructor injection`i

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<User> getAllUsers() {
	
		return userRepository.findAll();
	}

	public User saveOneUser(User newUser) {
		return userRepository.save(newUser);
	}

	public User getOneUser(Long userId) {
		return userRepository.findById(userId).orElse(null);
	}

	public User updateOneUser(Long userId, User newUser) {
		Optional<User> user  = userRepository.findById(userId);
		if(user.isPresent()) { // IsPresent User varmi bakiyor varsa true doner
			
			User foundUser = user.get();
			foundUser.setUsername(newUser.getUsername());
			foundUser.setPassword(newUser.getPassword());
			userRepository.save(foundUser);
			return foundUser;
		}
		else {
			return null;
		}
	}

	public void deleteById(Long userId) {
		userRepository.deleteById(userId);
		
	}
	

}
