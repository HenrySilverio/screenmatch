package br.com.henrique.screenmatch.models;

public class Titulo {

    private String title;
    private int yearOfRelease;
    private boolean isPlanAvailable;
    private  double sumAssessment;
    private int totalAssessment;
    private int durationInMinutes;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public boolean isPlanAvailable() {
        return isPlanAvailable;
    }

    public void setPlanAvailable(boolean planAvailable) {
        isPlanAvailable = planAvailable;
    }

    public double getSumAssessment() {
        return sumAssessment;
    }

    public void setSumAssessment(double sumAssessment) {
        this.sumAssessment = sumAssessment;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getTotalAssessment() {
        return totalAssessment;
    }

    public void setTotalAssessment(int totalAssessment) {
        this.totalAssessment = totalAssessment;
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
