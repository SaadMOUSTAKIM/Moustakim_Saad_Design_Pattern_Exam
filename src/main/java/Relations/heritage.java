package Relations;

import Entities.Classe;

public class heritage implements Relation{

    private Classe classeMere;
    private Classe classeFils;

    public heritage(Classe classeMere, Classe classeFils) {
        this.classeMere = classeMere;
        this.classeFils = classeFils;
    }
}
