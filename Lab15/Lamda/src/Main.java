import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(5);
//        numbers.add(4);
//
//        //for -each
//        for(Integer i : numbers){
//            System.out.println(i);
//        }
//
//        //lambda
//        numbers.forEach(number -> System.out.println(number));
//
////        numbers.sort(new Comparator<Integer>() {
////            @Override
////            public int compare(Integer o1, Integer o2) {
////                return o2-o1;
////            }
////        });
////        numbers.forEach(number -> System.out.println(number));
//
//        numbers.sort((o1, o2) -> o1-o2);
//        numbers.forEach(number-> System.out.println(number));

        List<String> names = Arrays.asList("Java","HTML","CSS");
        names.stream().forEach(name-> System.out.print(name + "\t"));
        System.out.println();
        names.stream().filter(name->name.contains("J")).forEach(name-> System.out.println(name));

        //thong thuong
        int count1 = 0;
        for(String s : names){
            if(s.contains("J")){
                count1++;
            }
        }
        System.out.println(count1);

        //ap dung stream
        long count = names.stream().filter(name->name.contains("J")).count();
        System.out.print("\n Số phần tử có chữ J: "+ count);

        //sap xep
        names.stream().sorted().forEach(name -> System.out.println(name));
        System.out.println();
        //sap xep nguoc lai
        names.stream().sorted((name1,name2)->name2.compareTo(name1))
                .forEach(name-> System.out.print(name));
        System.out.println();
        //gioi han so phan tu
        names.stream().sorted().limit(2).forEach(name-> System.out.print(name));
        System.out.println();

        //bo qua phan tu

        names.stream().sorted().limit(2).skip(1).forEach(name-> System.out.print(name));
        System.out.println();
        names.stream().map(name->"Hoc" + name).forEach(name-> System.out.print(name));
    }
}
