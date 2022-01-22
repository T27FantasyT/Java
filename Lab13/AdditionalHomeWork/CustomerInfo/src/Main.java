import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        ArrayList<Customer> customers =  service.getCustomerInfo();
        Customer c = new Customer("KH0000001", "Nguyễn Văn A", LocalDate.of(1994, 01, 21), Sex.MALE, "Hà Nội", "0981111112", "fdsf@gmail.com");
        service.changeInfo(customers,c);
        service.showCustomerInfo(customers);
    }
}
