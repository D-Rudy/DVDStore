package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;

public class MovieService {

    private final GoLiveMovieRepository goLiveMovieRepository = new GoLiveMovieRepository();
    public void registerMovie(Movie movie){
        goLiveMovieRepository.add(movie);
    }
}
