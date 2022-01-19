import java.util.ArrayList;

public class Main<T> {
    public static void main(String[] args) {
//        MyGeneric<Double> myGeneric = new MyGeneric<>(1.00d);
//        System.out.println(myGeneric.getValue());
//
//        MyGeneric<String> myGeneric1 = new MyGeneric<>("ASda");
//        System.out.println(myGeneric1.getValue());
//
//        String[] arrString = new String[]{"Java","HTML/CSS","C++"};
//        Integer[] arrInt = new Integer[]{1,2,3,4,5};
//        Double[] arrdouble = new Double[]{1.8,2.8,3.8,4.5,5.4};
//        showArray(arrInt);
//        showArray(arrString);
//        showArray(arrdouble);
//
//
//    }
//
//    public static <T> void showArray(T arr[]){
//        for(T t : arr){
//            System.out.print(t);
//
//        }
//        System.out.println();
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,"Hoa",8));
        students.add(new Student(2,"Tùng",7));
        students.add(new Student(3,"Cường",4));

        ArrayList<Animal> animals =new ArrayList<>();
        animals.add(("Dog",4,Black));

        ArrayList<Teacher> teacher =new ArrayList<>();
        teacher.add(new Teacher(4,"a",9000000));

        show(students);
        show(teacher);
    }
    public static void show(ArrayList<? extends Person> list){
        for(Object o : list){
            System.out.println(o);
        }
    }




}
