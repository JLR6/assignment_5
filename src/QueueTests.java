import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class QueueTests {
    @Test
    public void Queue(){
        Queue<Car> q = new Queue<>();
        assertEquals(true, q.isEmpty());
    }

    @Test
    public void enqueue(){
        Car c = new Car(0, 0 ,0.0f);
        Queue<Car> q = new Queue<>();
        q.enqueue(c);
        assertEquals(c, q.dequeue());
    }

    @Test
    public void dequeue(){
        Car c = new Car(0, 0 ,0.0f);
        Queue<Car> q = new Queue<>();
        q.enqueue(c);
        q.dequeue();
        assertEquals(q.isEmpty(), true);
    }

    @Test
    public void dequeue1(){
        Car c = new Car(0, 0 ,0.0f);
        Car c1 = new Car(1, 0, 0.0f);
        Queue<Car> q = new Queue<>();
        q.enqueue(c);
        q.enqueue(c1);
        q.dequeue();
        assertEquals(q.isEmpty(), false);
    }

    @Test
    public void peek(){
        Car c = new Car(0, 0 ,0.0f);
        Car c1 = new Car(1, 0, 0.0f);
        Queue<Car> q = new Queue<>();
        q.enqueue(c);
        q.enqueue(c1);
        assertEquals(q.peek(), c);
    }

    @Test
    public void isEmpty(){
        Car c = new Car(0, 0 ,0.0f);
        Car c1 = new Car(1, 0, 0.0f);
        Queue<Car> q = new Queue<>();
        q.enqueue(c);
        q.enqueue(c1);
        assertEquals(q.isEmpty(), false);
    }

    @Test
    public void isEmpty1(){
        Car c = new Car(0, 0 ,0.0f);
        Car c1 = new Car(1, 0, 0.0f);
        Queue<Car> q = new Queue<>();
        q.enqueue(c);
        q.enqueue(c1);
        q.dequeue();
        q.dequeue();
        assertEquals(q.isEmpty(), true);
    }
}
