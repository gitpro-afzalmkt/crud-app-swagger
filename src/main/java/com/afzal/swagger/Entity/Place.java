package com.afzal.swagger.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "places")
public class Place {
	
		@Id
		private Long id;
		
		private String city;
		private String country;
		
		
		public Place() {
			super();
		}


		public Place(Long id, String city, String country) {
			super();
			this.id = id;
			this.city = city;
			this.country = country;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getCity() {
			return city;
		}


		public void setCity(String city) {
			this.city = city;
		}


		public String getCountry() {
			return country;
		}


		public void setCountry(String country) {
			this.country = country;
		}
		
		

}
