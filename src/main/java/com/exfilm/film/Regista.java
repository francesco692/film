package com.exfilm.film;

public class Regista {
    private String nome;
    private String cognome;
    private String tipoRegia;
    private int telefono;
    private int eta;
    Regista(String nome, String cognome, String tipoRegia, int telefono, int eta)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.tipoRegia = tipoRegia;
        this.telefono = telefono;
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
    public String getTipoRegia()
    {
        return tipoRegia;
    }
    public int getTelefono()
    {
        return telefono;
    }
    public int getEta()
    {
        return eta;
    }
}
