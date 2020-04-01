package com.bayareala8s.movielens.repository;


import com.bayareala8s.movielens.model.Movie;
import com.bayareala8s.movielens.model.Rating;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends MongoRepository<Movie, String> {

    Movie findBy_id(ObjectId _id);

    Movie findMovieByMovieId(long movieId);
}
