import Service.Service;
import Service.Service;

import java.awt.print.Book;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> number = new ArrayList<>();
//        number.add(1);
//        number.add(4);
//        number.add(2);
//        number.add(9);
//        System.out.println(number);
//
//        number.add(2);
//        number.add(2,25);
//
//        number.remove(4);
//
//        number.set(1,2);
//        Collections.sort(number);
//        for( Integer i : number){
//            System.out.print(i + "\t");
////        }
//
//        ArrayList<String> name = new ArrayList<>();
//        name.add("a");
//        name.add("b");
//        name.add("b");
//        name.add("c");
//        name.add("d");
//        name.add("e");
//        for(String n : name){
//            System.out.print(n + "\t");
//        }
//
//        System.out.println();
//        System.out.println(" sau khi xoa b ");
//        name.remove("b");
//
//        for(String n : name){
//            System.out.print(n + "\t");
//        }

        Service service = new Service();
        ArrayList<Book> books = service.getAllBook();
//        service.printBook(books);
        Book updateBook = service.searchByID(books,2);
        service.delete(books,updateBook);


    }
}
