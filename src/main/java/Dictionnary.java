import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Dictionnary {
     private String nom;
     private String t1, t2;
     Map<String, String> translations

    public Dictionnary(){}
    public Dictionnary(String nom){
        this.nom = nom;
        translations = new HashMap<String,String>();
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
