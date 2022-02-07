package com.srujanpakanati.samplemflixadbproject.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "theaters")
public class Theater {
    @Id
    private String id;
    private Integer theaterId;
    private Location location;

    public Theater() {
    }

    public Theater(Integer theaterId, Location location) {
        this.theaterId = theaterId;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(Integer theaterId) {
        this.theaterId = theaterId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


}
