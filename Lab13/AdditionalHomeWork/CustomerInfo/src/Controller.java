import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Service service = new Service();
    static ArrayList<Customer> customers = service.getCustomerInfo();
    static Scanner sc = new Scanner(System.in);

    public static void menu(){
        System.out.println("1 - Xem thông tin toàn bộ khách hàng");
        System.out.println("2 - Xem thông tin khách hàng nữ hoặc nam");
        System.out.println("3 - Thêm khách hàng");
        System.out.println("4 - Tìm kiếm thông tin khách hàng");
        System.out.println("0 - Thoát chương trình");
        System.out.println("Lựa chọn: ");
    }
    public static void viewBySex(){
        System.out.println("1 - Xem thông tin khách hàng Nam");
        System.out.println("2 - Xem thông tin khách hàng Nữ");
        System.out.println("0 - Trở về Menu chính");
        System.out.println("Lựa chọn: ");
        while(true){
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    service.showCustomerInfo(customers,Sex.MALE);
                    break;
                case 2:
                    service.showCustomerInfo(customers,Sex.FEMALE);
                    break;
                case 0:
                    mainMenu();
                    break;
                default:
                    System.out.println("không có lựa chọn này");
            }
        }
    }
    public static void changeInfo(ArrayList<Customer> customers, String id){

        while(true){
            System.out.println("1 - Thay đổi thông tin");
            System.out.println("2 - Xoá khách hàng");
            System.out.println("0 - Về Menu chính");
            System.out.println("lựa chọn");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    service.changeInfo(customers,id);
                    break;
                case 2:
                    service.delete(customers,id);
                    mainMenu();
                    break;
                case 0:
                    mainMenu();
                    break;
                default:
                    System.out.println("không có lựa chọn này");
            }
        }
    }

    public  static void mainMenu(){
        while (true){
            menu();
            int choose = sc.nextInt();;
            sc.nextLine();
            switch (choose){
                case 1:
                    service.showCustomerInfo(customers);
                    break;
                case 2:
                    viewBySex();
                    break;
                case 3:
                    service.addCustomer(customers);
                    break;
                case 4:
                    System.out.println("Nhập ID khách hàng cần tìm kiếm: ");
                    String id = sc.nextLine();
                    service.searchById(customers,id);
                    Customer customer = service.searchById(customers,id);
                    System.out.println(customer);
                    if(customer!=null){
                        changeInfo(customers,id);
                    } else System.out.println("không tìm thấy thông tin khách hàng");

                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("không có lựa chọn này");
            }
        }
    }
}
