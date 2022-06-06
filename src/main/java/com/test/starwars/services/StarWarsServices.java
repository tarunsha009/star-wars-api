package com.test.starwars.services;

import com.test.starwars.dto.*;
import com.test.starwars.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StarWarsServices {

    @Autowired
    private PeopleRepository peopleRepository;

    @Autowired
    private FilmsRepository filmsRepository;

    @Autowired
    private PlanetRepository planetRepository;

    @Autowired
    private SpeciesRepository speciesRepository;

    @Autowired
    private StarshipsRepository starshipsRepository;

    @Autowired
    private VehiclesRepository vehiclesRepository;

    public ResponseEntity<?> searchAPI(String command, String query) {

        ResponseEntity<?> responseEntity;

        switch (command){
            case "PEOPLE":
                PeopleDTO peopleDTO = peopleRepository.execute(command, query);
                responseEntity = new ResponseEntity<>(peopleDTO, HttpStatus.OK);
                break;
            case "PLANETS":
                PlanetDTO planetDTO = planetRepository.execute(command, query);
                responseEntity = new ResponseEntity<>(planetDTO, HttpStatus.OK);
                break;
            case "SPECIES":
                SpeciesDTO speciesDTO = speciesRepository.execute(command, query);
                responseEntity = new ResponseEntity<>(speciesDTO, HttpStatus.OK);
                break;
            case "STARSHIPS":
                StarshipsDTO starshipsDTO = starshipsRepository.execute(command, query);
                responseEntity = new ResponseEntity<>(starshipsDTO, HttpStatus.OK);
                break;
            case "VEHICLES":
                VehiclesDTO vehiclesDTO = vehiclesRepository.execute(command, query);
                responseEntity = new ResponseEntity<>(vehiclesDTO, HttpStatus.OK);
                break;
            case "FILMS":
                FilmsDTO filmsDTO = filmsRepository.execute(command, query);
                responseEntity = new ResponseEntity<>(filmsDTO, HttpStatus.OK);
                break;
            default:
                responseEntity = new ResponseEntity<>("No such Option", HttpStatus.BAD_REQUEST);
                System.out.println(command + " is not a available command");
                break;
        }
        return responseEntity;
    }
}
