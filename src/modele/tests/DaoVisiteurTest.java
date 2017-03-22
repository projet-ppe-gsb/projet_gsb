package modele.tests;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import modele.dao.DaoVisiteur;
import modele.dao.Jdbc;
import modele.metier.Visiteur;

/**
 *
 * @author Dimitri
 */
public class DaoVisiteurTest {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        java.sql.Connection cnx = null;

        test0_Connexion();
        System.out.println("Test0 effectué : connexion\n");
        test1_SelectUnique();
        System.out.println("Test1 effectué : sélection unique\n");
        if (cnx != null) {
            cnx.close();
        }

    }

    public static void test1_SelectUnique() throws SQLException {
        List<Visiteur> desVisiteur = DaoVisiteur.selectAll();
        System.out.println("Les clients lus : " + desVisiteur.toString());

    }

    public static void test0_Connexion() throws ClassNotFoundException, SQLException {
        Jdbc.creer("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:", "gsb@//localhost:1521/xe", "", "gsb", "gsb");
        Jdbc.getInstance().connecter();
        Connection cnx = Jdbc.getInstance().getConnexion();
    }
}