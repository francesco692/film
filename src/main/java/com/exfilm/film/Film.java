package com.exfilm.film;

import java.time.LocalDate;

public class Film {
    private String titolo;
    private LocalDate dataUscita;
    private String genere;
    Film(String titolo, LocalDate dataUscita, String genere)
    {
        this.titolo = titolo;
        this.dataUscita = dataUscita;
        this.genere = genere;
    }
    public String getTitolo()
    {
        return titolo;
    }
    public LocalDate getDataUscita()
    {
        return dataUscita;
    }
    public String getGenere()
    {
        return genere;
    }
}
