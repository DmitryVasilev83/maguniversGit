package ru.vasilev.magunivers.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ru.vasilev.magunivers.entities.Country;
import ru.vasilev.magunivers.repository.CountryRepository;

import java.util.List;

@Service
public class CountryService  {
    
    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Country getCountryById(int id) {
        return countryRepository.findById(id).orElse(null);
    }
    
    public Country getCountryByNameRus(String name_rus) {
        return countryRepository.findOneByNameRus(name_rus);
    }

    public boolean isCountryWithTitleExists(String name_rus) {
        return countryRepository.findOneByNameRus(name_rus) != null;
    }
    public void saveCountry(Country country) {
        countryRepository.save(country);
    }

    public void deleteCountry(int id) {
        countryRepository.deleteById(id);
    }


}