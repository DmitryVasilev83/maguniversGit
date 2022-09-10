package ru.vasilev.magunivers.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vasilev.magunivers.entities.Country;
import ru.vasilev.magunivers.services.CountryService;

import java.util.List;

@RestController
//@RequestMapping("/countries")
public class CountryControllerImpl implements CountryController {
	
	private CountryService countryService;
	
	@Autowired
	public void setCountryService(CountryService countryService) {
		this.countryService = countryService;
	}
	
	@Override
	public List<Country> getAllCountries() {
		return countryService.getAllCountries();
	}

	@Override
	public Country getCountryById(int id) {
		return countryService.getCountryById(id);
	}

	@Override
	public Country getCountryByNameRus(String name_rus) {
		return countryService.getCountryByNameRus(name_rus);
	}
	
	@Override
	public void saveCountry(Country country) {
		countryService.saveCountry(country);
	}

	@Override
	public void deleteCountry(int id) {
		countryService.deleteCountry(id);
	}

}
