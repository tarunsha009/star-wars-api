package com.test.starwars.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FilmsDTO {

    public String title;
    @JsonProperty("episode_id")
    public int episodeId;
    @JsonProperty("opening_crawl")
    public String openingCrawl;
    public String director;
    public String producer;
    @JsonProperty("release_date")
    public String releaseDate;
    public List<String> characters;
    public List<String> planets;
    public List<String> starships;
    public List<String> vehicles;
    public List<String> species;
    public Date created;
    public Date edited;
    public String url;
}
