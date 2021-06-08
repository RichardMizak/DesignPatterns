package mizak.patterns.Observer.test2;

import mizak.patterns.Observer.test3.Observer;

public abstract class ObserverClass extends Observer {
    protected Subject subject;
    protected int priority;
    public abstract void update();
}
