package question3;

import java.text.Normalizer;

public class AuditeurCNAM{
    
    private String nom;
    private String prenom;
    private String matricule;
    
    public void setNom(String _nom){
        this.nom = _nom;
    }
    
    public void setPrenom(String _prenom){
        this.prenom = _prenom;
    }
        
    public void setMatricule(String _matricule){
        this.matricule = _matricule;
    }
    
    public String getNom() {
        return this.prenom;
    }
        
    public String getPrenom() {
        return this.prenom;
    }
    
    public String getMatricule() {
        return this.matricule;
    }

    public AuditeurCNAM() {
        this.nom = "testnom";
        this.prenom = "testprenom";
        this.matricule = "testmatricule";
    }
    
    public AuditeurCNAM(String _nom, String _prenom, String _matricule) {
        this.nom = _nom;
        this.prenom = _prenom;
        this.matricule = _matricule;
    }
    
    public static String stripAccents(String s) {
        s = Normalizer.normalize(s, Normalizer.Form.NFD);
        s = s.replaceAll("[\\p{InCombiningDiacriticalMarks}]", "");
        return s;
    }

    public String login() {
        String n;
        String p;
        n=this.nom.substring(0,Math.min(this.nom.length(),6));
        p=this.prenom.substring(0,1);
        n=n.toLowerCase();
        p=p.toLowerCase();
        n=stripAccents(n);
        p=stripAccents(p);
        return n+"_"+p;
    }

    @Override
    public String toString() {
        return getNom() + " " + getPrenom() + " login : " + login();
    }
}
