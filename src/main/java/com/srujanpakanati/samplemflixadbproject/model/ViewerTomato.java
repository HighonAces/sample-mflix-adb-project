package com.srujanpakanati.samplemflixadbproject.model;

public class ViewerTomato {
    private Double rating;
    private Integer numReviews;
    private Integer meter;

    public ViewerTomato() {
    }

    public ViewerTomato(Double rating, Integer numReviews, Integer meter) {
        this.rating = rating;
        this.numReviews = numReviews;
        this.meter = meter;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getNumReviews() {
        return numReviews;
    }

    public void setNumReviews(Integer numReviews) {
        this.numReviews = numReviews;
    }

    public Integer getMeter() {
        return meter;
    }

    public void setMeter(Integer meter) {
        this.meter = meter;
    }
}
