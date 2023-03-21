package com.mycompany.dvdstore.repository.file;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Repository
public class FileMovieRepository implements MovieRepositoryInterface {

    private final Logger logger = LoggerFactory.getLogger(FileMovieRepository.class);

    @Value("${movies.file.location}")
    private File file;

    public void add(Movie movie) {
        logger.trace("Adding movie in a txt file");
        FileWriter writer;
        try {
            writer = new FileWriter(file, true);
            writer.write(movie.getGenre() + ";" + movie.getTitle() + "\n");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.info("The movie {} added!", movie.getTitle());
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
