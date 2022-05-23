package com.exfilm.film;

public class Cinema {
    private String nome;
    private String citta;
    private int numPosti;
    private String indirizzo;
    Cinema(String nome, String citta, int numPosti, String indirizzo)
    {
        this.nome = nome;
        this.citta = citta;
        this.numPosti = numPosti;
        this.indirizzo = indirizzo;
    }

    public String getNome()
    {
        return nome;
    }
    public String getCitta()
    {
        return citta;
    }
    public int getNumPosti()
    {
        return numPosti;
    }
    public String getIndirizzo()
    {
        return indirizzo;
    }
}
