package org.example;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;
@XmlRootElement(name = "Releve")
@XmlAccessorType(XmlAccessType.FIELD)
public class Releve {
    private int rib;
    @XmlTransient
    private String date;
    private int solde;

    public Releve(int rib, String date, int solde) {
        this.rib = rib;
        this.date = date;
        this.solde = solde;
    }

    public Releve() {
    }

    public int getRib() {
        return rib;
    }

    public void setRib(int rib) {
        this.rib = rib;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }
}
