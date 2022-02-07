package com.srujanpakanati.samplemflixadbproject.model;

public class Imdb {
    private Integer id;
    private Double rating;
    private Integer votes;

    public Imdb() {
    }

    public Imdb(Integer id, Double rating, Integer votes) {
        this.id = id;
        this.rating = rating;
        this.votes = votes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    @Override
    public String toString() {
        return "Imdb{" +
                "id=" + id +
                ", rating=" + rating +
                ", votes=" + votes +
                '}';
    }
}
