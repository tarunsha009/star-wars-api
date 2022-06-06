package com.test.starwars.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.starwars.dto.Results;
import com.test.starwars.dto.StarshipsDTO;
import com.test.starwars.exception.DataNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StarshipsRepository {

    @Autowired
    private RestTemplate restTemplate;

    public StarshipsDTO execute(String command, String query) {
        ResponseEntity<Results> forEntity = restTemplate.getForEntity("/starships?search={query}", Results.class,query);
        Results body = forEntity.getBody();
        if(body.getResults().isEmpty()){
            throw new DataNotFoundException("Could not found the Starships with query parameter "+ query);
        }
        Object o = body.getResults().get(0);
        ObjectMapper objectMapper = new ObjectMapper();
        StarshipsDTO starshipsDTO = objectMapper.convertValue(o, StarshipsDTO.class);
        return starshipsDTO;
    }
}
