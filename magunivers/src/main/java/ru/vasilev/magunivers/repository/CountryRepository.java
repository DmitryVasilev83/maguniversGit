package ru.vasilev.magunivers.repository;


import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.vasilev.magunivers.entities.Country;

import java.util.List;
import java.util.Optional;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
    
    @Transactional
    List<Country> findAll();
    @Transactional
    Optional<Country> findById(Long id);
    
    @Transactional
    Country findOneByNameRus(String name_rus);

    
}
