package com.example.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Country {
  private String name;
  private int population;
}
