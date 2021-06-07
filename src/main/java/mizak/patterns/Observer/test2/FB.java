package mizak.patterns.Observer.test2;

public class FB extends ObserverClass{
    public FB(Subject subject) {
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("FB: "+subject.getMsg());
    }
}
