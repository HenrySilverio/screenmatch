import br.com.henrique.screenmatch.calculos.FiltroRecomendacao;
import br.com.henrique.screenmatch.calculos.TimeCalculator;
import br.com.henrique.screenmatch.models.Episodio;
import br.com.henrique.screenmatch.models.Movie;
import br.com.henrique.screenmatch.models.Series;


public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.setTitle("The Grand Fatther");
        myMovie.setYearOfRelease(2023);
        myMovie.setDurationInMinutes(120);
        myMovie.setPlanAvailable(true);

        Movie myMovie2 = new Movie();
        myMovie2.setTitle("Avatar: The Way of Water");
        myMovie2.setYearOfRelease(2022);
        myMovie2.setDurationInMinutes(192);
        myMovie2.setPlanAvailable(true);


        myMovie.showTecnicalDetails();
        myMovie.evaluate(8.5);
        myMovie.evaluate(6.8);
        myMovie.evaluate(9.0);

        System.out.println("Media de avaliacoes do filme: " + myMovie.getMedia());

        //chama classe Series
        Series lost = new Series();
        lost.setTitle("Lost");
        lost.setYearOfRelease(2000);
        lost.showTecnicalDetails();
        lost.setTemporadas(10);
        lost.setMinutesPerEpisode(50);
        lost.setEpisodiosPorTemporada(10);
        System.out.println("Total de minutos da série: " + lost.getDurationInMinutes());

        TimeCalculator timeCalculator = new TimeCalculator();
        timeCalculator.include(myMovie);
        timeCalculator.include(myMovie2);
        timeCalculator.include(lost);
        System.out.println(timeCalculator.getTotalTime());

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtra(myMovie);
        filtroRecomendacao.filtra(myMovie2);

        Episodio episodio = new Episodio();
        episodio.setId(1);
        episodio.setNome("Pilot");
        episodio.setSeries(lost);
        episodio.setTotalVisualizacoes(150);
        filtroRecomendacao.filtra(episodio);
    }

}