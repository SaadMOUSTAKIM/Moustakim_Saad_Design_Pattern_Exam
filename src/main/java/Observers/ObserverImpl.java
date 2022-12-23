package Observers;

public class ObserverImpl implements Observer {
    @Override
    public void update(Observable observable) {
        System.out.println("Attribut a ete change");
    }
}
