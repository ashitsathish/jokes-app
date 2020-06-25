package com.ashitsahitsh.jokesapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ashitsathish on Jun,2020
 */
@Configuration
public class ChuckConfiguration {
    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
    @Bean("chuckNorris")
    public ChuckNorrisQuotes chuckNorrisQuotes1(){
        System.out.println("Test");
        return new ChuckNorrisQuotes();
    }
}
