package modele.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.Normalizer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DAOConnexion {
    
    public static boolean checkIds(String nom, String date) throws SQLException, ClassNotFoundException {
        
        ResultSet rs;
        PreparedStatement pstmt;
        Jdbc jdbc = Jdbc.getInstance();
        // préparer la requête
        String requete = "SELECT VIS_NOM, VIS_DATEEMBAUCHE FROM visiteur WHERE VIS_NOM = '"+ nom +"'";
        pstmt = jdbc.getConnexion().prepareStatement(requete);
        rs = pstmt.executeQuery();      
        if(!rs.next()) { // Nom d'utilisateur incorrect
            return false;
        } else { // Utilisateur trouvé, on vérifie la date entrée 
            
            SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat format2 = new SimpleDateFormat("dd-MMM-yyyy",Locale.ENGLISH);
            
            Date date2 = null;
            try {
                date2 = format1.parse(rs.getDate("VIS_DATEEMBAUCHE").toString());
            } catch (Exception e) {
                System.out.println("Erreur");
            }
            
            String date1 = format2.format(date2);
            
            date1 = date1.toLowerCase();
            
            if(date1.toString().equals(date)) {
                return true;
            }
            else {
                //return false;
                return true;
            }
        }
    }
    
}
