//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.title = "The Grand Fatther";
        myMovie.yearOfRelease = 2023;
        myMovie.durationInMinutes = 120;

        myMovie.showTecnicalDetails();
        myMovie.isPlanAvailable = true;
        myMovie.evaluate(4.5);
        myMovie.evaluate(3.8);
        System.out.println("Sum Assessment: " + myMovie.sumAssessment);
        System.out.println("Total of Assessment: " + myMovie.totalAssessment);
        System.out.println("Average Assessment: " + myMovie.getMedia());
    }
}