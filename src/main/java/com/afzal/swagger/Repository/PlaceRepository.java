package com.afzal.swagger.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.afzal.swagger.Entity.Place;


@Repository
public interface PlaceRepository extends JpaRepository<Place, Long>{

}
