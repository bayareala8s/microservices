package com.bayareala8s.movielens.model;


import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movies")
public class Movie {

    @Id
    public ObjectId _id;

    private long movieId;
    private String title;
    private String genres;

    public Movie() {

    }

    public Movie(ObjectId _id, long movieId, String title, String genres) {
        this._id = _id;
        this.movieId = movieId;
        this.title = title;
        this.genres = genres;
    }


    public ObjectId get_id() {
        return _id;
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }

    public long getMovieId() {
        return movieId;
    }

    public void setMovieId(long movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenres() {
        return genres;
    }

    public void setGenres(String genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "_id=" + _id +
                ", movieId=" + movieId +
                ", title='" + title + '\'' +
                ", genres='" + genres + '\'' +
                '}';
    }


}
