package com.srujanpakanati.samplemflixadbproject.model;

import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

public class Location {
    private Address address;
    private GeoJsonPoint point;

    public Location() {
    }

    public Location(Address address, GeoJsonPoint point) {
        this.address = address;
        this.point = point;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public GeoJsonPoint getPoint() {
        return point;
    }

    public void setPoint(GeoJsonPoint point) {
        this.point = point;
    }
}
