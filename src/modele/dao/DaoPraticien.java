/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modele.metier.Praticien;
import modele.metier.TypePraticien;

/**
 *
 * @author finde
 */
public class DaoPraticien {

    public static List<Praticien> selectAll() throws SQLException {
        
        List<Praticien> lesPraticiens = new ArrayList<>();
        Praticien unPraticien = null;
        
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT * FROM PRATICIEN";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        
        
        rs = pstmt.executeQuery();
        while (rs.next()) {
            String numeroPraticien = rs.getString("PRA_NUM");
            String nomPraticien = rs.getString("PRA_NOM");
            String prenomPraticien = rs.getString("PRA_PRENOM");
            String adressePraticien = rs.getString("PRA_ADRESSE");
            String cpPraticien = rs.getString("PRA_CP");
            String villePraticien = rs.getString("PRA_VILLE");
            String coefNotorietePraticien = rs.getString("PRA_COEFNOTORIETE");
            String typePraticien = rs.getString("TYP_CODE");

            TypePraticien unType = DaoTypePraticien.selectOneByType(typePraticien);
            
            unPraticien = new Praticien(numeroPraticien, nomPraticien, prenomPraticien, adressePraticien, cpPraticien, villePraticien, coefNotorietePraticien, unType);
            lesPraticiens.add(unPraticien);
        }
        return lesPraticiens;
    }
    
    public static Praticien selectOneByCode(int code) throws SQLException, ClassNotFoundException {
        Praticien unPraticien = null;
        
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT * FROM praticien WHERE PRA_NUM ='"+ code +"'";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        rs = pstmt.executeQuery();      
      
        while (rs.next()) {
            String numeroPraticien = rs.getString("PRA_NUM");
            String nomPraticien = rs.getString("PRA_NOM");
            String prenomPraticien = rs.getString("PRA_PRENOM");
            String adressePraticien = rs.getString("PRA_ADRESSE");
            String cpPraticien = rs.getString("PRA_CP");
            String villePraticien = rs.getString("PRA_VILLE");
            String coefNotorietePraticien = rs.getString("PRA_COEFNOTORIETE");
            String typePraticien = rs.getString("TYP_CODE");
            
            TypePraticien unType = DaoTypePraticien.selectOneByType(typePraticien);

            unPraticien = new Praticien(numeroPraticien, nomPraticien, prenomPraticien, adressePraticien, cpPraticien, villePraticien, coefNotorietePraticien, unType);
           
        }
        return unPraticien;
    }
}
