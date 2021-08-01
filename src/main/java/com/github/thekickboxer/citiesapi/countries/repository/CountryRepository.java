package com.github.thekickboxer.citiesapi.countries.repository;

import com.github.thekickboxer.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
