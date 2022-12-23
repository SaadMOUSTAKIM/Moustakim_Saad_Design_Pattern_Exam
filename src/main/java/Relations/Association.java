package Relations;

public class Association implements Relation{
    private ClasseSource classeSource;
    private ClasseDestination classeDestination;

    public Association(ClasseSource classeSource, ClasseDestination classeDestination) {
        this.classeSource = classeSource;
        this.classeDestination = classeDestination;
    }
}
