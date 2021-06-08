package mizak.patterns.Observer.test3;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Observer> observers = new ArrayList<>();
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
    public void attach(Observer observer){
        observers.add(observer);
    }
}
