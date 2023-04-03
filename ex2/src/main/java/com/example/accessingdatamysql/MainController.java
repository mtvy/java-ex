package com.example.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping(path="/demo") 
public class MainController {
  @Autowired
  private UserRepository userRepository;
  @Autowired
  private CountryRepository countryRepository;
  @Autowired
  private CarRepository carRepository;

  @PostMapping(path="/add_user")
  public @ResponseBody String addNewUser (@RequestParam String name
      , @RequestParam String email) {

    User n = new User();
    n.setName(name);
    n.setEmail(email);
    userRepository.save(n);
    return "Saved";
  }

  @PostMapping(path="/add_country") 
  public @ResponseBody String addNewCountry (@RequestParam String name
      , @RequestParam String mobileCode) {
    Country n = new Country();
    n.setName(name);
    n.setMobileCode(mobileCode);
    countryRepository.save(n);
    return "Saved";
  }

  @PostMapping(path="/add_car") 
  public @ResponseBody String addCar (@RequestParam String name
      , @RequestParam String model) {
    Car n = new Car();
    n.setName(name);
    n.setModel(model);
    carRepository.save(n);
    return "Saved";
  }

  @GetMapping(path="/all_users")
  public @ResponseBody Iterable<User> getAllUsers() {
    return userRepository.findAll();
  }

  @GetMapping(path="/all_countries")
  public @ResponseBody Iterable<Country> getAllCountries() {
    return countryRepository.findAll();
  }

  @GetMapping(path="/all_cars")
  public @ResponseBody Iterable<Car> getAllCars() {
    return carRepository.findAll();
  }
}