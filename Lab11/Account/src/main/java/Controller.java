import java.util.Scanner;

public class Controller {

    static Service service = new Service();
    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("Đăng Nhập");
        System.out.println("1 - Đăng nhập: ");
        System.out.println("2 - Đăng ký: ");
        System.out.println("Lựa chọn: ");
    }

    public static void mainMenu

    {
        boolean isContinue = true;
        while (isContinue) {
            menu();
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    System.out.println("Nhập username: ");
                    String username = sc.nextLine();
                    System.out.println("Nhập password: ");
                    String password = sc.nextLine();
                    if(service.validate(username)){
                        loginSuccessMenu();
                    } else {
                        System.out.println("Kiểm tra lại username");
                        menu();
                    }
                case 2:

            }
        }
    }


    public static void passwordErrorMenu() {
        System.out.println("1- Đăng nhập lại: ");
        System.out.println(("2 - Quên mật khẩu: "));
    }

    public static void loginSuccessMenu() {
        System.out.println("Chào mừng " + service.account1.getUserName());
        System.out.println("1 - Thay đổi user name:");
        System.out.println("2 - Thay đổi email: ");
        System.out.println("3 - Thay đổi mật khẩu: ");
        System.out.println("4 - Đăng xuất: ");
        System.out.println("0 - Thoát chương trình");
    }

}

