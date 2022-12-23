package Methodes;

import java.util.ArrayList;
import java.util.List;

public abstract class Methodes {
    public String nom;
    public List<Type> types=new ArrayList<>();

    public Methodes(String nom, List<Type> types) {
        this.nom = nom;
        this.types = types;
    }
}
