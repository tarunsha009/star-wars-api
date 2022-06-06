package com.test.starwars.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlanetDTO {
    public String name;
    @JsonProperty("rotation_period")
    public String rotationPeriod;
    @JsonProperty("orbital_period")
    public String orbitalPeriod;
    public String diameter;
    public String climate;
    public String gravity;
    public String terrain;
    public String surface_water;
    public String population;
    public List<String> residents;
    public List<String> films;
    public Date created;
    public Date edited;
    public String url;
}
