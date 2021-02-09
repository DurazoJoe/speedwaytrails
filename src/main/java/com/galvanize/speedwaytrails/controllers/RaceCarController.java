package com.galvanize.speedwaytrails.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/racecars")
public class RaceCarController {

    @GetMapping
    public String getAllRaceCars(){
            return "All cars are here";
    }

}