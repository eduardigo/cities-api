package com.github.eduardoardigo.citiesapi;

import com.github.eduardoardigo.citiesapi.countries.Country;
import com.github.eduardoardigo.citiesapi.repository.CountryRepository;
import java.util.Scanner;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryResource {

   private CountryRepository repository;

   public CountryResource(CountryRepository repository) {
       this.repository = repository;
   }
   
    @GetMapping
    public Page<Country> countries(Pageable page) {
        return repository.findAll(page);
    }

}