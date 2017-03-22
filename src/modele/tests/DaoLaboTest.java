/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele.tests;

import java.sql.SQLException;
import java.util.List;
import modele.dao.DaoLabo;
import modele.dao.DaoSecteur;
import modele.dao.DaoVisiteur;
import modele.metier.Labo;
import modele.metier.Secteur;
import static modele.tests.DaoVisiteurTest.test0_Connexion;
import static modele.tests.DaoVisiteurTest.test1_SelectUnique; 

/**
 *
 * @author btssio
 */
public class DaoLaboTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        java.sql.Connection cnx = null;

        test0_Connexion();
        System.out.println("Test0 effectué : connexion\n");
        test1_selectOneByCode("BC");
        System.out.println("Test1 effectué : sélection unique\n");
        if (cnx != null) {
            cnx.close();
        }
        
    

    }
     /**
     *
     * @throws SQLException
     */
    public static void test1_selectOneByCode(String code) throws SQLException {
        Labo desLabo = DaoLabo.selectOneByCode(code);
        System.out.println("Les labo lus : " + desLabo.toString());

    }       
    
}
