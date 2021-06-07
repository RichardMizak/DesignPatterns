package mizak.patterns.Observer.test2;

public class SMS extends ObserverClass{
    public SMS(Subject subject) {
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("SMS: "+subject.getMsg());
    }
}
