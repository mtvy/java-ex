package com.example.accessingdatamysql;

import org.springframework.data.repository.CrudRepository;

import com.example.accessingdatamysql.Car;

public interface CarRepository extends CrudRepository<Car, Integer> {

}