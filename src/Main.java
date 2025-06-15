//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.title = "The Grand Fatther";
        myMovie.yearOfRelease = 2023;
        myMovie.durationInMinutes = 120;

        System.out.println("Movie: " + myMovie.title);
    }
}