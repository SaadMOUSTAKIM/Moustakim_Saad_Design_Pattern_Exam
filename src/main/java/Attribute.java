import Observers.ObservableImpl;

public class Attribute extends ObservableImpl {

    private String nom;
    private String visibility;
    private String type;
    private boolean estFinal;
    private boolean estStatic;

    public Attribute(String nom, String visibility, String type, boolean estFinal, boolean estStatic) {
        this.nom = nom;
        this.visibility = visibility;
        this.type = type;
        this.estFinal = estFinal;
        this.estStatic = estStatic;
    }
}
