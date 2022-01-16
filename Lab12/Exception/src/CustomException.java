//RuntimeException : chi xu ly khi chay chuong trinh
//Exception : phai xu ly khi viet code

public class CustomException extends Exception{
    public CustomException(String message) {
        super(message);
    }
}
