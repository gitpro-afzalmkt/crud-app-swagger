package com.afzal.swagger.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afzal.swagger.Entity.Place;
import com.afzal.swagger.Repository.PlaceRepository;

@Service
public class PlaceService {

		@Autowired
		private PlaceRepository repo;
		
		public List<Place> getAllPlaces() {
			return repo.findAll();
		}
		
		public Optional<Place> getPlaceById(Long id) {
			return repo.findById(id);
		}
		
		public void deletePlace(Long id) {
			repo.deleteById(id);
		}
		
		public Place savePlace(Place p) {
			return repo.save(p);
		}
		
}
