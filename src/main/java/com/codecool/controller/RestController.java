package com.codecool.controller;

import com.codecool.model.Article;
import com.codecool.model.GalleryPicture;
import com.codecool.model.astronauts.Astronauts;

import com.codecool.model.locations.Locations;
import com.codecool.model.spacecrafts.Spacecrafts;
import com.codecool.service.APIDataHandler;
import com.codecool.service.DataHandlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin("http://localhost:3000")
@org.springframework.web.bind.annotation.RestController
public class RestController {
    private APIDataHandler apiDataHandler;
    private DataHandlerService dataService;

    @Autowired
    public RestController(APIDataHandler apiDataHandler, DataHandlerService dataService) {
        this.apiDataHandler = apiDataHandler;
        this.dataService = dataService;
    }

    @GetMapping("/news")
    public Article[] news() {
        return dataService.getAllArticles();
    }

    @GetMapping("/astronauts")
    public Astronauts astronaut() {
        return dataService.getAllAstronauts();
    }

    @GetMapping("/gallery")
    public GalleryPicture[] gallery(){
        return dataService.getAllPictures();
    }

    @GetMapping("/spacecrafts")
    public Spacecrafts spacecrafts() {
        return dataService.getAllSpacecrafts();
    }

    @GetMapping("/locations")
    public Locations locations() {
        return dataService.getAllLocations();
    }

}
