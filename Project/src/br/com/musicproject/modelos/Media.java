package br.com.musicproject.modelos;

public class Media {
    private String title;
    private int totalReproductions;
    private int totalLikes;
    private int classification;

    public void like() {
        this.totalLikes++;
    }

    public void reproduce() {
        this.totalReproductions++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalReproductions() {
        return totalReproductions;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public int getClassification() {
        return classification;
    }

    public void dataSheet(){
        System.out.println("\nTitle: " + getTitle());
        System.out.println("Total reproductions: " + getTotalReproductions());
        System.out.println("Total likes: " + getTotalLikes());
        System.out.println("Classification: " + getClassification());
    }
}