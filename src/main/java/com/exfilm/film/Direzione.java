package com.exfilm.film;

public class Direzione {
    private String nomeReg;
    private String cognomeReg;
    private String titoloFi;
    Direzione(String nomeReg, String cognomeReg, String titoloFi)
    {
        this.nomeReg = nomeReg;
        this.cognomeReg = cognomeReg;
        this.titoloFi = titoloFi;
    }

    public String getNomeReg()
    {
        return nomeReg;
    }
    public String getCognomeReg()
    {
        return cognomeReg;
    }
    public String getTitoloFi()
    {
        return titoloFi;
    }
}
