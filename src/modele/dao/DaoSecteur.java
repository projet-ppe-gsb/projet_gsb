package modele.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modele.metier.Secteur;

public class DaoSecteur {
    
        public static Secteur selectOneByCode(String code) throws SQLException {
            
            ResultSet rs;
            PreparedStatement pstmt;
            Jdbc jdbc = Jdbc.getInstance();
            // préparer la requête
            String requete = "SELECT * FROM SECTEUR WHERE SEC_CODE = ?";
            pstmt = jdbc.getConnexion().prepareStatement(requete);
            pstmt.setString(1, code);
            rs = pstmt.executeQuery();
            
            String codeLabo = "";
            String libelle = "";
            
            if(rs.next()) {
                codeLabo = rs.getString("SEC_CODE");
                libelle = rs.getString("SEC_LIBELLE");
            }
            Secteur unSecteur = new Secteur(codeLabo, libelle);
            return unSecteur;
        }
}
