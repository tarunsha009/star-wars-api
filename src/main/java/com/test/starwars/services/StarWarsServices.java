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

    // FILMS, PEOPLE, PLANETS, SPECIES, STARSHIPS, VEHICLES

    public ResponseEntity<?> searchAPI(String command, String query) {
        //Command commands;
        if(command.equals("PEOPLE")){
            PeopleDTO peopleDTO = peopleRepository.execute(command, query);
            return new ResponseEntity<>(peopleDTO, HttpStatus.OK);
        }
        else if(command.equals("PLANETS")){
            PlanetDTO planetDTO = planetRepository.execute(command, query);
            return new ResponseEntity<>(planetDTO, HttpStatus.OK);
        }
        else if(command.equals("SPECIES")){
            SpeciesDTO speciesDTO = speciesRepository.execute(command, query);
            return new ResponseEntity<>(speciesDTO, HttpStatus.OK);
        }
        else if(command.equals("STARSHIPS")){
            StarshipsDTO starshipsDTO = starshipsRepository.execute(command, query);
            return new ResponseEntity<>(starshipsDTO, HttpStatus.OK);
        }
        else if(command.equals("VEHICLES")){
            VehiclesDTO vehiclesDTO = vehiclesRepository.execute(command, query);
            return new ResponseEntity<>(vehiclesDTO, HttpStatus.OK);
        }
        else if(command.equals("FILMS")){
            FilmsDTO filmsDTO = filmsRepository.execute(command, query);
            return new ResponseEntity<>(filmsDTO, HttpStatus.OK);
        }
        return new ResponseEntity<>("No such Option", HttpStatus.BAD_REQUEST);
    }
}
