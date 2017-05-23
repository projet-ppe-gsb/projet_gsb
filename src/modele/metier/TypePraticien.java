package modele.metier;

/**
 *
 * @author finde
 */
public class TypePraticien {

    private String code;
    private String libelle;
    private String lieu;
    
    public TypePraticien(String codeType, String libelleType, String lieuType) {
        
        this.code = codeType;
        this.libelle = libelleType;
        this.lieu = lieuType;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }
    
}
