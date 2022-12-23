package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class Annotation extends Entite{

    List<Properties> properties=new ArrayList<>();

    public Annotation(String nom, List<Properties> properties) {
        super(nom);
        this.properties = properties;
    }

}
