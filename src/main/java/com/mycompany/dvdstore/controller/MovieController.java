package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class MovieController {
    private final Logger logger = LoggerFactory.getLogger(MovieController.class);

    private MovieServiceInterface movieService;

    public void addUsingConsole() {


        logger.info("Add a movie using console");
        Scanner sc = new Scanner(System.in);

        Movie movie = new Movie();

        System.out.println("What is the genre of the movie ? ");
        movie.setGenre(sc.nextLine());
        System.out.println("What is the title of the movie ?");
        movie.setTitle(sc.nextLine());

        movieService.registerMovie(movie);

        sc.close();
    }

    public MovieServiceInterface getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }
}
