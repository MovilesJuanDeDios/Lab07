package com.example.casca.appcompat.Model;

/**
 * Created by casca on 16/04/2018.
 */

public class Cancion {

    public Cancion(String artista, String titulo, String album, int image, int dir) {
        this.artista = artista;
        this.titulo = titulo;
        this.album = album;
        this.image = image;
        this.dir = dir;
    }

    public String getArtista() {
        return artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAlbum() {
        return album;
    }

    public int getImage() {
        return image;
    }

    public int getDir() {
        return dir;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnio(String album) {
        this.album = album;
    }

    public void setImage(int image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return artista + " - " + titulo;
    }

    private String artista;
    private String titulo;
    private String album;
    private int image;
    private int dir;

}
