import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Dictionnary {
     private String nom;
     private String t1, t2;

     Map<String, String> translations;

    public Dictionnary(){}
    public Dictionnary(String nom){
        this.nom = nom;
        translations = new HashMap<String,String>();
    }

    public String getNom() {
        return this.nom;
    }

    public String getTranslation(String t) {
        if(Objects.equals(this.t1, t)){
            return this.t2;
        }
        else if(Objects.equals(this.t2, t)){
            return this.t1;
        }
        else {
            return "error translation";
        }
    }



    public Boolean isEmpty(){
        //return (Objects.equals(this.nom, ""));
        //return true;
         if(translations.size() == 0 && Objects.equals(this.nom, "")) {
             return true;
         }
         return false;
    }

    public void addTranslation(String trans1, String trans2) {
        t1 = trans1 ;
        t2 = trans2;
    }
}
