package com.example.controllers;

import com.example.model.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

  @GetMapping("/france")
  public ResponseEntity<Country> france() {
    Country c = Country.builder().name("Франция").population(65).build();

    return ResponseEntity
            .ok()
            .header("continent", "Europe")
            .header("capital", "Paris")
            .header("favorite_food", "cheese and wine")
            .header("Content-type", "application/xml")
            .body(c);
  }

  @GetMapping("/russia")
  public ResponseEntity<Country> russia() {
    Country c = Country.builder().name("Россия").population(145).build();

    return ResponseEntity
            .status(HttpStatus.OK)
            .header("continent", "Asiopa")
            .header("capital", "Москва")
            .header("favorite_food", "vodka and ogurets")
            .header("Content-type", "application/json")
            .body(c);
  }
}
