package com.bayareala8s.movielens.controller;

import com.bayareala8s.movielens.model.Rating;
import com.bayareala8s.movielens.repository.RatingRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RatingServiceController {

    @Autowired
    private RatingRepository repository;

    @RequestMapping(value = "/rating/objectid/{id}", method = RequestMethod.GET)
    public Rating getRatingById(@PathVariable("id") ObjectId id) {

        return repository.findBy_id(id);
    }

    @RequestMapping(value = "/rating/userid/{id}", method = RequestMethod.GET)
    public List<Rating> getRatingsByUserId(@PathVariable("id") long userid) {

        return repository.findRatingsByUserId(userid);
    }

    @RequestMapping(value = "/rating", method = RequestMethod.POST)
    public Rating createRating(@Valid @RequestBody Rating rating) {
        rating.set_id(ObjectId.get());
        repository.save(rating);
        return rating;
    }

    @RequestMapping(value = "/rating/objectid/{id}", method = RequestMethod.DELETE)
    public void deletePet(@PathVariable ObjectId id) {
        repository.delete(repository.findBy_id(id));
    }
}

