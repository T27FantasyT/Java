import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        System.out.println(list);
//
//        Iterator<Integer> itr = list.listIterator();
//        //hasnext : kiểm tra xem đằng sau có phần tử nào không.
//        while(itr.hasNext()){
//            // next: lấy ra phần tử hiện tại và chuyển con trỏ tới phần từ tiếp theo
//            System.out.println(itr.next());

//            Queue<Integer> listInt = new LinkedList<>();
//            listInt.add(5);
//            listInt.offer(6);
//            listInt.add(8);
//            listInt.add(2);
//            listInt.add(3);
//
//        System.out.println(listInt);
//        System.out.println("Phan tu dau tien" + listInt.remove());
//        System.out.println(listInt);
//
//        Queue<Integer> listInt = new PriorityQueue<>();
//        listInt.add(5);
//        listInt.offer(6);
//        listInt.add(8);
//        listInt.add(2);
//        listInt.add(3);
//        listInt.add(0);
//        System.out.println(listInt);
//        System.out.println(listInt.remove());
//        System.out.println(listInt.remove());
//        System.out.println(listInt.remove());
//        System.out.println(listInt.remove());
//        System.out.println(listInt.remove());

//        Set<Integer> listInt = new HashSet<>();
//
//        listInt.add(5);
//        listInt.add(6);
//        listInt.add(8);
//        listInt.add(2);
//        listInt.add(3);
//        listInt.add(0);
//        System.out.println(listInt);

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Tien");
        map.put(5,"Linh");
        map.put(3,"Hoang");
        map.put(8,"A");
        map.put(2,"B");

        System.out.println(map);

        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }

    }
}
