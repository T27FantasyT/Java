import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

    Scanner sc = new Scanner(System.in);

    public boolean validate(String validate, String validateCode) {
        Pattern pattern = Pattern.compile(validateCode);
        Matcher matcher = pattern.matcher(validate);
        return matcher.matches();
    }


    public void addValidate(String str, String validate){
        while (true){
            if(validate(str,validate)){
                break;
            } else {
                System.out.println("Chuỗi nhập vào không đúng");
                str= sc.nextLine();
            }


        }
    }

}
