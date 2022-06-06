package com.test.starwars.apis;

import com.test.starwars.enums.Type;
import com.test.starwars.services.StarWarsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/api")
public class StartWarsApis {

    @Autowired
    private StarWarsServices services;

    @GetMapping("search/starwars/")
    public ResponseEntity<?> searchApi(@RequestParam("type") Type command, @RequestParam("name") String query){
        ResponseEntity<?> responseEntity = services.searchAPI(command.toString().toUpperCase(Locale.ROOT), query);
        return responseEntity;
    }

    @GetMapping("starwars")
    public ResponseEntity<?> searchApi2(@RequestParam("type") Type command, @RequestParam("name") String query){
        ResponseEntity<?> responseEntity = services.searchAPI(command.toString().toUpperCase(Locale.ROOT), query);
        return responseEntity;
    }

}
