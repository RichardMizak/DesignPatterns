package mizak.patterns.FileSaving;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Car car1=new Car("Buggati Type 41",20000000,true);
        Car car2=new Car("Volkswagen Golf Mk.1",1500,false);
        Car car3=new Car("Tesla Roadster",150000,false);
        Car car4=new Car("Citöen SM",40000,true);

        File file=new File("CarList.car");

        try (ObjectOutputStream oss=new ObjectOutputStream(new FileOutputStream(file))){
            oss.writeObject(car1);
            oss.writeObject(car2);
            oss.writeObject(car3);
            oss.writeObject(car4);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
    }
}
