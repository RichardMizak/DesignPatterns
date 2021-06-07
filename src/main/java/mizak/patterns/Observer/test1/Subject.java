package mizak.patterns.Observer.test1;


import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<ObserverClass> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(ObserverClass observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (ObserverClass observer : observers) {
            observer.update();
        }
    }
}
