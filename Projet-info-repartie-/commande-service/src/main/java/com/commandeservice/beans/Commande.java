package com.commandeservice.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int clientId;
    private int NumCom;
    private Date datecom;
    private double montant;

    public Commande() {
    }

    public Commande(int numCom, Date datecom, double montant) {
        NumCom = numCom;
        this.datecom = datecom;
        this.montant = montant;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getNumCom() {
        return NumCom;
    }

    public void setNumCom(int numCom) {
        NumCom = numCom;
    }

    public Date getDatecom() {
        return datecom;
    }

    public void setDatecom(Date datecom) {
        this.datecom = datecom;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
