
import java.util.ArrayList;


public class MyDeque<T>{
    
    private ArrayList<Integer> MyDeque = new ArrayList<Integer>();
    
    public void push(int x){
        
        MyDeque.add(0,x);
        System.out.println(MyDeque);
            
    }
    
    public int pop(){
        
        if(MyDeque.isEmpty()){
            System.out.println("Empty");
        }
        
        int  deleted = MyDeque.remove(0);
        System.out.println(MyDeque);
        
        return(deleted);
    }
    
    public void inject(int x){
        
        MyDeque.add(x);
        System.out.println(MyDeque);
        
    }
    
    public int eject(){
        
        if(MyDeque.isEmpty()){
            System.out.println("Empty");
        }
        
        int deleted = MyDeque.remove(MyDeque.size() - 1);
        System.out.println(MyDeque);
        
        return(deleted);
    }
    
    
    
}
