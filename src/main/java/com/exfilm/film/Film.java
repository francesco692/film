package com.exfilm.film;

import java.time.LocalDate;

public class Film {
    private String titolo;
    private String dataUscita;
    private String genere;
    Film(String titolo, String dataUscita, String genere)
    {
        this.titolo = titolo;
        this.dataUscita = dataUscita;
        this.genere = genere;
    }
    public String getTitolo()
    {
        return titolo;
    }
    public String getDataUscita()
    {
        return dataUscita;
    }
    public String getGenere()
    {
        return genere;
    }
}
