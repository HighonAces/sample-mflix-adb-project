package com.srujanpakanati.samplemflixadbproject.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "movies")
public class Movie {
    @Id
    private String id;
    private String plot;
    private String poster;
    private List<String> genres;
    private Integer runtime;
    private List<String> cast;
    private String fullplot;
    private List<String> countries;
    private Date released;
    private List<String> directors;
    private String rated;
    private Awards awards;
    private Integer year;
    private Imdb imdb;
    private String type;
    private Tomatoes tomatoes;

    public Movie() {
    }

    public Movie(String plot, String poster, List<String> genres, Integer runtime, List<String> cast, String fullplot, List<String> countries, Date released, List<String> directors, String rated, Awards awards, Integer year, Imdb imdb, String type, Tomatoes tomatoes) {
        this.plot = plot;
        this.poster = poster;
        this.genres = genres;
        this.runtime = runtime;
        this.cast = cast;
        this.fullplot = fullplot;
        this.countries = countries;
        this.released = released;
        this.directors = directors;
        this.rated = rated;
        this.awards = awards;
        this.year = year;
        this.imdb = imdb;
        this.type = type;
        this.tomatoes = tomatoes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public List<String> getCast() {
        return cast;
    }

    public void setCast(List<String> cast) {
        this.cast = cast;
    }

    public String getFullplot() {
        return fullplot;
    }

    public void setFullplot(String fullplot) {
        this.fullplot = fullplot;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public Date getReleased() {
        return released;
    }

    public void setReleased(Date released) {
        this.released = released;
    }

    public List<String> getDirectors() {
        return directors;
    }

    public void setDirectors(List<String> directors) {
        this.directors = directors;
    }

    public String getRated() {
        return rated;
    }

    public void setRated(String rated) {
        this.rated = rated;
    }

    public Awards getAwards() {
        return awards;
    }

    public void setAwards(Awards awards) {
        this.awards = awards;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Imdb getImdb() {
        return imdb;
    }

    public void setImdb(Imdb imdb) {
        this.imdb = imdb;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Tomatoes getTomatoes() {
        return tomatoes;
    }

    public void setTomatoes(Tomatoes tomatoes) {
        this.tomatoes = tomatoes;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id='" + id + '\'' +
                ", plot='" + plot + '\'' +
                ", poster='" + poster + '\'' +
                ", genres=" + genres +
                ", runtime=" + runtime +
                ", cast=" + cast +
                ", fullplot='" + fullplot + '\'' +
                ", countries=" + countries +
                ", released=" + released +
                ", directors=" + directors +
                ", rated='" + rated + '\'' +
                ", awards=" + awards +
                ", year=" + year +
                ", imdb=" + imdb +
                ", type='" + type + '\'' +
                ", tomatoes=" + tomatoes +
                '}';
    }
}
