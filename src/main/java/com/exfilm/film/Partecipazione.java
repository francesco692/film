package com.exfilm.film;

public class Partecipazione {
    private String nomeAttore;
    private String cognomeAttore;
    private String titoloFilm;
    Partecipazione(String nomeAttore, String cognomeAttore, String titoloFilm)
    {
        this.nomeAttore = nomeAttore;
        this.cognomeAttore = cognomeAttore;
        this.titoloFilm = titoloFilm;
    }
    public String getNomeAttore()
    {
        return nomeAttore;
    }
    public String getCognomeAttore()
    {
        return cognomeAttore;
    }
    public String getTitoloFilm()
    {
        return titoloFilm;
    }
}
