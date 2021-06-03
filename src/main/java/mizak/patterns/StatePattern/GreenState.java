package mizak.patterns.StatePattern;

public class GreenState implements State {
    public static final String ANSI_GREEN = "\u001B[32m";
    @Override
    public void doAction(Context context) {
        System.out.println(ANSI_GREEN+"█");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
