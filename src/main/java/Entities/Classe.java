package Entities;

import Methodes.Constructeur;
import Methodes.MethodeConctrete;

import javax.print.attribute.Attribute;
import java.util.ArrayList;
import java.util.List;

public class Classe extends Entite {
    private String visibility;
    private boolean estStatic;
    private boolean estFinal;
    private List<Attribute> attributes=new ArrayList<>();
    private List<MethodeConctrete> methodeConctretes=new ArrayList<>();
    private Constructeur constructeur;

    public Classe(String nom, String visibility, boolean estStatic, boolean estFinal, List<Attribute> attributes, List<MethodeConctrete> methodeConctretes, Constructeur constructeur) {
        super(nom);
        this.visibility = visibility;
        this.estStatic = estStatic;
        this.estFinal = estFinal;
        this.attributes = attributes;
        this.methodeConctretes = methodeConctretes;
        this.constructeur = constructeur;
    }
}
