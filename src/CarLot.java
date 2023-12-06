import java.util.ArrayList;

public class CarLot {
    private Queue<Car> gasolineCar;
    private Queue<Car> hybridCar;
    private Queue<Car> electricCar;
    public CarLot(){
        gasolineCar = new Queue<>();
        hybridCar = new Queue<>();
        electricCar = new Queue<>();
    }
    public boolean addCar(Car c){
        if(c.getPowerSource()==1){
            gasolineCar.enqueue(c);
            return true;
        }
        else if (c.getPowerSource()==2){
            hybridCar.enqueue(c);
            return true;
        }
        else if (c.getPowerSource()==3){
            electricCar.enqueue(c);
            return true;
        }
        else{
            return false;
        }
    }
    public ArrayList<Car> processRequests(CarRequests cr){
        ArrayList<Car> c = new ArrayList<Car>();
        Car reg = new Car(0, 0, 0.0f);
        while (cr.hasPendingRequests()){
            int g =cr.getRequest();
            if (g==1){
                if(gasolineCar.isEmpty()==false){
                    c.add(gasolineCar.dequeue());
                }
                else{
                    c.add(reg);
                }
            }
            else if (g==2){
                if(hybridCar.isEmpty()==false){
                    c.add(hybridCar.dequeue());
                }
                else{
                    c.add(reg);
                }
            }
            else if (g==3){
                if(electricCar.isEmpty()==false){
                    c.add(electricCar.dequeue());
                }
                else{
                    c.add(reg);
                }
                
            }
            else{
                c.add(reg);
            }
            
        }
        return c;
    }
    public void printer(){
        System.out.println("Gasoline Car:\n " + gasolineCar.toString() + "\n" + "Hybrid Car:\n " + hybridCar.toString() + "\n" + "Electric Car:\n "+ electricCar.toString());
    }
}