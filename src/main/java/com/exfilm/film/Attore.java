package com.exfilm.film;

public class Attore {
    private String nome;
    private String cognome;
    private int telefono;
    private String tipoRecit;
    private int eta;
    Attore(String nome, String cognome, int telefono, String tipoRecit, int eta)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
        this.tipoRecit = tipoRecit;
        this.eta = eta;
    }

    public String getNome()
    {
        return nome;
    }
    public String getCognome()
    {
        return cognome;
    }
    public int getTelefono()
    {
        return telefono;
    }
    public String getTipoRecit()
    {
        return tipoRecit;
    }
    public int getEta()
    {
        return eta;
    }
}
