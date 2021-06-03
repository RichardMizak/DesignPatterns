package mizak.patterns.StatePattern;

public class RedState implements State{
    public static final String ANSI_RED = "\u001B[31m";
    @Override
    public void doAction(Context context) {
            System.out.println(ANSI_RED+"█");
            context.setState(this);
        }

        public String toString(){
            return "Start State";
        }
    }

