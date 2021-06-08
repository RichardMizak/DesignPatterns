package mizak.patterns.Observer.test2;

public class Email extends ObserverClass{

    public Email(Subject subject) {
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
            System.out.println("Email: "+subject.getMsg());
    }
    public void remove(){
        subject.remove(this);
    }
}
