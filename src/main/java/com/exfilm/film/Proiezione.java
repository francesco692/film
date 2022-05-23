package com.exfilm.film;

public class Proiezione {
    private String t_film;
    private String citta_c;
    private String nome_c;
    Proiezione(String t_film, String citta_c, String nome_c)
    {
        this.t_film = t_film;
        this.citta_c = citta_c;
        this.nome_c = nome_c;
    }

    public String getT_film()
    {
        return t_film;
    }
    public String getCitta_c()
    {
        return citta_c;
    }
    public String getNome_c()
    {
        return nome_c;
    }
}
