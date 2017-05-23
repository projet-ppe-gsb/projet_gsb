/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modele.metier.TypePraticien;

/**
 *
 * @author finde
 */
public class DaoTypePraticien {
    
        public static TypePraticien selectOneByType(String type) throws SQLException {
            
            ResultSet rs;
            PreparedStatement pstmt;
            Jdbc jdbc = Jdbc.getInstance();
            // préparer la requête
            String requete = "SELECT * FROM TYPE_PRATICIEN WHERE TYP_CODE = ?";
            pstmt = jdbc.getConnexion().prepareStatement(requete);
            pstmt.setString(1, type);
            rs = pstmt.executeQuery();
            
            String codeType = "";
            String libelleType = "";
            String lieuType = "";
            
            if(rs.next()) {
                codeType = rs.getString("TYP_CODE");
                libelleType = rs.getString("TYP_LIBELLE");
                lieuType = rs.getString("TYP_LIEU");
            }
            TypePraticien unType = new TypePraticien(codeType, libelleType,lieuType);
            
            return unType;
        }
        
}
