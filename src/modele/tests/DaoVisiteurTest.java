package modele.tests;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import modele.dao.DaoVisiteur;
import modele.dao.Jdbc;
import modele.metier.Visiteur;

public class DaoVisiteurTest {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        java.sql.Connection cnx = null;

        System.out.println("Test 0 - connexion...");
        test0_Connexion();
        System.out.println("Test0 : connexion effectuée\n");
        System.out.println("Test 1 - sélection visiteurs");
        test1_SelectUnique();
        System.out.println("Test1 : sélection visiteurs effectuée\n");
        if (cnx != null) {
            cnx.close();
        }

    }

    public static void test1_SelectUnique() throws SQLException {
        List<Visiteur> desVisiteur = DaoVisiteur.selectAll();
        System.out.println("Les clients lus : " + desVisiteur.toString());

    }

    public static void test0_Connexion() throws ClassNotFoundException, SQLException {
        Jdbc.creer();
        Jdbc.getInstance().connecter();
        Connection cnx = Jdbc.getInstance().getConnexion();
    }
}