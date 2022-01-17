package controller;

import model.Account;
import java.util.Scanner;
import service.Service;

public class Controller {

    static Scanner sc = new Scanner(System.in);
    static Account account = new Account("Tien","0972942909","1111","1234",5000000);
    static Service service = new Service();

    public static void menu(){
        boolean isTrue = true;
        while(isTrue){
            System.out.println("------------------------");
            System.out.println("1 - Đăng nhập");
            System.out.println("0 - Thoát chương trình");
            System.out.println("Lựa chọn: ");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    System.out.println("Nhập số điện thoại");
                    String tel = sc.nextLine();
                    System.out.println("Nhập password");
                    String password = sc.nextLine();
                    if(service.login(account,tel,password)){
                        System.out.println("Đăng nhập thành công");
                        mainMenu();
                    }
                    break;
                case 0 :
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public static void mainMenu(){


        boolean isContinue = true;
        while(isContinue){
            System.out.println("----------------------");
            System.out.println("1 - Truy vấn số dư tài khoản");
            System.out.println("2 - Chuyển tiền");
            System.out.println("3 - Xem lịch sử giao dịch");
            System.out.println("Lựa chọn");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    System.out.println("Số dư trong tài khoản là: ");
                    service.newBalance(account);
                    System.out.println(account.getBalance());
                    break;
                case 2:
                    service.transfer(account);
                    System.out.println("Chuyển tiền thành công");
                    break;
                case 3:
                    service.printTransferHistory();
                    break;
            }
        }
    }
}
