package com.galvanize.speedwaytrails.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class RaceControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void listAllRaceCars() throws Exception {

        mockMvc.perform(get("/api/v1/racecars"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(2));

    }


}
