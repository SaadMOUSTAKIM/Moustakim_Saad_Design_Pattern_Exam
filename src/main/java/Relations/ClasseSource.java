package Relations;

public class ClasseSource {
    private Class sourceClasse;
    private Cardinalite[] cardinalite=new Cardinalite[2];

    public ClasseSource(Class sourceClasse, Cardinalite[] cardinalite) {
        this.sourceClasse = sourceClasse;
        this.cardinalite = cardinalite;
    }
}
