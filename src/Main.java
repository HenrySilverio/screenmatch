import br.com.henrique.screenmatch.models.Movie;


public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.setTitle("The Grand Fatther");
        myMovie.setYearOfRelease(2023);
        myMovie.setDurationInMinutes(120);
        myMovie.setPlanAvailable(true);

        myMovie.showTecnicalDetails();
        myMovie.evaluate(4.5);
        myMovie.evaluate(3.8);
        myMovie.evaluate(5.0);

        System.out.println("Media de avaliacoes do filme: " + myMovie.getMedia());
    }
}