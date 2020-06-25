package com.ashitsahitsh.jokesapp.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JokeServiceImplTest {

    JokeService jokeService;

    @BeforeEach
    void setUp() {
        jokeService = new JokeServiceImpl(null);
    }

    @Test
    void getJoke() {
        assertNotNull(jokeService.getJoke());
    }
}