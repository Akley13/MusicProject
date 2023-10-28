package br.com.musicproject.modelos;

public class FavoriteMedia {
    public void adds(Media media){
        if (media.getClassification() >= 8) {
            System.out.println("\nSUCESSO ABSOLUTO | " + media.getTitle());
        } else {
            System.out.println("\nALGUNS OUVINTES | " + media.getTitle());
        }
    }
}
