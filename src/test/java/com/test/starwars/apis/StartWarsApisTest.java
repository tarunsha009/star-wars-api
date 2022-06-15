package com.test.starwars.apis;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.starwars.StarwarsApplication;
import com.test.starwars.dto.PeopleDTO;
import com.test.starwars.dto.Results;
import com.test.starwars.dto.VehiclesDTO;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = StarwarsApplication.class)
class StartWarsApisTest {

    @Autowired
    private TestRestTemplate restTemplate;
    @Autowired
    private ObjectMapper mapper;

    @Test
    public void findPeopleByName() {

        String name = "Luke";
        ResponseEntity<Results> response = restTemplate.getForEntity("https://swapi.dev/api/people?search={query}", Results.class, name);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);

        Object o = response.getBody().getResults().get(0);
        PeopleDTO expectedValue = mapper.convertValue(o, PeopleDTO.class);
        assertEquals("Luke Skywalker", expectedValue.getName());
        assertEquals("19BBY", expectedValue.getBirthYear());
        assertEquals("blue", expectedValue.getEyeColor());
        assertEquals("male", expectedValue.getGender());
        assertEquals("77", expectedValue.getMass());
        assertEquals("172", expectedValue.getHeight());

    }

    @Test
    public void findVehicleByName() {

        String name = "Sand Crawle";
        ResponseEntity<Results> response = restTemplate.getForEntity("https://swapi.dev/api/vehicles?search={query}", Results.class, name);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);

        Object o = response.getBody().getResults().get(0);
        VehiclesDTO expectedValue = mapper.convertValue(o, VehiclesDTO.class);
        assertEquals("Sand Crawler", expectedValue.getName());
        assertEquals("46", expectedValue.getCrew());
        assertEquals("Digger Crawler", expectedValue.getModel());
        assertEquals("30", expectedValue.getPassengers());
        assertEquals("wheeled", expectedValue.getVehicle_class());

    }
}