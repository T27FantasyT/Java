package service;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import model.*;

public class Service {
    ArrayList<Employee> employees = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    public ArrayList<Employee> getEmployee() {
        employees.add(new Employee(1, "Manager", Sex.MALE, Position.PROJECT_MANAGER, "0987654321", "manager@gmail.com", "123456"));
        employees.add(new Employee(2, "Admin", Sex.FEMALE, Position.ADMIN, "0999999999", "admin@gmail.com", "123456"));
        employees.add(new Employee(3, "Staff1", Sex.FEMALE, Position.STAFF, "0123456789", "staff1@gmail.com", "123456"));
        employees.add(new Employee(4, "Staff2", Sex.MALE, Position.STAFF, "0000000000", "staff2@gmail.com", "123456"));

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
        boolean isTrue = true;
        Sex sex = null;
        while (isTrue) {
            System.out.println("Chọn giới tính: ");
            System.out.println("1 - Nam \t2 - Nữ");
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
        boolean isContinue = true;
        Position position = null;
        while(isContinue){
            System.out.println("Chọn vị trí: ");
            System.out.println("1 - Project Manager \t2 - Admin \t3 - Staff");
            int chosen = sc.nextInt();
            switch (chosen){
                case 1: position = Position.PROJECT_MANAGER;
                isContinue = false;
                break;
                case 2: position = Position.ADMIN;
                isContinue = false;
                break;
                case 3: position = Position.STAFF;
                isContinue = false;
                break;
                default:
                    System.out.println("Lựa chọn không đúng");
                    break;
            }

        }
        sc.nextLine();
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

    public boolean loginAccountValidate(ArrayList<Employee> employees, String email){

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
        boolean isTrue = true;
        while(isTrue) {
            System.out.println("Nhập vị trí mới: ");
            System.out.println("1 - Project Manager \t2 - Admin \t3 - Staff");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    employee.setPosition(Position.PROJECT_MANAGER);
                    isTrue = false;
                    break;
                case 2:
                    employee.setPosition(Position.ADMIN);
                    isTrue = false;
                    break;
                case 3:
                    employee.setPosition(Position.STAFF);
                    isTrue = false;
                    break;
                default:
                    System.out.println("Không tồn tại vị trí này");
                    break;
            }
        }
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
