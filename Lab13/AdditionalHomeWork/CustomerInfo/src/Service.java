import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {

    Scanner sc = new Scanner(System.in);
    Validate validate = new Validate();
    final String validateId = "KH[0-9]{7}";
    final String validateTel = "^0[0-9]{9,10}";
    final String validateEmail = ".+\\@.+\\..+";

    public ArrayList<Customer> getCustomerInfo() {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("KH0000001", "Nguyễn Văn A", LocalDate.of(1994, 01, 21), Sex.MALE, "Hà Nội", "0981111112", "fdsf@gmail.com"));
        customers.add(new Customer("KH0000002", "Nguyễn Văn B ", LocalDate.of(1999, 04, 21), Sex.MALE, "Hà Nội", "0981114352", "f344f@gmail.com"));
        customers.add(new Customer("KH0000003", "Nguyễn Thị C ", LocalDate.of(1999, 04, 21), Sex.FEMALE, "Quảng Ninh", "0981114352", "f324f@gmail.com"));
        customers.add(new Customer("KH0000004", "Nguyễn Thị D ", LocalDate.of(1923, 07, 31), Sex.FEMALE, "Phú Thọ", "09815414355", "f3fff4f@gmail.com"));
        return customers;
    }

    public void showCustomerInfo(ArrayList<Customer> customers) {
        for (Customer c : customers) {
            System.out.println(c);
        }
    }

    public void showCustomerInfo(ArrayList<Customer> customers, Sex sex) {
        for (Customer c : customers) {
            if (c.getSex().equals(sex)) {
                System.out.println(c);
            }
        }
    }

    public Customer createCustomer(ArrayList<Customer> customers) {
        System.out.println("Nhập Id: ");
        String id = sc.nextLine();
        validate.addValidate(id,validateId);
        for(Customer c : customers){
            if(c.getId().equals(id)){
                return null;
            }
        }
        System.out.println("Nhập tên khách hàng: ");
        String name = sc.nextLine();
        System.out.println("Nhập ngày tháng năm sinh [yyyy-MM-dd]: ");
        String str = sc.nextLine();
        LocalDate date = LocalDate.parse(str);
        System.out.println("Chọn giới tính: ");
        System.out.println("1 - Nam \n 2 - Nữ" );
        int choose = sc.nextInt();
        sc.nextLine();
        Sex sex = null;
        switch (choose){
            case 1:
                sex = Sex.MALE;
                break;
            case 2:
                sex = Sex.FEMALE;
                break;
            default:
                System.out.println("Không có lựa chọn này");
        }
        System.out.println("Nhập quê quán: ");
        String homeTown = sc.nextLine();
        System.out.println("Nhập số điện thoại (Số điện thoại có 10 hoặc 11 số, bắt đầu bằng số 0");
        String tel = sc.nextLine();
        validate.addValidate(tel,validateTel);
        System.out.println("Nhập vào email");
        String email = sc.nextLine();
        validate.addValidate(email,validateEmail);
        return new Customer(id,name,date,sex, homeTown,tel,email);
    }

    public Customer searchById(ArrayList<Customer> customers, String id){
        for(Customer c : customers){
            if(c.getId().equals(id)){
              return c;
            } else {
                System.out.println("Không tìm thấy thông tin khách hàng");
            }
        }
        return null;
    }

    public void changeInfo(ArrayList<Customer> customers, Customer customer){
        for(Customer c : customers){
            if(customer.){
                customer = createCustomer(customers);
            }
        }
    }




}
