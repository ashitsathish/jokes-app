package com.ashitsahitsh.jokesapp;

import com.ashitsahitsh.jokesapp.service.JokeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JokesAppApplication {
@Autowired
JokeServiceImpl jokeServiceImpl;

	public static void main(String[] args) {
		SpringApplication.run(JokesAppApplication.class, args);
	}
}
