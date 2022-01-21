import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public boolean validate(String validate, String validateCode){
        Pattern pattern = Pattern.compile(validateCode);
        Matcher matcher = pattern.matcher(validate);
        return matcher.matches();
    }
}
