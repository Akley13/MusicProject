package br.com.musicproject.modelos.principal;

import br.com.musicproject.modelos.FavoriteMedia;
import br.com.musicproject.modelos.Musics;
import br.com.musicproject.modelos.Podcasts;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Musics asas = new Musics();
        asas.setTitle("Asas - Duzz");

        Musics prostituto = new Musics();
        prostituto.setTitle("Prostituto - Cjota");

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
        podPimps.setHost("\nAkley");
        System.out.println(podPimps.getHost());
        podPimps.setDescription("Podcast dirigido e criado por: Akley Alves");
        System.out.println(podPimps.getDescription());


        for (int i = 0; i < 200; i++) {
            podPimps.like();
        }

        for (int i = 0; i < 300; i++) {
            podPimps.reproduce();
        }

        podPimps.dataSheet();
        favorite.adds(podPimps);

        ArrayList<Musics> playlist = new ArrayList<>();

        playlist.add(asas);
        playlist.add(prostituto);

        System.out.println("\nMusics: " + playlist.size());
        System.out.println("Titulo: " + asas.getTitle());
        System.out.println("Titulo: " + prostituto.getTitle());

        System.out.println(playlist);





    }
}