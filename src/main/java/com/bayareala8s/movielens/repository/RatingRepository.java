package com.bayareala8s.movielens.repository;

import com.bayareala8s.movielens.model.Rating;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RatingRepository extends MongoRepository<Rating, String> {

    Rating findBy_id(ObjectId _id);

    List<Rating> findRatingsByUserId(long userId);
}
