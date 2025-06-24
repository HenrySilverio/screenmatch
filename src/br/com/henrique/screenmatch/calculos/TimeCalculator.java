package br.com.henrique.screenmatch.calculos;

import br.com.henrique.screenmatch.models.Movie;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void include(Movie movie) {
        totalTime += movie.getDurationInMinutes();
    }
}
