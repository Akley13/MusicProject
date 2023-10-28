package br.com.musicproject.modelos.principal;

import br.com.musicproject.modelos.FavoriteMedia;
import br.com.musicproject.modelos.Musics;
import br.com.musicproject.modelos.Podcasts;

public class Main {
    public static void main(String[] args) {

        Musics asas = new Musics();
        asas.setTitle("Asas - Duzz");

        for (int i = 0; i < 500; i++) {
            asas.like();
        }

        for (int i = 0; i < 1000; i++) {
            asas.reproduce();
        }

        asas.dataSheet();

        FavoriteMedia favorite = new FavoriteMedia();
        favorite.adds(asas);

        Podcasts podPimps = new Podcasts();
        podPimps.setTitle("PodPimps");
        podPimps.setHost("Akley");

        for (int i = 0; i < 200; i++) {
            podPimps.like();
        }

        for (int i = 0; i < 300; i++) {
            podPimps.reproduce();
        }

        podPimps.dataSheet();
        favorite.adds(podPimps);

    }
}