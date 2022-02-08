import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    ArrayList<Employee> employees = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public ArrayList<Employee> getEmployee() {
        employees.add(new Employee(1, "Nguyễn Văn A", Sex.MALE, "Project Manager", "0987654321", "123@gmail.com", "123456"));
        employees.add(new Employee(2, "Trần Thị B", Sex.FEMALE, "Admin", "0999999999", "456@gmail.com", "123456"));
        employees.add(new Employee(3, "Nguyễn Thị C", Sex.FEMALE, "Staff", "0123456789", "abc@gmail.com", "123456"));
        employees.add(new Employee(4, "Nguyễn Văn D", Sex.MALE, "Staff", "0000000000", "def@gmail.com", "123456"));

        return employees;
    }

    public Employee createAccount() {
        int id = 0;
        int count = 0;
        while (true) {
            System.out.println("Nhập id: ");
            id = sc.nextInt();
            for (Employee e : employees) {
                if (id == e.getId()) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                break;
            } else {
                System.out.println("Id đã tồn tại, chọn id khác");
            }
        }

        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Chọn giới tính: ");
        boolean isTrue = true;
        Sex sex = null;
        while (isTrue) {
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    sex = Sex.MALE;
                    isTrue = false;
                    break;
                case 2:
                    sex = Sex.FEMALE;
                    isTrue = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    break;
            }
        }
        System.out.println("Nhập vị trí: ");
        String position = sc.nextLine();
        System.out.println("Nhập số điện thoại: ");
        String tel = sc.nextLine();
        System.out.println("Nhập email: ");
        String email = sc.nextLine();
        System.out.println("Nhập password tài khoản: ");
        String password = sc.nextLine();

        return new Employee(id,name,sex,position,tel,email,password);

    }

    public ArrayList<Employee> addAccount(ArrayList<Employee> employees){
        employees.add(createAccount());
        return employees;
    }

    public void show(ArrayList<Employee> employees){
        for(Employee e : employees){
            System.out.println(e);
        }
    }

    public boolean login(String email, String password){

        for(Employee e : employees){
                if (email.equals(e.getEmail())) {
                    if (password.equals(e.getPassword())) {
                        System.out.println("Đăng nhập thành công");
                        return true;
                    } else {
                        System.out.println("Sai mật khẩu");
                        return false;
                    }
                } else {
                    System.out.println("Không tồn tại tài khoản này");
                    return false;
                }
            }
        return false;
    }


    public void changePassword(Employee employee){
        System.out.println("Nhập password mới: ");
        employee.setPassword(sc.nextLine());
    }

    public void changePosition(Employee employee){
        System.out.println("Nhập vị trí mới: ");
        employee.setPosition(sc.nextLine());
    }

    public void changeEmail(Employee employee){
        System.out.println("Nhập email mới: ");
        employee.setEmail(sc.nextLine());
    }

}
