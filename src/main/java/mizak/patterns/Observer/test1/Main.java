package mizak.patterns.Observer.test1;

public class Main {
    public static void main(String[] args) {
    Subject subject=new Subject();
    new BinaryObserver(subject);
    new OctalObserver(subject);
    new HexaObserver(subject);

    subject.setState(28);
    subject.setState(50);
    subject.setState(156);
    }
}
