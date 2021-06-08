package mizak.patterns.Observer.test3;

public class Adding extends Observer{
    public Adding(Calculator calculator) {
        this.subject=calculator;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Adding: "+(subject.getNum()+subject.getNum()));
    }
}
