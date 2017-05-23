/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.tests;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import modele.dao.DaoPraticien;
import modele.dao.Jdbc;
import modele.metier.Praticien;

/**
 *
 * @author finde
 */
public class DaoPraticienTest {
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        java.sql.Connection cnx = null;

        System.out.println("Test 0 - connexion...");
        test0_Connexion();
        System.out.println("Test0 : connexion effectuée\n");
        
        System.out.println("Test 1 - selectAll praticiens");
        test1_SelectAll();
        System.out.println("Test 2 : selectAll effectué\n");
        System.out.println("Test 2 - selectOnByCode (20) praticien");
        test1_SelectUnique();
        System.out.println("Test 2 : selectOnByCode effectué\n");
        if (cnx != null) {
            cnx.close();
        }

    }

    public static void test1_SelectAll() throws SQLException {
        List<Praticien> desPraticiens = DaoPraticien.selectAll();
        System.out.println("Les clients lus : " + desPraticiens.toString());

    }

    public static void test1_SelectUnique() throws SQLException {
        
        int code = 20;   
        Praticien unPraticien = null;
        try {
            unPraticien = DaoPraticien.selectOneByCode(code);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        }
        
        System.out.println("Le praticien lu : " + unPraticien.toString());

    }
        
    public static void test0_Connexion() throws ClassNotFoundException, SQLException {
        Jdbc.creer();
        Jdbc.getInstance().connecter();
        Connection cnx = Jdbc.getInstance().getConnexion();
    }
}
