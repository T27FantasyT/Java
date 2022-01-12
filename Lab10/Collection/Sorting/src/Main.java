import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("John",25,"American"));
        list.add(new Person("Marry",26,"VietNam"));
        list.add(new Person("Holly",40,"Thailand"));
        list.add(new Person("Dell",50,"Japan"));

//        System.out.println("Danh sách ban đầu: ");
//        show(list);
//
//        Collections.sort(list);
//        System.out.println("Danh sách sau khi sắp xếp");
//        show(list);

        //Sắp xếp theo tên.
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Danh sách sắp xếp theo tên: ");
        show(list);

        //Sắp xếp theo tuổi:

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(" danh sách sắp xếp theo tuổi: ");
        show(list);
    }

    public static void show(ArrayList<Person> list){
        for ( Person p : list){
            System.out.println(p);
        }
    }
}
