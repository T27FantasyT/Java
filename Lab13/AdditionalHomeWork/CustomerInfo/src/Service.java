import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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

    public void countSex(ArrayList<Customer> customers){
        Map<Sex, Integer> list = new HashMap<>();
        for(Customer c : customers){
            if(list.get(c.getSex()) == null){
                list.put(c.getSex(),1);
            } else {
                list.put(c.getSex(),list.get(c.getSex())+1);
            }
        }
        System.out.println(list);
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
        while (true) {
            if (validate.addValidate(id, validateId))
                break;
            else id = sc.nextLine();
        }
        for (Customer c : customers) {
            if (c.getId().equals(id)) {
                return null;
            }
        }
        System.out.println("Nhập tên khách hàng: ");
        String name = sc.nextLine();
        System.out.println("Nhập ngày tháng năm sinh [yyyy-MM-dd]: ");
        String str = sc.nextLine();
        LocalDate date = LocalDate.parse(str);
        System.out.println("Chọn giới tính: ");
        System.out.println("1 - Nam \n2 - Nữ");
        int choose = sc.nextInt();
        sc.nextLine();
        Sex sex = null;
        switch (choose) {
            case 1:
                sex = Sex.MALE;
                break;
            case 2:
                sex = Sex.FEMALE;
                break;
            default:
                System.out.println("Không có lựa chọn này");
                break;
        }
        System.out.println("Nhập quê quán: ");
        String homeTown = sc.nextLine();
        System.out.println("Nhập số điện thoại (Số điện thoại có 10 hoặc 11 số, bắt đầu bằng số 0");
        String tel = sc.nextLine();
        while (true) {
            if (validate.addValidate(tel, validateTel))
                break;
            else tel = sc.nextLine();
        }
        System.out.println("Nhập vào email");
        String email = sc.nextLine();

        while (true) {
            if (validate.addValidate(email, validateEmail))
                break;
            else tel = sc.nextLine();
        }
        return new Customer(id, name, date, sex, homeTown, tel, email);
    }



    public void addCustomer(ArrayList<Customer> customers) {
        Customer customer = createCustomer(customers);
        if (customer != null) {
            customers.add(customer);
        } else return;
    }

    public Customer searchById(ArrayList<Customer> customers, String id) {
        for (Customer c : customers) {
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    public void delete(ArrayList<Customer> customers, String id) {
        Customer customer = searchById(customers, id);
        customers.remove(customer);
    }

    public void changeInfo(ArrayList<Customer> customers, String id) {
        Customer customer = searchById(customers, id);
        System.out.println("1 - Đổi tên:");
        System.out.println("2 - Đổi ngày sinh");
        System.out.println("3 - Đổi giới tính");
        System.out.println("4 - Đổi quê quán");
        System.out.println("5 - Đổi số điện thoại");
        System.out.println("6 - Đổi Email");
        int choose = sc.nextInt();
        sc.nextLine();
        switch (choose) {
            case 1:
                System.out.println("Nhập tên mới");
                customer.setName(sc.nextLine());
                System.out.println("Thay đổi thành công");
                break;
            case 2:
                System.out.println("Nhập ngày sinh [yyyy-MM-dd]");
                customer.setDateOfBirth(LocalDate.parse(sc.nextLine()));
                System.out.println("Thay đổi thành công");
                break;
            case 3:
                System.out.println("Chọn giới tính: ");
                System.out.println("1 - Nam \n 2 - Nữ");
                int chosen = sc.nextInt();
                sc.nextLine();
                Sex sex = null;
                switch (chosen) {
                    case 1:
                        customer.setSex(Sex.MALE);
                        break;
                    case 2:
                        customer.setSex(Sex.FEMALE);
                        break;
                    default:
                        System.out.println("Không có lựa chọn này");
                        break;
                }
                System.out.println("Thay đổi thành công");
                break;
            case 4:
                System.out.println("Nhập quê quán: ");
                customer.setHomeTown(sc.nextLine());
                System.out.println("Thay đổi thành công");
                break;
            case 5:
                System.out.println("Nhập số điện thoại (Số điện thoại có 10 hoặc 11 số, bắt đầu bằng số 0");
                String tel = sc.nextLine();
                while (true) {
                    if (validate.addValidate(tel, validateTel))
                        break;
                    else tel = sc.nextLine();
                }
                customer.setTel(tel);
                System.out.println("Thay đổi thành công");
                break;
            case 6:
                System.out.println("Nhập vào email");
                String email = sc.nextLine();
                while (true) {
                    if (validate.addValidate(email, validateEmail))
                        break;
                    else email = sc.nextLine();
                }
                customer.setEmail(email);
                System.out.println("Thay đổi thành công");
                break;
            default:
                System.out.println("Không có lựa chọn này");

        }
    }

}
