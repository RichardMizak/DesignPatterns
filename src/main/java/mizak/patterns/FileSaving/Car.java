package mizak.patterns.FileSaving;

import java.io.Serializable;

public class Car implements Serializable {
    private String car;
    private int price;
    private boolean engine;

    public Car(String car, int price, boolean engine) {
        this.car = car;
        this.price = price;
        this.engine = engine;
    }
    @Override
    public String toString() {
        return "Car: "+car+" Price: "+price+"€"+" Petrol engine: "+engine;

    }

}
