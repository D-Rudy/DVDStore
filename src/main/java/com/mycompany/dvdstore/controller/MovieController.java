package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class MovieController {
    private final Logger logger = LoggerFactory.getLogger(MovieController.class);

    public void addUsingConsole() {


        logger.info("Add a movie using console");
        Scanner sc = new Scanner(System.in);

        MovieService movieService = new MovieService();
        Movie movie = new Movie();

        System.out.println("What is the genre of the movie ? ");
        movie.setGenre(sc.nextLine());
        System.out.println("What is the title of the movie ?");
        movie.setTitle(sc.nextLine());

        movieService.registerMovie(movie);

        sc.close();
    }
}
