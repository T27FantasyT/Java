import java.util.Scanner;
import java.util.regex.Pattern;

public class Service {

    Account account1 = new Account("Tien", "123456", "1234@gmail.com");
    Scanner sc = new Scanner(System.in);

    public boolean validate(String userName) {
        if (!userName.equals(account1.getUserName())) {
            return false;
        } else return true;
    }

    public void forgotPassword(String email) {
        if (email.equals(account1.getEmail())) {
            System.out.println("Nhập email mới: ");
            String newPassword = sc.nextLine();
            account1.setPassWord(newPassword);
            System.out.println("Đổi password thành công");
        } else {
            System.out.println("Không tồn tài tại khoản");
        }
    }
    public void createAccount(String username , String password, String email){

    }

    public boolean passwordValidate(String password){
        Pattern pattern = Pattern.compile("\\w{7,15}")
    }
}
