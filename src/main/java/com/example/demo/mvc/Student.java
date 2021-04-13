package com.example.demo.mvc;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashMap;

@Getter
@Setter
public class Student {
	private String firstName;
	private String secondName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String favoriteLanguage;
	private String[] operatingSystem;
	
	Student(){
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("IN", "INDIA");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("RU", "Russia");
	}
}
