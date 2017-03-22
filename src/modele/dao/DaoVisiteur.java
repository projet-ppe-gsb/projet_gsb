package modele.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modele.metier.Labo;
import modele.metier.Visiteur;
import modele.metier.Secteur;

public class DaoVisiteur {

    public static List<Visiteur> selectAll() throws SQLException {
        List<Visiteur> lesVisiteurs = new ArrayList<Visiteur>();
        Visiteur unVisiteur = null;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT * FROM VISITEUR";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        
        
        rs = pstmt.executeQuery();
        while (rs.next()) {
            String matriculeVisiteur = rs.getString("VIS_MATRICULE");
            String nomVisiteur = rs.getString("VIS_NOM");
            String prenomVisiteur = rs.getString("VIS_PRENOM");
            String adresseVisiteur = rs.getString("VIS_ADRESSE");
            String cpVisiteur = rs.getString("VIS_CP");
            String villeVisiteur = rs.getString("VIS_VILLE");
            Date dateEmbaucheVisiteur = rs.getDate("VIS_DATEEMBAUCHE");
            String codeSecteur = rs.getString("SEC_CODE");
            String codeLabo = rs.getString("LAB_CODE");
            Secteur unSecteur = DaoSecteur.selectOneByCode(codeSecteur);
            Labo unLabo = DaoLabo.selectOneByCode(codeLabo);
 
            unVisiteur = new Visiteur(matriculeVisiteur, nomVisiteur, prenomVisiteur, adresseVisiteur, cpVisiteur, villeVisiteur, dateEmbaucheVisiteur, unSecteur, unLabo);
            lesVisiteurs.add(unVisiteur);
        }
        return lesVisiteurs;
    }
  
    public static Visiteur getOne(String id) throws SQLException, ClassNotFoundException {
        Visiteur unVisiteur = null;
        Secteur unSecteur = null;      
        Labo unLabo = null;
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT * FROM visiteur WHERE VIS_MATRICULE='"+ id +"'";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        rs = pstmt.executeQuery();      
      
        while (rs.next()) {
            String matricule = rs.getString("VIS_MATRICULE");
            String nom = rs.getString("VIS_NOM");
            String prenom = rs.getString("Vis_PRENOM");
            String adresse = rs.getString("VIS_ADRESSE");
            String cp = rs.getString("VIS_CP");;
            String ville = rs.getString("VIS_VILLE");
            Date date = rs.getDate("VIS_DATEEMBAUCHE");
            String secCode = rs.getString("SEC_CODE");
            String labCode = rs.getString("LAB_CODE");
            unSecteur = DaoSecteur.selectOneByCode(secCode);
            unLabo = DaoLabo.selectOneByCode(labCode);
            unVisiteur = new Visiteur(matricule, nom, prenom, adresse, cp, ville, date, unSecteur, unLabo);
           
        }
    return unVisiteur;
  }
}
