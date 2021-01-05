package com.apna.photographer.completeDemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.apna.photographer.completeDemo.dao.PhotographerRepository;
import com.apna.photographer.completeDemo.entity.Photographer;

@Service
public class PhotographerServiceImpl implements PhotographerService {

	private PhotographerRepository photographerRepository;

	@Autowired
	public PhotographerServiceImpl(PhotographerRepository thePhotographerRepository) {
		this.photographerRepository = thePhotographerRepository;
	}

	@Transactional
	public List<Photographer> findAll() {
		return photographerRepository.findAll();
	}

	@Transactional
	public Photographer findById(int theId) {

		Optional<Photographer> result = photographerRepository.findById(theId);

		Photographer thePhotographer = null;

		if (result.isPresent()) {
			thePhotographer = result.get();
		} else {
			// we did not find the employee
			throw new RuntimeException("Did not find Photographer Id - " + theId);
		}
		return thePhotographer;
	}

	
	@Transactional
	public void save(Photographer thePhotographer) {
		photographerRepository.save(thePhotographer);

	}

	@Transactional
	public void deleteById(int theId) {
		photographerRepository.deleteById(theId);
	}

}
