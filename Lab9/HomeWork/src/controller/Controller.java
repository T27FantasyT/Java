package controller;
import Service.Service;
import model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Controller {
    static Service service = new Service();
    static ArrayList<Product> products = service.getProduct();
    static Scanner sc = new Scanner(System.in);

    public static void menu(){
        System.out.println("--------------------------");
        System.out.println("1 - Xem danh sách sản phẩm:");
        System.out.println("2 - Tìm sản phẩm theo tên:");
        System.out.println("3 - Liệt kê sản phẩm theo loại mặt hàng:");
        System.out.println("4 - Cập nhật tên và giá của sản phẩm:");
        System.out.println("5 - Xoá sản phẩm:");
        System.out.println("6 - Thêm sản phẩm:");
        System.out.println("0 - Thoát chương trình");
    }
    public static void returnToMainMenu(){
        boolean isTrue = true;
        while(isTrue) {
            System.out.println("--------------------------");
            System.out.println("1 - Trở về menu chính:");
            System.out.println("0 - Thoát chương trình:");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    mainMenu();
                    isTrue = false;
                    break;
                case 0:
                    System.exit(0);
                    isTrue = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này:");
                    break;
            }
        }
    }

    public static void changeNameAndPrice(){
        boolean isTrue = true;
        while(isTrue) {
            System.out.println("--------------------------");
            System.out.println("1 - Cập nhật tên sản phẩm:");
            System.out.println("2 - Cập nhật giá sản phẩm:");
            System.out.println("0 - Trở lại menu chính:");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    service.changeName(products);
                    isTrue = false;
                    break;

                case 2:
                    service.changePrice(products);
                    isTrue = false;
                    break;
                case 0:
                    mainMenu();
                    isTrue = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này:");
                    break;

            }
        }
    }

    public static void mainMenu(){
        boolean isContinue = true;
        while(isContinue){
            menu();
            System.out.println("Lựa chọn: ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    service.showProduct(products);
                    returnToMainMenu();
                    break;
                case 2:
                    System.out.println("Nhập tên sản phẩm: ");
                    String name = sc.nextLine();
                    service.searchByName(products,name);
                    returnToMainMenu();
                    break;
                case 3:
                    service.searchByType(products);
                    returnToMainMenu();
                    break;
                case 4:
                    service.showProduct(products);
                    changeNameAndPrice();
                    returnToMainMenu();
                    break;
                case 5:
                    System.out.println("Nhập id sản phầm cần xoá: ");
                    int id = Integer.parseInt(sc.nextLine());
                    service.deleteProduct(products,id);
                    System.out.println("Danh sách sau khi xoá sản phẩm: ");
                    service.showProduct(products);
                    returnToMainMenu();
                    break;
                case 6:
                    products.add(service.addProduct());
                    System.out.println("Danh sách sau khi thêm sản phẩm: ");
                    service.showProduct(products);
                    returnToMainMenu();
                    break;
                case 7:
                    Collections.sort(products);
                    System.out.println("Danh sách sản phẩm sắp xếp theo giá: ");
                    service.showProduct(products);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    returnToMainMenu();
                    break;
            }
        }
    }
}
