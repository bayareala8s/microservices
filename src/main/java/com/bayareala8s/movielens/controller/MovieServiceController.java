package com.bayareala8s.movielens.controller;

import com.bayareala8s.movielens.model.Movie;
import com.bayareala8s.movielens.model.Rating;
import com.bayareala8s.movielens.repository.MovieRepository;
import com.bayareala8s.movielens.repository.RatingRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieServiceController {

    @Autowired
    private MovieRepository repository;

    @RequestMapping(value = "/movie/objectid/{id}", method = RequestMethod.GET)
    public Movie getMovieById(@PathVariable("id") ObjectId id) {

        return repository.findBy_id(id);
    }

    @RequestMapping(value = "/movie/movieid/{id}", method = RequestMethod.GET)
    public Movie getMovieByMovieId(@PathVariable("id") long movieid) {

        return repository.findMovieByMovieId(movieid);
    }
}
