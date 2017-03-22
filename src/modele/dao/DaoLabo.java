package modele.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modele.metier.Labo;

public class DaoLabo {
    
        public static Labo selectOneByCode(String code) throws SQLException {
            
            ResultSet rs;
            PreparedStatement pstmt;
            Jdbc jdbc = Jdbc.getInstance();
            // préparer la requête
            String requete = "SELECT * FROM LABO WHERE LAB_CODE = ?";
            pstmt = jdbc.getConnexion().prepareStatement(requete);
            pstmt.setString(1, code);
            rs = pstmt.executeQuery();
            
            String nomLabo = "";
            String nomChefVente = "";
            if(rs.next()) {
                nomLabo = rs.getString("LAB_NOM");
                nomChefVente = rs.getString("LAB_CHEFVENTE");   
            }

            Labo unLabo = new Labo(code, nomLabo, nomChefVente);
            return unLabo;
        }
}
