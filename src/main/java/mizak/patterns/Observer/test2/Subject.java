package mizak.patterns.Observer.test2;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<ObserverClass> observers = new ArrayList<>();
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
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
}
