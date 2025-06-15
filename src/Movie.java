public class Movie {
    String title;
    int yearOfRelease;
    boolean isPlanAvailable;
    double sumAssessment;
    int totalAssessment;
    int durationInMinutes;

    void showTecnicalDetails() {
        System.out.println("Title: " + title);
        System.out.println("Year of Release: " + yearOfRelease);
        System.out.println("Duration: " + durationInMinutes + " minutes");
        System.out.println("Is Plan Available: " + isPlanAvailable);
    }

    void evaluate(double assessment) {
        sumAssessment += assessment;
        totalAssessment++;
    }

    double getMedia(){
        return sumAssessment/totalAssessment;
    }
}
