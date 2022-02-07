package com.srujanpakanati.samplemflixadbproject.model;

public class Tomatoes {

    private ViewerTomato viewerTomato;
    private CriticTomato criticTomato;

    public Tomatoes() {
    }

    public Tomatoes(ViewerTomato viewerTomato, CriticTomato criticTomato) {
        this.viewerTomato = viewerTomato;
        this.criticTomato = criticTomato;
    }

    public ViewerTomato getViewerTomato() {
        return viewerTomato;
    }

    public void setViewerTomato(ViewerTomato viewerTomato) {
        this.viewerTomato = viewerTomato;
    }

    public CriticTomato getCriticTomato() {
        return criticTomato;
    }

    public void setCriticTomato(CriticTomato criticTomato) {
        this.criticTomato = criticTomato;
    }
}
