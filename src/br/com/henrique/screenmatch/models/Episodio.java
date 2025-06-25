package br.com.henrique.screenmatch.models;

import br.com.henrique.screenmatch.calculos.Classification;

public class Episodio implements Classification {
    private int id;
    private String nome;
    private Series series;
    private int totalVisualizacoes;

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Series getSeries() {
        return series;
    }

    public void setSeries(Series series) {
        this.series = series;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getClassification() {
        if (totalVisualizacoes > 100) {
            return 4;
        } else {
            return 0;
        }
    }
}
