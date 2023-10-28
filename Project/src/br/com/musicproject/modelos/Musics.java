package br.com.musicproject.modelos;

import br.com.musicproject.modelos.Media;

public class Musics extends Media {

    private String artist;
    private String album;
    private String gender;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public int getClassification() {
        if (getTotalReproductions() > 500){
            return 10;
        } else {
            return 6;
        }
    }
}
