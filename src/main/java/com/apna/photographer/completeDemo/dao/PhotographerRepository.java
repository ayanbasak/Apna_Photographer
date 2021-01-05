package com.apna.photographer.completeDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apna.photographer.completeDemo.entity.Photographer;

public interface PhotographerRepository extends JpaRepository<Photographer, Integer> {

	
}
 