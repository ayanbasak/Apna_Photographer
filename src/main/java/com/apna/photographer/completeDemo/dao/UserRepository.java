package com.apna.photographer.completeDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apna.photographer.completeDemo.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	
}
 