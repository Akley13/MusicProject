package br.com.musicproject.modelos;

public class Podcasts extends Media {
    private String host;
    private String description;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getClassification() {
        if (getTotalLikes() > 500){
            return 10;
        } else {
            return 6;
        }
    }
}
