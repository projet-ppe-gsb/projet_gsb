package modele.dao;
 
import java.sql.*;
import java.io.FileInputStream; // Lecture du fichier de configuration
import java.util.Properties; // Utilitaire de lecture de fichier de configuration

public class Jdbc {
  /*  private String piloteJdbc = "";
    private String protocoleJdbc = "gsb@";
    private String serveurBd = "gsb@//172.15.11.102:1521/orcl";
    private String nomBd = "gsb";
    private String loginSgbd = "ora_2slamppe_eq8";
    private String mdpSgbd = "equipe08";   */

    private static Jdbc singleton = null;
    private Connection connexion = null;
    
    private String piloteJdbc;
    private String protocoleJdbc;
    private String serveurBd;
    private String nomBd;
    private String loginSgbd;
    private String mdpSgbd;
 
    private Jdbc() {
    }
 
    /**
     * @param pilote : classe du pilote Jdbc
     * @param protocole : préfixe l'URL du serveur ; dépend du type de SGBD
     * @param serveur : adresse du serveur + port (fini par un /, sauf pour
     * Oracle ; BD pour embarquée : chemin accès répertoire )
     * @param base : nom de la BD ou du DSN pour ODBC
     * @param login : utilisateur autorisé du SGBD (ou schéma Oracle)
     * @param mdp : son mot de passe
     */
    private Jdbc(String pilote, String protocole, String serveur, String base, String login, String mdp) {
        this.piloteJdbc = pilote;
        this.protocoleJdbc = protocole;
        this.serveurBd = serveur;
        this.nomBd = base;
        this.loginSgbd = login;
        this.mdpSgbd = mdp;
    }
 
    public static Jdbc creer() {

        if (singleton == null) {
            // On récupère les informations du fichier 
            Properties proprietes = new Properties();
            FileInputStream fichier = null;
            
            try {
                
                
                fichier = new FileInputStream("src/jdbc.properties");
                
                proprietes.load(fichier);
                
                Class.forName(proprietes.getProperty("DB_DRIVER_CLASS"));
                
                singleton = new Jdbc(proprietes.getProperty("DB_PILOTE"), proprietes.getProperty("DB_PROTOCOLE"), proprietes.getProperty("DB_SERVEUR"), proprietes.getProperty("DB_BASE"), proprietes.getProperty("DB_USER"), proprietes.getProperty("DB_PASSWORD"));
            } catch(Exception e) {
                System.out.println(e);
                singleton = null;
            }
        }
        return singleton;
    }
 
    public static Jdbc getInstance() {
        return singleton;
    }
 
    public void connecter() throws ClassNotFoundException, SQLException {
        Class.forName(this.getPiloteJdbc());
        setConnexion(DriverManager.getConnection(this.getProtocoleJdbc() + this.getServeurBd() + this.getNomBd(), this.getLoginSgbd(), this.getMdpSgbd()));
        getConnexion().setAutoCommit(true);
    }
 
    public void deconnecter() throws SQLException {
        getConnexion().close();
    }
 
    public static java.sql.Date utilDateToSqlDate(java.util.Date uneDate) {
        return (new java.sql.Date(uneDate.getTime()));
    }
 
    /**
     * ************************************* *
     * ACCESSEURS * **************************************
     */
    public String getPiloteJdbc() {
        return piloteJdbc;
    }
 
    public void setPiloteJdbc(String piloteJdbc) {
        this.piloteJdbc = piloteJdbc;
    }
 
    /**
     * @return the protocoleJdbc
     */
    public String getProtocoleJdbc() {
        return protocoleJdbc;
    }
 
    /**
     * @param protocoleJdbc the protocoleJdbc to set
     */
    public void setProtocoleJdbc(String protocoleJdbc) {
        this.protocoleJdbc = protocoleJdbc;
    }
 
    public String getServeurBd() {
        return serveurBd;
    }
 
    public void setServeurBd(String serveurBd) {
        this.serveurBd = serveurBd;
    }
 
    public String getNomBd() {
        return nomBd;
    }
 
    public void setNomBd(String nomBd) {
        this.nomBd = nomBd;
    }
 
    public String getLoginSgbd() {
        return loginSgbd;
    }
 
    public void setLoginSgbd(String loginSgbd) {
        this.loginSgbd = loginSgbd;
    }
 
    public String getMdpSgbd() {
        return mdpSgbd;
    }
 
    public void setMdpSgbd(String mdpSgbd) {
        this.mdpSgbd = mdpSgbd;
    }
 
    public Connection getConnexion() {
        return connexion;
    }
 
    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }
}