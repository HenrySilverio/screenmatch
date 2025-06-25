package br.com.henrique.screenmatch.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classification classification) {
        if (classification.getClassification() >= 4) {
            System.out.println("Entre os preferidos");
        } else if (classification.getClassification() >= 2) {
            System.out.println("Entre os medianos");
        } else {
            System.out.println("Entre os ruins");
        }
    }
}
