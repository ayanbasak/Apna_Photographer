package com.apna.photographer.completeDemo.service;

import java.util.List;

import com.apna.photographer.completeDemo.entity.Photographer;

public interface PhotographerService {

	public List<Photographer> findAll();
	
	public Photographer findById(int theId);
	
	public void save(Photographer thePhotographer);
	
	public void deleteById(int theId);
	
	
	
}
