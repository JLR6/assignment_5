import java.util.ArrayList;

public class MainProgram{
    public static void main(String[] args) {
        CarLot cl = new CarLot();
        Car c1 = new Car(1, 1, 0.1f);
        Car c2 = new Car(2, 2, 4.4f);
        Car c3 = new Car(2, 3, 4.4f);
        Car c4 = new Car(2, 4, 4.4f);
        Car c5 = new Car(3, 5, 4.4f);
        cl.addCar(c1);
        cl.addCar(c2);
        cl.addCar(c3);
        cl.addCar(c4);
        cl.addCar(c5);
        CarRequests cr = new CarRequests();
        cr.addRequest(1);
        cr.addRequest(2);
        cr.addRequest(3);
        cr.addRequest(2);
        cr.addRequest(2);
        ArrayList<Car> c = new ArrayList<>();
        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);
        c.add(c5);
        // cl.printer();
        System.out.println(cl.processRequests(cr));
    }
}