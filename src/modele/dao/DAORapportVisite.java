package modele.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modele.metier.RapportVisite;
import modele.metier.Visiteur;
import modele.metier.Praticien;

public class DAORapportVisite {
    
    public static List<RapportVisite> selectAll() throws SQLException, ClassNotFoundException {
        List<RapportVisite> lesRapports = new ArrayList<RapportVisite>();
        RapportVisite unRapport = null;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT * FROM RAPPORT_VISITE";
        pstmt = jdbc.getConnexion().prepareStatement(requete);

        rs = pstmt.executeQuery();
        
        Visiteur unVisiteur;
        Praticien unPraticien;
        
        while (rs.next()) {
            int numeroRapport = rs.getInt("RAP_NUM");
            Date dateRapport = rs.getDate("RAP_DATE");
            String bilanRapport = rs.getString("RAP_BILAN");
            String motifRapport = rs.getString("RAP_MOTIF");
 
            unVisiteur = DaoVisiteur.getOneByMatricule(rs.getString("VIS_MATRICULE"));
            unPraticien = DaoPraticien.selectOneByCode(rs.getInt("PRA_NUM"));
            
            unRapport = new RapportVisite(unVisiteur, numeroRapport, unPraticien, dateRapport, bilanRapport, motifRapport);
            
            lesRapports.add(unRapport);
        }
        return lesRapports;
    }
    
}
