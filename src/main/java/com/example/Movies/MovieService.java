package com.example.Movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepo movieRepo;
    public List<Movies> getMovies()
    {
        return movieRepo.findAll();
    }
    
    public Optional<Movies> getSingle(String imdbId){
        return movieRepo.findMovieByImdbId(imdbId);
    }

}
