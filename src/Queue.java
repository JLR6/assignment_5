import java.util.ArrayList;
public class Queue<T>{
    private ArrayList<T> list;
    
    public Queue(){
        list = new ArrayList<>();
    }
    public void enqueue(T e){
        list.add(e);
      
    }
    public T dequeue(){
        T reg = null;
        if(this.isEmpty()){
            return reg;
        }
        else{
            return list.remove(0);
        }
    }
    public T peek(){
        T reg = null;
        if(this.isEmpty()){
            return reg;
        }
        else{
            T ret = list.get(0);
            return ret;
        }
    }
    public boolean isEmpty(){
        if(list.isEmpty()){
            return true;
        }
        return false;
    }
    public String toString(){
        String ret = "";
        for (int i =0; i<list.size(); i++){
            ret += list.get(i) + "\n";
        }
        return ret;
    }
}  