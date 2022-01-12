package controller;

import model.Movie;
import service.Service;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Service service = new Service();
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Movie> movies = service.getAllMovie();

    public void menu(){
        System.out.println("-----------------------");
        System.out.println("1 - Xem danh sách phim");
        System.out.println("2 - Sắp xếp");
        System.out.println("3 - Tìm kiếm");
        System.out.println("4 - Lọc ra 3 phim có lượt xem cao nhất");
        System.out.println("0 - Thoát chương trình");
    }

    public void softMenu(){
        boolean isTrue = true;
        while (isTrue){
            System.out.println("-----------------------");
            System.out.println("1 - Sắp xếp theo tên: ");
            System.out.println("2 - Sắp xếp theo năm sản xuất: ");
            System.out.println("3 - Xem danh sách phim: ");
            System.out.println("4 - Về menu chính: ");
            System.out.println("0 - Thoát chương trình: ");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    service.sortByName(movies);
                    System.out.println("Sắp xếp thành công");
                    break;
                case 2:
                    service.sortByReleaseDate(movies);
                    System.out.println("Sắp xếp thành công");
                    break;
                case 3:
                    System.out.println("Danh sách phim: ");
                    service.show(movies);
                    break;
                case 4:
                    mainMenu();
                case 0:
                    System.exit(0);

            }

        }
    }

    public void searchMenu(){
        boolean isTrue = true;
        while (isTrue){
            System.out.println("-----------------------");
            System.out.println("1 - Tìm theo tên: ");
            System.out.println("2 - Tìm theo thể loại: ");
            System.out.println("3 - Về menu chính: ");
            System.out.println("0 - Thoát chương trình: ");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    System.out.println("Nhập vào tên phim cần tìm: ");
                    String word = sc.nextLine();
                    service.searchByName(movies,word);
                    break;
                case 2:
                    System.out.println("Nhập vào thể loại phim cần tìm: ");
                    String category = sc.nextLine();
                    service.searchByCategory(movies,category);
                    break;
                case 3:
                    mainMenu();
                case 0:
                    System.exit(0);

            }

        }
    }

    public void mainMenu(){
        boolean isContinue = true;
        while (isContinue){
            menu();
            System.out.println("Lựa chọn là: ");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Danh sách phim: ");
                    service.show(movies);
                    break;
                case 2:
                    softMenu();
                    break;
                case 3:
                    searchMenu();
                    break;
                case 4:
                    service.theHighestView(movies);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn này");

            }
        }
    }
}
