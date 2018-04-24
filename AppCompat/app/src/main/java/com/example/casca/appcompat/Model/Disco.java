package com.example.casca.appcompat.Model;

/**
 * Created by casca on 20/04/2018.
 */

public class Disco {

    public Disco(String artista, String titulo, int anio, int image) {
        this.artista = artista;
        this.titulo = titulo;
        this.anio = anio;
        this.image = image;
    }

    public String getArtista() {
        return artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    public int getImage() {
        return image;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setImage(int image) {
        this.image = image;
    }

    private String artista;
    private String titulo;
    private int anio;
    private int image;
}
