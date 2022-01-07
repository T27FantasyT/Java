package controller;

import Service.Service;

import java.util.Scanner;

public class Controller {

    static Scanner sc = new Scanner(System.in);
    static Service service = new Service();
    public static void menu(){
        System.out.println("1 - Xem danh sach");
        System.out.println("2 - Them 1 quyen sach vao menu");
        System.out.println("3- Tim sach theo ten");
        System.out.println("4- Tim sach theo id");
        System.out.println("5 - thoat chuong trinh");
    }

    public static void mainMenu(){
        boolean isContinue = true;
        while(isContinue){
            menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Danh sach: ");
                    service.printBook(books);
                break;
                case 2:
                    System.out.println("tim sach theo ten");
            }
        }
    }
}
