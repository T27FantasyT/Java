import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//    Controller.mainMenu();

        Service service = new Service();
        ArrayList<Customer> customers = service.getCustomerInfo();
        service.countSex(customers);
    }
}
