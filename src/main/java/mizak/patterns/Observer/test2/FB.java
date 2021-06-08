package mizak.patterns.Observer.test2;

public class FB extends ObserverClass{
    public FB(Subject subject) {
        this.subject=subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        if (subject.getPriority()<=2)
            System.out.println("FB: "+subject.getMsg());
    }
    public void remove(){
        subject.remove(this);

    }
}
