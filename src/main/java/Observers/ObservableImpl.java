package Observers;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    List<Observer> observers=new ArrayList<>();
    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer o:observers){
            o.update(this);
        }
    }
}
