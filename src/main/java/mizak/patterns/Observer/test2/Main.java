package mizak.patterns.Observer.test2;

public class Main {
    public static void main(String[] args) {
        Subject subject=new Subject();
        Email email=new Email(subject);
        SMS sms= new SMS(subject);
        FB fb= new FB(subject);
        Fax fax=new Fax(subject);

        subject.setMsg("Canada won Championship",2);



    }
}
