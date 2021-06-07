package mizak.patterns.Observer.test2;

public class Main {
    public static void main(String[] args) {
        Subject subject=new Subject();
        new Email(subject);
        new SMS(subject);
        new FB(subject);
        new Fax(subject);

        subject.setMsg("Kanada won Championship");
    }
}
