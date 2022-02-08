import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    static Scanner sc = new Scanner(System.in);
    static Service service = new Service();
    static TaskService taskService = new TaskService();
    static ArrayList<Task> taskArrayList = new ArrayList<>();
    static CheckInService checkInService = new CheckInService();
    static ArrayList<Employee> employees = service.getEmployee();
    static ArrayList<CheckIn> checkInCheckOut = new ArrayList<>();
    static Employee employee = new Employee();
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public static void menu() {
        System.out.println("1 - Đăng nhập");
        System.out.println("2 - Đăng kí tài khoản");
        System.out.println("Lựa chọn: ");
        while (true) {
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    System.out.println("Nhập email: ");
                    String email = sc.nextLine();
                    System.out.println("Nhập mật khẩu: ");
                    String password = sc.nextLine();
                    if (service.loginAccountValidate(employees, email)) {
                        if (service.loginPasswordValidate(employees, email, password)) {
                            employee.setEmail(email);
                            for (Employee e : employees) {
                                if (email.equals(e.getEmail())) {
                                    switch (e.getPosition()) {
                                        case "Staff":
                                            staffAccLogin();
                                            break;
                                        case "Project Manager":
                                            projectManagerLogin();
                                            break;
                                        case "Admin":
                                            adminLogin();
                                            break;
                                    }
                                }
                            }
                        } else {
                            System.out.println("Sai mật khẩu: ");
                            menu();
                        }
                    } else {
                        System.out.println("Không tồn tại tài khoản này");
                        menu();
                    }
                    break;
                case 2:
                    service.addAccount(employees);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    break;
            }
        }
    }

    public static void staffAccLogin() {
        Employee staff = new Employee();
        System.out.println("1 - Chấm công");
        System.out.println("2 - Quản lý công việc");
        System.out.println("3 - Thay đổi thông tin cá nhân");
        System.out.println("0 - Đăng xuất");
        for (Employee e : employees) {
            if (e.getEmail().equals(employee.getEmail())) {
                staff = e;
            }
        }
        while (true) {
            System.out.println("Lựa chọn: ");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    while (true) {
                    System.out.println("1 - CheckIn");
                    System.out.println("2 - CheckOut");
                    System.out.println("3 - Xem thông tin chấm công");
                    System.out.println("0 - Về Menu trước");
                        int chosen = sc.nextInt();
                        sc.nextLine();
                        switch (chosen) {
                            case 1:
                                checkInService.checkIn(checkInCheckOut,staff);
                                System.out.println("Đã check in thành công vào lúc: " + LocalTime.now().format(formatter));
                                staffAccLogin();
                                break;
                            case 2:
                                checkInService.checkOut(checkInCheckOut);
                                System.out.println("Đã check out thành công vào lúc: " + LocalTime.now().format(formatter));
                                menu();
                                break;
                            case 3:
                                checkInService.showStaff(checkInCheckOut,staff);
                                break;
                            case 0:
                                staffAccLogin();
                                break;
                            default:
                                System.out.println("Không có lựa chọn này");
                        }
                    }
                case 2:
                    while (true) {
                    System.out.println("1 - Nhập task công việc");
                    System.out.println("2 - Cập nhật trạng thái");
                    System.out.println("3 - Xem danh sách công việc");
                    System.out.println("4 - Trở về menu trước");
                        System.out.println("Lựa chọn: ");
                        int chosen = sc.nextInt();
                        sc.nextLine();
                        switch (chosen) {
                            case 1:
                                taskService.addTask(taskArrayList, staff);
                                System.out.println("Nhập task công việc thành công");
                                staffAccLogin();
                                break;
                            case 2:
                                taskService.showStaff(taskArrayList,staff);
                                System.out.println("Nhập id task cần update tiến độ");
                                int id = sc.nextInt();
                                sc.nextLine();
                                taskService.updateState(taskArrayList, staff,id);
                                System.out.println("Cập nhật trạng thái thành công");
                                staffAccLogin();
                                break;
                            case 3:
                                taskService.showStaff(taskArrayList,staff);
                                break;
                            case 4:
                                staffAccLogin();
                                break;
                        }
                    }
                case 3:
                    System.out.println("1 - Đổi email");
                    System.out.println("2 - Đổi password");
                    System.out.println("3 - Đổi số điện thoại");
                    int chosen = sc.nextInt();
                    sc.nextLine();
                    switch (chosen){
                        case 1:
                            service.changeEmail(staff);
                            break;
                        case 2:
                            service.changePassword(staff);
                            break;
                        case 3:
                            service.changeTel(staff);
                            break;
                        default:
                            System.out.println("Không có lựa chọn này");
                            break;
                    }
                case 0:
                    menu();
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }
    public static void projectManagerLogin() {
        System.out.println("1 - Chấm công");
        System.out.println("2 - Quản lý task công việc");
        System.out.println("3 - Phê duyệt");
        System.out.println("4 - Thay đổi thông tin cá nhân");
        System.out.println("0 - Đăng xuất");
        while (true) {
            System.out.println("Lựa chọn: ");
        }
    }
    public static void adminLogin() {
        Employee admin = new Employee();
        System.out.println("1 - Chấm công");
        System.out.println("2 - Yêu cầu phê duyệt");
        System.out.println("3 - Thay đổi thông tin cá nhân");
        System.out.println("0 - Đăng xuất");
        for(Employee e : employees){
            if(e.getEmail().equals(employee.getEmail())){
                admin=e;
            }
        }
        while (true) {
            System.out.println("Lựa chọn: ");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    while (true) {
                        System.out.println("1 - CheckIn");
                        System.out.println("2 - CheckOut");
                        System.out.println("3 - Xem thông tin chấm công");
                        System.out.println("0 - Về Menu trước");
                        int chosen = sc.nextInt();
                        sc.nextLine();
                        switch (chosen) {
                            case 1:
                                checkInService.checkIn(checkInCheckOut,admin);
                                System.out.println("Đã check in thành công vào lúc: " + LocalTime.now().format(formatter));
                                adminLogin();
                                break;
                            case 2:
                                checkInService.checkOut(checkInCheckOut);
                                System.out.println("Đã check out thành công vào lúc: " + LocalTime.now().format(formatter));
                                menu();
                                break;
                            case 3:
                                checkInService.show(checkInCheckOut);
                                break;
                            case 0:
                                adminLogin();
                                break;
                            default:
                                System.out.println("Không có lựa chọn này");
                                break;
                        }
                    }
                case 2:
                case 3:

            }
        }
    }
}
