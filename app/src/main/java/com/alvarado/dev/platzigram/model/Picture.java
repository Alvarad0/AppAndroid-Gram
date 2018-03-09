package com.alvarado.dev.platzigram.model;

/**
 * Created by dev on 9/03/18.
 */

public class Picture {
    private String imagen;
    private String usuario;
    private String tiempo;
    private String numLike = "0";

    public Picture(String imagen, String usuario, String tiempo, String numLike) {
        this.imagen = imagen;
        this.usuario = usuario;
        this.tiempo = tiempo;
        this.numLike = numLike;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getNumLike() {
        return numLike;
    }

    public void setNumLike(String numLike) {
        this.numLike = numLike;
    }
}
