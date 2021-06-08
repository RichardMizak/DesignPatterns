package mizak.patterns.Observer.test3;

public class Main {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        new Adding(calculator);
        new Minus(calculator);
        new Multiply(calculator);
        new Devide(calculator);

        calculator.setNum(150);
    }
}
