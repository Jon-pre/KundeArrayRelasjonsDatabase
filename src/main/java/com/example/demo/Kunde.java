package com.example.demo;

public class Kunde {
    private String navn;
    private String Adresse;

    public Kunde(String navn, String adresse) {
        this.navn = navn;
        Adresse = adresse;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }
}
