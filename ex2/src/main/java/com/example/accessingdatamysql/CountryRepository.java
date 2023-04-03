package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.Country;

public interface CountryRepository extends CrudRepository<Country, Integer> {

}