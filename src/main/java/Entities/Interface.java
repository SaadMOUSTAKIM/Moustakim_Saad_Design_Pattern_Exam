package Entities;

import Methodes.Methodes;

import java.util.ArrayList;
import java.util.List;

public class Interface extends Entite{
    List<Methodes> methodes=new ArrayList<>();

    public Interface(String nom, List<Methodes> methodes) {
        super(nom);
        this.methodes = methodes;
    }

}
