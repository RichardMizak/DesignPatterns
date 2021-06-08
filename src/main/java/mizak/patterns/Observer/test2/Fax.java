package mizak.patterns.Observer.test2;

public class Fax extends ObserverClass{
    public Fax(Subject subject) {
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        if (subject.getPriority()==1)
            System.out.println("Fax: "+subject.getMsg());
    }
    public void remove(){
        subject.remove(this);
    }
}
