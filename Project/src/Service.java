import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Service {
    ArrayList<Employee> employees = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    public ArrayList<Employee> getEmployee() {
        employees.add(new Employee(1, "Nguyễn Văn A", Sex.MALE, "Project Manager", "0987654321", "123@gmail.com", "123456"));
        employees.add(new Employee(2, "Trần Thị B", Sex.FEMALE, "Admin", "0999999999", "456@gmail.com", "123456"));
        employees.add(new Employee(3, "Nguyễn Thị C", Sex.FEMALE, "Staff", "0123456789", "abc@gmail.com", "123456"));
        employees.add(new Employee(4, "Nguyễn Văn D", Sex.MALE, "Staff", "0000000000", "def@gmail.com", "123456"));

        return employees;
    }

    public Employee createAccount() {
        int id;
        int count = 0;
        while (true) {
            id = random.nextInt(100);
            for (Employee e : employees) {
                if (id == e.getId()) {
                    count++;
                }
            }
            if (count == 0) {
                break;
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

    public void addAccount(ArrayList<Employee> employees){
        employees.add(createAccount());
    }

    public void show(ArrayList<Employee> employees){
        for(Employee e : employees){
            System.out.println(e);
        }
    }

    public boolean loginAccountValidate(ArrayList<Employee> employees,String email){

        for(Employee e : employees){
                if (email.equals(e.getEmail())) {
                    return true;
                }
            }
        return false;
    }

    public boolean loginPasswordValidate(ArrayList<Employee> employees, String email, String password){
        for(Employee e : employees){
            if(e.getEmail().equals(email)){
                if(e.getPassword().equals(password)){
                    System.out.println("Chào mừng " + e.getName());
                    return true;
                }
            }
        }
        return false;
    }


    public void changePassword(Employee employee){
        System.out.println("Nhập password mới: ");
        employee.setPassword(sc.nextLine());
        System.out.println("Đổi password thành công");
    }

    public void changePosition(Employee employee){
        System.out.println("Nhập vị trí mới: ");
        employee.setPosition(sc.nextLine());
        System.out.println("Cập nhật vị trí mới thành công");
    }

    public void changeEmail(Employee employee){
        System.out.println("Nhập email mới: ");
        employee.setEmail(sc.nextLine());
        System.out.println("Cập nhật email thành công");
    }
    public void changeTel(Employee employee){
        System.out.println("Nhập số điện thoại mới: ");
        employee.setTel(sc.nextLine());
        System.out.println("Cập nhật số điện thoại thành công");
    }

}
