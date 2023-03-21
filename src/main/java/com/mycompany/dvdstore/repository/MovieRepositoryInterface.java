package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepositoryInterface {

    void add(Movie movie);
}
