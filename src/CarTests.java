import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CarTests {
    @Test
    public void Car(){
        Car c = new Car(0, 1, 0.0f);
        assertEquals(c.getId(), 0);
    }
    @Test
    public void getId(){
        Car c = new Car(4, 1, 0.0f);
        assertEquals(c.getId(), 4);;
    }
    @Test
    public void setId(){
        Car c = new Car(4, 2, 0.0f);
        c.setId(2);
        assertEquals(c.getId(), 2);
    }
    @Test
    public void getPowerSource(){
        Car c = new Car(4, 3, 0.11f);
        assertEquals(c.getPowerSource(), 3);
    }
    @Test
    public void setPowerSource(){
        Car c = new Car(4, 2, 0.23f);
        c.setPowerSource(6);
        assertEquals(c.getPowerSource(), 0);
    }
    @Test
    public void getPricePerDay(){
        Car c = new Car(4, 1, 9.1f);
        assertEquals(c.getPricePerDay(), 9.1f, 0.01);
    }
    @Test
    public void setPricePerDay(){
        Car c = new Car(4, 2, 0.12f);
        c.setPricePerDay(6.34f);
        assertEquals(c.getPricePerDay(), 6.34f, 0.01);
    }
}
