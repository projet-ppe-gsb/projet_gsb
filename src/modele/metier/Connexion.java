package modele.metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author btssio
 */
public class Connexion {
  public static void main(String[] args) {      
      
        System.out.println("-------- Connexion ------");

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

        } catch (ClassNotFoundException e) {

            System.out.println("Driver inconnu");
            e.printStackTrace();
            return;
        }

        System.out.println("Driver OK");

        Connection connection = null;

        try {

            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521", "pgsb", "pgsb");
            
            System.out.println("Connexion réussie");
        } catch (SQLException e) {

            System.out.println("Connexion interrompue");
            e.printStackTrace();
            return;

        } 
  }
}