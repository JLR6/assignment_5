import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class CarLotTests {
    @Test
    public void CarLot(){
        CarLot cl = new CarLot();
        CarRequests cr = new CarRequests();
        ArrayList<Car> c = new ArrayList<>();
        assertEquals(cl.processRequests(cr), c);
    }
    @Test
    public void addRequests(){
        CarLot cl = new CarLot();
        Car cc = new Car(1, 2,3.2f);
        CarRequests cr = new CarRequests();
        cr.addRequest(1);
        ArrayList<Car> c = new ArrayList<>();
        c.add(cc);
        cl.addCar(cc);
        assertEquals(cl.processRequests(cr), c);
    }

    @Test
    public void processRequests(){
        CarLot cl = new CarLot();
        Car c1 = new Car(1, 0, 0.1f);
        Car c2 = new Car(2, 2, 4.4f);
        cl.addCar(c1);
        cl.addCar(c2);
        CarRequests cr = new CarRequests();
        cr.addRequest(1);
        cr.addRequest(2);
        ArrayList<Car> c = new ArrayList<>();
        c.add(c1);
        c.add(c2);
        assertEquals(cl.processRequests(cr), c);
    }

    @Test
    public void processRequests1(){
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
        c.add(c5);
        c.add(c3);
        c.add(c4);
        assertEquals(cl.processRequests(cr), c);
    }
}
