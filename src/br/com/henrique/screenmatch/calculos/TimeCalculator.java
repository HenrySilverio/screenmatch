package br.com.henrique.screenmatch.calculos;

import br.com.henrique.screenmatch.models.Titulo;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

//    public void include(Movie movie) {
//        totalTime += movie.getDurationInMinutes();
//    }
//
//    public void include(Series series) {
//        totalTime += series.getDurationInMinutes();
//    }

    public void include(Titulo titulo) {
        totalTime += titulo.getDurationInMinutes();
    }
}
