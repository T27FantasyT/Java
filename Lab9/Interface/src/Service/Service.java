package Service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    public ArrayList<Book> getAllBook() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(0, "asd0", "asd1", "vc3"));
        books.add(new Book(1, "asd0", "asd1", "vc3"));
        books.add(new Book(2, "asd1", "asd2", "vc4"));
        books.add(new Book(3, "asd2", "asd3", "vc5"));
        return books;
    }

    public void printBook(ArrayList<Book> books) {
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains("as")) {
                System.out.println(b);
            }
        }

    }
    public Book searchByID(ArrayList<Book> books, int id){
        for(Book b : books){
            if(b.getId()==id) return b;
        }
        return null;
    }

    public void updateBook(Book books){

    }

    public void delete(ArrayList<Book> books, Book book){
        books.remove(book);
    }


}
