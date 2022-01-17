package controller;

import model.Product;
import service.Service;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Service service = new Service();
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Product> products = service.getProduct();

    public static void menu() {
        System.out.println("------------------------------");
        System.out.println("1 - Danh sách sảm phẩm theo danh mục");
        System.out.println("2 - Danh sách sảm phẩm theo hãng");
        System.out.println("3 - Danh sách sảm phẩm theo mức giá");
        System.out.println("4 - Danh sách sảm phẩm theo tên");
        System.out.println("0 - Thoát chương trình");
        System.out.println("Lựa chọn: ");
    }


    public static void mainMenu() {

        boolean isContinue = true;
        while (isContinue) {
            menu();
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    typeMenu();
                    break;
                case 2:
                    manufactureMenu();
                    break;
                case 3:
                    priceMenu();
                    break;
                case 4:
                    System.out.println("Nhập tên sản phẩm: ");
                    String name = sc.nextLine();
                    service.searchByName(products, name);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("không có lựa chọn này");
                    break;
            }
        }
    }

    public static void manufactureMenu() {
        boolean istrưe = true;
        while (istrưe) {
            System.out.println("Danh sách các nhà sản xuất: ");
            service.getManufature(products);
            System.out.println("Nhập tên nhà sản xuất bạn muốn tìm sản phẩm");
            String manufacture = sc.nextLine();
            service.searchByManufacture(products, manufacture);
            System.out.println("--------------------");
            System.out.println("1 - Về menu chính");
            System.out.println("2 - Về menu xem sản phẩm theo hãng");
            System.out.println("0 - Thoát chương trình");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    mainMenu();
                    break;
                case 2:
                    manufactureMenu();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("không có lựa chọn này");
                    break;
            }

        }
    }

    public static void priceMenu() {
        System.out.println("--------------------");
        System.out.println("1 - Giá dưới 2 triệu");
        System.out.println("2 - Giá từ 2 - 4 triệu");
        System.out.println("3 - Giá từ 4 - 7 triệu");
        System.out.println("4 - Giá từ 7 - 13 triệu");
        System.out.println("5 - Giá trên 13 triệu");
        System.out.println("Lựa chọn");
        boolean istrue = true;
        while (istrue) {
            int choose = sc.nextInt();
            service.searchByPrice(products, choose);
            System.out.println("--------------------");
            System.out.println("1 - Về menu chính");
            System.out.println("2 - Về menu xem sản phẩm theo giá");
            System.out.println("0 - Thoát chương trình");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    mainMenu();
                    break;
                case 2:
                    priceMenu();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("không có lựa chọn này");
                    break;
            }

        }
    }

    public static void typeMenu() {
        System.out.println("--------------------");
        System.out.println("1 - Danh sách sản phẩm Laptop");
        System.out.println("2 - Danh sách sản phẩm Điện thoại");
        System.out.println("3 - Danh sách sản phẩm Apple");
        System.out.println("4 - Danh sách sản phẩm Phụ kiện");
        System.out.println("Lựa chọn");
        boolean istrue = true;
        while (istrue) {
            int choose = sc.nextInt();
            service.searchByType(products, choose);
            System.out.println("1 - Về menu chính");
            System.out.println("2 - Về menu xem sản phẩm theo danh mục");
            System.out.println("0 - Thoát chương trình");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    mainMenu();
                    break;
                case 2:
                    typeMenu();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("không có lựa chọn này");
                    break;
            }
        }
    }
}
