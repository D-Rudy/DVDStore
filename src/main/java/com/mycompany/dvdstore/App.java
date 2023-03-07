package com.mycompany.dvdstore;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Logger logger = LoggerFactory.getLogger(App.class);

        Scanner sc = new Scanner(System.in);
        MovieService movieService = new MovieService();
        System.out.println("Quel est le genre du film ? ");
        String genre = sc.nextLine();
        System.out.println("Quel est le titre du film ? ");
        String title = sc.nextLine();
        movieService.registerMovie(new Movie(title, genre));
        logger.info("Le film {} a été ajouté au catalogue", title);
        sc.close();
    }
}
