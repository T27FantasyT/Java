import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Service {

    Scanner sc = new Scanner(System.in);

    public boolean loginPasswordValidate(ArrayList<Account> listAccount, String userName, String password) {
        for (Account a : listAccount) {
            if (a.getUsername().equals(userName)) {
                if (a.getPassword().equals(password)) {
                    System.out.println("Chào mừng " + userName);
                    return true;
                } else return false;
            }
        }
        return false;
    }

    public boolean loginAccountValidator(ArrayList<Account> listAccount, String username) {
        for (Account a : listAccount) {
            if (a.getUsername().equals(username)) return true;
        }
        return false;
    }

    public void forgotPassword(ArrayList<Account> accounts, String email) {
        for (Account a : accounts) {
            if (a.getEmail().equals(email)) {

                boolean isContinuePw = true;

                System.out.println("Nhập mật khẩu: ");
                System.out.println("Password dài 7-15 kí tự, chứa ít nhất 1 kí tự in hoa, 1 kí tự đặc biệt(.,-_;)");
                String newPassword = sc.nextLine();
                while (isContinuePw) {
                    if (passwordValidate(newPassword)) {
                        isContinuePw = false;
                    } else {
                        System.out.println("Password không phù hợp");
                        System.out.println("Nhập lại mật khẩu: ");
                        System.out.println("Password dài 7-15 kí tự, chứa ít nhất 1 kí tự in hoa, 1 kí tự đặc biệt(.,-_;)");
                        newPassword = sc.nextLine();
                    }
                }

                a.setPassword(newPassword);
            } else {
                System.out.println("Không tồn tại tài khoản");
            }
        }
    }

    public boolean passwordValidate(String password) {
        Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*[\\.\\,\\-\\_\\;])([^\\s]){7,15}");
        return pattern.matcher(password).matches();
    }

    public boolean emailValidate(String email) {
        Pattern pattern = Pattern.compile(".+\\@.+\\..+");
        return pattern.matcher(email).matches();
    }

    public Account createAccount() {
        boolean isContinuePw = true;
        boolean isContinueEm = true;

        System.out.println("Nhập tên đăng nhập: ");
        String userName = sc.nextLine();
        System.out.println("Nhập mật khẩu: ");
        System.out.println("Password dài 7-15 kí tự, chứa ít nhất 1 kí tự in hoa, 1 kí tự đặc biệt(.,-_;)");
        String password = sc.nextLine();
        while (isContinuePw) {
            if (passwordValidate(password)) {
                isContinuePw = false;
            } else {
                System.out.println("Password không phù hợp");
                System.out.println("Nhập lại mật khẩu: ");
                System.out.println("Password dài 7-15 kí tự, chứa ít nhất 1 kí tự in hoa, 1 kí tự đặc biệt(.,-_;)");
                password = sc.nextLine();
            }
        }

        System.out.println("Nhập email: ");
        String email = sc.nextLine();
        while (isContinueEm) {
            if (emailValidate(email)) {
                isContinueEm = false;
            } else {
                System.out.println("Email không phù hợp:");
                System.out.println("Nhập lại email:");
                email = sc.nextLine();
            }
        }


        return new Account(userName, password, email);
    }

    public void addAccount(ArrayList<Account> accounts) {
        accounts.add(createAccount());
    }

    public void show(ArrayList<Account> accounts) {
        for (Account a : accounts) {
            System.out.println(a);
        }
    }

    public void changeUserName(ArrayList<Account> accounts, String userName, String newUsername) {
        for (Account a : accounts) {
            if (a.getUsername().equals(userName)) {
                a.setUsername(newUsername);
            }
        }
    }

    public void changePassWord(ArrayList<Account> accounts, String password, String newPassword) {
        for (Account a : accounts) {
            if (a.getPassword().equals(password)) {
                a.setPassword(newPassword);
            }

        }
    }

    public void changeEmail(ArrayList<Account> accounts, String email, String newEmail) {
        for (Account a : accounts) {
            if (a.getEmail().equals(email)) {
                a.setEmail(newEmail);
            }
        }
    }
}
