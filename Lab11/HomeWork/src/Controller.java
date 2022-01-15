import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    static Service service = new Service();
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Account> listAccount = service.getAllAccount();
    static Account acc = new Account();


    public static void menu() {
        System.out.println("Đăng Nhập");
        System.out.println("1 - Đăng nhập: ");
        System.out.println("2 - Đăng ký: ");
        System.out.println("3 - xem dan sach");
        System.out.println("Lựa chọn: ");
    }

    public static void login() {
        boolean isContinue = true;
        while (isContinue) {
            menu();
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 3 :
                    service.show(listAccount);
                    break;
                case 1:
                    System.out.println("Nhập username: ");
                    String username = sc.nextLine();
                    System.out.println("Nhập password: ");
                    String password = sc.nextLine();
                    if (service.loginAccountValidator(listAccount, username)) {
                        if (service.loginPasswordValidate(listAccount, username, password)) {
                            loginSuccessMenu();
                            acc.setUsername(username);
                            acc.setPassword(password);
                            for(Account a : listAccount){
                                if(a.getUsername().equals(username)){
                                    acc.setEmail(a.getEmail());
                                }
                            }
                        } else {
                            passwordErrorMenu();
                        }
                    } else {
                        System.out.println("Kiểm tra lại Username");
                        login();
                    }

                    break;
                case 2:
                    service.addAccount(listAccount);
                    service.show(listAccount);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }

        }
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
                    login();
                    break;
                case 2:
                    System.out.println("Nhập email: ");
                    String email = sc.nextLine();
                    service.forgotPassword(listAccount, email);
                    login();
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
                    service.changeUserName(listAccount, acc.getUsername(), newUsername);
                    System.out.println("Đã thay đổi thành công");
                    isContinue = false;
                    break;
                case 2:
                    System.out.println("Nhập email: ");
                    String newEmail = sc.nextLine();
                    boolean isContinueEm = true;
                    while (isContinueEm) {
                        if (service.emailValidate(newEmail)) {
                            service.changeEmail(listAccount, acc.getEmail(),newEmail);
                            System.out.println("Thay đổi email thành công");
                            isContinueEm = false;
                        } else {
                            System.out.println("Email không phù hợp:");
                            System.out.println("Nhập lại email:");
                            newEmail = sc.nextLine();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Nhập mật khẩu: ");
                    System.out.println("Password dài 7-15 kí tự, chứa ít nhất 1 kí tự in hoa, 1 kí tự đặc biệt(.,-_;)");
                    String newPassword = sc.nextLine();
                    boolean isContinuePw = true;
                    while (isContinuePw) {
                        if (service.passwordValidate(newPassword)) {
                            service.changePassWord(listAccount,acc.getPassword(),newPassword);
                            System.out.println("Thay đổi mật khẩu thành công");
                            isContinuePw = false;
                        } else {
                            System.out.println("Password không phù hợp");
                            System.out.println("Nhập lại mật khẩu: ");
                            System.out.println("Password dài 7-15 kí tự, chứa ít nhất 1 kí tự in hoa, 1 kí tự đặc biệt(.,-_;)");
                            newPassword = sc.nextLine();
                        }
                    }
                    break;
                case 4:
                    login();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    break;
            }
        }
    }

}

