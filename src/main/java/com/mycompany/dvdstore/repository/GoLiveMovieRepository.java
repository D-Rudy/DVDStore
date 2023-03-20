package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GoLiveMovieRepository implements MovieRepositoryInterface {

    private final Logger logger = LoggerFactory.getLogger(GoLiveMovieRepository.class);

    public void add(Movie movie) {
        logger.trace("Adding movie in a txt file");
        FileWriter writer;
        try {
            writer = new FileWriter("movies.txt", true);
            writer.write(movie.getGenre() + ";" + movie.getTitle() + "\n");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.info("The movie {} added!", movie.getTitle());
    }


}
