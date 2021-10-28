import java.util.Objects;

public class Dictionnary {
     private String nom;
     private String t1, t2;

    public Dictionnary(){}
    public Dictionnary(String nom){
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

    public String getTranslation(String t) {
        return "against";
    }

    public Boolean isEmpty(){
        //return (Objects.equals(this.nom, ""));
        return true;
    }

    public void addTranslation(String trans1, String trans2) {
        trans1 = "contre";
        trans2 = "against";
    }
}
