package mizak.patterns.Observer.test2;

public class Fax extends ObserverClass{
    public Fax(Subject subject) {
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Fax: "+subject.getMsg());
    }
}
