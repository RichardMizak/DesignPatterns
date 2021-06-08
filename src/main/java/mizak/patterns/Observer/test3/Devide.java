package mizak.patterns.Observer.test3;

public class Devide extends Observer{
    public Devide(Calculator calculator) {
        this.subject=calculator;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        if (subject.getNum()!=0)
        System.out.println("Devide: "+(subject.getNum()/(subject.getNum()/2)));
    }
}
