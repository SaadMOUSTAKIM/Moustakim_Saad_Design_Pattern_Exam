package Methodes;

import java.util.List;

public class Constructeur extends Methodes{
    private String visibility;

    public Constructeur(String nom, List<Type> types, String visibility) {
        super(nom, types);
        this.visibility = visibility;
    }

}
