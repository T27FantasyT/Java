import java.util.ArrayList;

public class PersonModel<T> {

    ArrayList<T> t = new ArrayList<T>();
    public void add(T a){
      t.add(a);
    }
    public void display(){
        for(T t : t){
            System.out.println(t);
        }
    }

}
