import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class CarLotTests {
    @Test
    public void cons(){
        CarLot cl = new CarLot();
        CarRequests cr = new CarRequests();
        ArrayList<Car> c = new ArrayList<>();
        assertEquals(cl.processRequests(cr), c);
    }
    @Test
    public void adder(){
        CarLot cl = new CarLot();
        Car cc = new Car(1, 2,3);
        CarRequests cr = new CarRequests();
        cr.addRequests(1);
        ArrayList<Car> c = new ArrayList<>();
        c.add(cc);
        cl.addCar(cc);
        assertEquals(cl.processRequests(cr), c);
    }

    @Test
    public void processor(){
        CarLot cl = new CarLot();
        Car c1 = new Car(1, 0, 0);
        Car c2 = new Car(2, 2, 4);
        cl.addCar(c1);
        cl.addCar(c2);
        CarRequests cr = new CarRequests();
        cr.addRequests(1);
        cr.addRequests(2);
        ArrayList<Car> c = new ArrayList<>();
        c.add(c1);
        c.add(c2);
        assertEquals(cl.processRequests(cr), c);
    }
}
