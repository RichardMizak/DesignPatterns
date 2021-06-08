package mizak.patterns.Observer.test2;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<ObserverClass> observers = new ArrayList<>();
    private String msg;
    private int priority;

    public int getPriority() {
        return priority;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg, int priority) {
        this.msg = msg;
        this.priority=priority;
        notifyAllObservers();
    }
    public void notifyAllObservers(){
        for (mizak.patterns.Observer.test2.ObserverClass observer : observers) {
            observer.update();
        }
    }
    public void attach(mizak.patterns.Observer.test2.ObserverClass observer){
        observers.add(observer);
    }
    public void remove(ObserverClass observer){
        observers.remove(observer);
    }
}
