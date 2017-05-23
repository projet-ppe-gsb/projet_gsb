package modele.metier;

import java.util.Date;

public class RapportVisite {
    
    private Visiteur visiteur;
    private int numeroRapport;
    private Praticien praticien;
    private Date dateRapport;
    private String bilanRapport;
    private String motifRapport;
    
    public RapportVisite(Visiteur unVisiteur,int numeroRap, Praticien unPraticien, Date date, String bilan, String motif) {
        this.visiteur = unVisiteur;
        this.numeroRapport = numeroRap;
        this.praticien = unPraticien;
        this.dateRapport = date;
        this.bilanRapport = bilan;
        this.motifRapport = motif;
    }
    
    public int getNumeroRapport() {
        return numeroRapport;
    }

    public void setNumeroRapport(int numeroRapport) {
        this.numeroRapport = numeroRapport;
    }

    public Visiteur getVisiteur() {
        return visiteur;
    }

    public void setVisiteur(Visiteur visiteur) {
        this.visiteur = visiteur;
    }

    public Praticien getPraticien() {
        return praticien;
    }

    public void setPraticien(Praticien praticien) {
        this.praticien = praticien;
    }

    public Date getDateRapport() {
        return dateRapport;
    }

    public void setDateRapport(Date dateRapport) {
        this.dateRapport = dateRapport;
    }

    public String getBilanRapport() {
        return bilanRapport;
    }

    public void setBilanRapport(String bilanRapport) {
        this.bilanRapport = bilanRapport;
    }

    public String getMotifRapport() {
        return motifRapport;
    }

    public void setMotifRapport(String motifRapport) {
        this.motifRapport = motifRapport;
    }
    

}
