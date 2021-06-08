package mizak.patterns.Observer.test3;

public class Multiply extends Observer{
    public Multiply(Calculator calculator) {
        this.subject=calculator;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Multiply: "+(subject.getNum()*subject.getNum()));
    }
}
