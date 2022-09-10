package ru.vasilev.magunivers.controllers;

import org.springframework.web.bind.annotation.*;
import ru.vasilev.magunivers.entities.Country;

import java.util.List;

//    /countries/getAllCountries

@RequestMapping("/countries")
public interface CountryController {
	@GetMapping("/getAllCountries")
	List<Country> getAllCountries();

	@GetMapping("/getCountryById")
	Country getCountryById(@RequestParam("id") int id);

	@GetMapping("/getCountryByNameRus/{name_rus}")
	Country getCountryByNameRus(@PathVariable("name_rus") String name_rus);

	@PostMapping("/saveCountry")
	void saveCountry(@RequestBody Country country);

	@DeleteMapping("/deleteCountry")
	void deleteCountry(@RequestParam("id") int id);



}
