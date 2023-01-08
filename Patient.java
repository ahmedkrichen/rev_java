import java.sql.Date;

public class Patient {
    private int cin;
    private String nom,prenom;
    private Date date;

    
    public Patient(int cin, String nom, String prenom, Date date) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
    }
    
    public int getCin() {
        return cin;
    }
    public void setCin(int cin) {
        this.cin = cin;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    
}
