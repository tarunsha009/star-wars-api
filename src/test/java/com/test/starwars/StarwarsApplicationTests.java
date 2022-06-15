package com.test.starwars;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.starwars.dto.PeopleDTO;
import com.test.starwars.dto.Results;
import com.test.starwars.dto.VehiclesDTO;
import com.test.starwars.repository.PeopleRepository;
import com.test.starwars.services.StarWarsServices;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = StarwarsApplication.class)
class StarwarsApplicationTests {

	@Test
	void contextLoads() {
	}

}
