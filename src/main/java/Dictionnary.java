import java.util.Objects;

public class Dictionnary {
     private String nom;

    public Dictionnary(){}
    public Dictionnary(String nom){
        this.nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

    public String getTranslation(String contre) {

    }

    public Boolean isEmpty(){
        //return (Objects.equals(this.nom, ""));
        return true;
    }


    public void addTranslation(String contre, String against) {
        
    }
}
