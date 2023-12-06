public class Car{
    private int id;
    private int powerSource;
    private float pricePerDay;
    public Car(int i, int p, float ppd){
        this.id =i;
        this.powerSource = p;
        this.pricePerDay = ppd;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
            this.id=id;
    }

    public int getPowerSource() {
        return this.powerSource;
    }

    public void setPowerSource(int powerSource) {
        if(powerSource >0 && powerSource<4){
            this.powerSource = powerSource;
        }
        else{
            this.powerSource =0;
        }
       
    }

    public float getPricePerDay() {
        return this.pricePerDay;
    }

    public void setPricePerDay(float pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
    public String toString(){
        return "Id: " + this.id + " power source: " + this.powerSource + " price per day: " + this.pricePerDay; 
    }

}