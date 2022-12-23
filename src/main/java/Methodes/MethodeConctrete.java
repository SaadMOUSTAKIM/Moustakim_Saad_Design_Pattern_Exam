package Methodes;

import java.util.List;

public class MethodeConctrete extends Methodes{
    private String type;
    private String visibility;
    private boolean estFinal;
    private boolean estStatic;
    private boolean estAbstrait;

    public MethodeConctrete(String nom, List<Type> types, String type, String visibility) {
        super(nom, types);
        this.type = type;
        this.visibility = visibility;
    }

}
