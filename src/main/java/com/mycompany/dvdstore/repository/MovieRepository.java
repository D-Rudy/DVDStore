package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class MovieRepository implements MovieRepositoryInterface {

    private final Logger logger = LoggerFactory.getLogger(MovieRepository.class);

    private final List<Movie> movies = new ArrayList<Movie>();

    public void add(Movie movie) {
        movies.add(movie);
        logger.info("The movie {} added!", movie.getTitle());
    }
}
