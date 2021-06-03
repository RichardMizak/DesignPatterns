package mizak.patterns.StatePattern;

public class Main {
    public static void main(String[] args) {
        Context context=new Context();
        Context context1=new Context();

        RedState red=new RedState();
        OrangeState orange=new OrangeState();
        GreenState green=new GreenState();

        red.doAction(context);
        orange.doAction(context);
        green.doAction(context);


        green.doAction(context1);
        orange.doAction(context1);
        red.doAction(context1);

    }
}
