package mizak.patterns.StatePattern;

public class OrangeState implements State{
    public static final String ANSI_YELLOW = "\u001B[33m";
    @Override
    public void doAction(Context context) {
        System.out.println(ANSI_YELLOW+"█");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
