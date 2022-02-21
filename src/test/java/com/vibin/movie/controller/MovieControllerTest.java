package com.vibin.movie.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class MovieControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void findAll() throws Exception {
        
        this.mockMvc.perform(get("/movieplex/movies"))
                    .andExpect(status().isOk());
    }
}