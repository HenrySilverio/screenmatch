package br.com.henrique.screenmatch.models;

import br.com.henrique.screenmatch.calculos.Classification;

public class Movie extends Titulo implements Classification {
    private String Director;

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        Director = director;
    }

    @Override
    public int getClassification() {
        return 0;
    }
}
