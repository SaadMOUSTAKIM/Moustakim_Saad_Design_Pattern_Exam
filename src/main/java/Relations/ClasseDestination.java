package Relations;

public class ClasseDestination {
    private Class destinationClasse;
    private Cardinalite[] cardinalites=new Cardinalite[2];

    public ClasseDestination(Class destinationClasse, Cardinalite[] cardinalites) {
        this.destinationClasse = destinationClasse;
        this.cardinalites = cardinalites;
    }
}
