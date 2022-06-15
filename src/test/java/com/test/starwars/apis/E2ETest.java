package com.test.starwars.apis;

import com.test.starwars.StarwarsApplication;
import com.test.starwars.services.StarWarsServices;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = StarwarsApplication.class)
public class E2ETest {

    private StartWarsApis startWarsApis;
    private StarWarsServices services;

    @BeforeEach
    public void setUp() {
        this.startWarsApis = new StartWarsApis();
        this.services = new StarWarsServices();
    }

//    @org.junit.jupiter.api.Test
//    public void givenNoMeterIdIsSuppliedWhenStoringShouldReturnErrorResponse() {
//        assertThat(startWarsApis.searchApi(Type.valueOf("PEOPLE"),"Luke").getStatusCode()).isEqualTo(HttpStatus.OK);
//    }
}
