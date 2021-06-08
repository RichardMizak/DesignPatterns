package mizak.patterns.Observer.test3;

public class Minus extends Observer{
    public Minus(Calculator calculator) {
        this.subject=calculator;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Minus: "+(subject.getNum()-(subject.getNum())/2));
    }
}
