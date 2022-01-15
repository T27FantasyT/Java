import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    static Service service = new Service();
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Account> listAccount = service.getAllAccount();


    public static void menu() {
        System.out.println("Đăng Nhập");
        System.out.println("1 - Đăng nhập: ");
        System.out.println("2 - Đăng ký: ");
        System.out.println("Lựa chọn: ");
    }

    public static Account mainMenu() {
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
                    if (service.loginAccountValidator(listAccount, username)) {
                        if (service.loginPasswordValidate(listAccount, username, password)) {
                            loginSuccessMenu();
                        } else {
                            passwordErrorMenu();
                        }
                    } else {
                        System.out.println("Kiểm tra lại Username");
                        mainMenu();
                        break;
                    }
                    service.show(listAccount);
                case 2:
                    service.addAccount(listAccount);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
        return new Account(mainMenu().getUsername(), mainMenu().getPassword(), mainMenu().getEmail());
    }


    public static void passwordErrorMenu() {
        System.out.println("1 - Đăng nhập lại: ");
        System.out.println(("2 - Quên mật khẩu: "));
        boolean isContinue = true;
        System.out.println("Lựa chọn: ");
        int choose = sc.nextInt();
        sc.nextLine();
        while (isContinue) {
            switch (choose) {
                case 1:
                    mainMenu();
                    break;
                case 2:
                    System.out.println("Nhập email: ");
                    String email = sc.nextLine();
                    service.forgotPassword(listAccount, email);
                    mainMenu();
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public static void loginSuccessMenu() {
        System.out.println("1 - Thay đổi user name:");
        System.out.println("2 - Thay đổi email: ");
        System.out.println("3 - Thay đổi mật khẩu: ");
        System.out.println("4 - Đăng xuất: ");
        System.out.println("0 - Thoát chương trình");
        System.out.println("Lựa chọn: ");
        int choose = sc.nextInt();
        sc.nextLine();
        boolean isContinue = true;
        while (isContinue) {
            switch (choose) {
                case 1:
                    System.out.println("Nhập username mới: ");
                    String newUsername = sc.nextLine();
                    service.changeUserName(listAccount, mainMenu().getUsername(), newUsername);
                    service.show(listAccount);
                    System.out.println("Đã thay đổi thành công");
                    break;
                case 2:
                    System.out.println("Nhập email: ");
                    String email = sc.nextLine();
                    boolean isContinueEm = true;
                    while (isContinueEm) {
                        if (service.emailValidate(email)) {
                            mainMenu().setEmail(email);
                            System.out.println("Thay đổi email thành công");
                            isContinueEm = false;
                        } else {
                            System.out.println("Email không phù hợp:");
                            System.out.println("Nhập lại email:");
                            email = sc.nextLine();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Nhập mật khẩu: ");
                    System.out.println("Password dài 7-15 kí tự, chứa ít nhất 1 kí tự in hoa, 1 kí tự đặc biệt(.,-_;)");
                    String password = sc.nextLine();
                    boolean isContinuePw = true;
                    while (isContinuePw) {
                        if (service.passwordValidate(password)) {
                            mainMenu().setPassword(password);
                            System.out.println("Thay đổi mật khẩu thành công");
                            isContinuePw = false;
                        } else {
                            System.out.println("Password không phù hợp");
                            System.out.println("Nhập lại mật khẩu: ");
                            System.out.println("Password dài 7-15 kí tự, chứa ít nhất 1 kí tự in hoa, 1 kí tự đặc biệt(.,-_;)");
                            password = sc.nextLine();
                        }
                    }
                    break;
                case 4:
                    mainMenu();
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn này");


            }
        }
    }

}

