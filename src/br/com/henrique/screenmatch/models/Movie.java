package br.com.henrique.screenmatch.models;

public class Movie {
    private String title;
    private int yearOfRelease;
    private boolean isPlanAvailable;
    private  double sumAssessment;
    private int totalAssessment;
    private int durationInMinutes;


    public String getTitle() {
        return title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public boolean isPlanAvailable() {
        return isPlanAvailable;
    }

    public int getTotalAssessment() {
        return totalAssessment;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setPlanAvailable(boolean planAvailable) {
        isPlanAvailable = planAvailable;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public double getSumAssessment() {
        return sumAssessment;
    }

   public void showTecnicalDetails() {
        System.out.println("Title: " + title);
        System.out.println("Year of Release: " + yearOfRelease);
        System.out.println("Duration: " + durationInMinutes + " minutes");
        System.out.println("Is Plan Available: " + isPlanAvailable);
    }

   public void evaluate(double assessment) {
        sumAssessment += assessment;
        totalAssessment++;
    }

   public double getMedia(){
        return sumAssessment/totalAssessment;
    }


}
