import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CarTests {
    @Test
    public void cons(){
        Car c = new Car(0, 0, 0);
        assertEquals(c.getId(), 0);
    }
    @Test
    public void id(){
        Car c = new Car(4, 0, 0);
        assertEquals(c.getId(), 4);;
    }
    @Test
    public void idSet(){
        Car c = new Car(4, 0, 0);
        c.setId(2);
        assertEquals(c.getId(), 2);
    }
    @Test
    public void power(){
        Car c = new Car(4, 5, 0);
        assertEquals(c.getPowerSource(), 5);
    }
    @Test
    public void powerSet(){
        Car c = new Car(4, 5, 0);
        c.setPowerSource(6);
        assertEquals(c.getPowerSource(), 6);
    }
    @Test
    public void ppd(){
        Car c = new Car(4, 5, 9);
        assertEquals(c.getPricePerDay(), 9f, 0.01);
    }
    @Test
    public void ppdSet(){
        Car c = new Car(4, 5, 0);
        c.setPricePerDay(6.34);
        assertEquals(c.getPricePerDay(), 6.34f, 0.01);
    }
}
