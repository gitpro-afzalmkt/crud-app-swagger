package com.afzal.swagger.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.afzal.swagger.Entity.Place;
import com.afzal.swagger.Service.PlaceService;


@RestController
public class SwagController {
	
	@Autowired
	private PlaceService serv;
	
	
	@GetMapping("/allPlaces")
	public List<Place> allPlaces() {
		return serv.getAllPlaces();
	}
	
	
	@GetMapping("/place/{id}")
	public Optional<Place> placeById(@PathVariable("id") Long id) {
		return serv.getPlaceById(id);
	}
	
	
	@DeleteMapping("/deletePlace/{id}")
	public String deletePlace(@PathVariable("id") Long id) {
		serv.deletePlace(id);
		return "Delete Success";
	}
	
	
	@PutMapping("/addPlace")
	public Place addPlace(@RequestBody Place p) {
		return serv.savePlace(p);
	}

}
