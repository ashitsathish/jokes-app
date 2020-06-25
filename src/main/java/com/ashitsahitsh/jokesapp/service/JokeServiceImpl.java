package com.ashitsahitsh.jokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements  JokeService{


    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl(@Qualifier("chuckNorris") ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public String getJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }

}
