package com.mycompany.dvdstore.repository.memory;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class MemoryMovieRepository implements MovieRepositoryInterface {

    private final Logger logger = LoggerFactory.getLogger(MemoryMovieRepository.class);

    private final List<Movie> movies = new ArrayList<Movie>();

    public void add(Movie movie) {
        movies.add(movie);
        logger.info("The movie {} added!", movie.getTitle());
    }

}
