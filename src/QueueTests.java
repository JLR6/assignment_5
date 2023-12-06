import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class QueueTests {
    @Test
    public void cons(){
        Queue<Car> q = new Queue<>();
        assertEquals(true, q.isEmpty());
    }

    @Test
    public void adder(){
        Car c = new Car(0, 0 ,0);
        Queue<Car> q = new Queue<>();
        q.enqueue(c);
        assertEquals(c, q.dequeue());
    }

    @Test
    public void dequ(){
        Car c = new Car(0, 0 ,0);
        Queue<Car> q = new Queue<>();
        q.enqueue(c);
        q.dequeue();
        assertEquals(q.isEmpty(), true);
    }

    @Test
    public void dequ1(){
        Car c = new Car(0, 0 ,0);
        Car c1 = new Car(1, 0, 0);
        Queue<Car> q = new Queue<>();
        q.enqueue(c);
        q.enqueue(c1);
        q.dequeue();
        assertEquals(q.isEmpty(), false);
    }

    @Test
    public void peekTest(){
        Car c = new Car(0, 0 ,0);
        Car c1 = new Car(1, 0, 0);
        Queue<Car> q = new Queue<>();
        q.enqueue(c);
        q.enqueue(c1);
        assertEquals(q.peek(), c);
    }

    @Test
    public void empty(){
        Car c = new Car(0, 0 ,0);
        Car c1 = new Car(1, 0, 0);
        Queue<Car> q = new Queue<>();
        q.enqueue(c);
        q.enqueue(c1);
        assertEquals(q.isEmpty(), false);
    }

    @Test
    public void empty1(){
        Car c = new Car(0, 0 ,0);
        Car c1 = new Car(1, 0, 0);
        Queue<Car> q = new Queue<>();
        q.enqueue(c);
        q.enqueue(c1);
        q.dequeue();
        q.dequeue();
        assertEquals(q.isEmpty(), true);
    }
}
