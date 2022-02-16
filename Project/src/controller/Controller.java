package controller;

import model.*;
import service.*;
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
    static ApproveService approveService = new ApproveService();
    static ArrayList<Approve> approves = new ArrayList<>();
    static Employee employee = new Employee();
    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public static void menu() {
        while (true) {
            System.out.println("1 - Đăng nhập");
            System.out.println("0 - Thoát chương trình");
            System.out.println("Lựa chọn: ");
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
                                        case STAFF:
                                            staffAccLogin();
                                            break;
                                        case PROJECT_MANAGER:
                                            projectManagerLogin();
                                            break;
                                        case ADMIN:
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
                                checkInService.checkIn(checkInCheckOut, staff);
                                System.out.println("Đã check in thành công vào lúc: " + LocalTime.now().format(formatter));
                                staffAccLogin();
                                break;
                            case 2:
                                checkInService.checkOut(checkInCheckOut, staff);
                                System.out.println("Đã check out thành công vào lúc: " + LocalTime.now().format(formatter));
                                menu();
                                break;
                            case 3:
                                checkInService.showStaff(checkInCheckOut, staff);
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
                                taskService.showStaff(taskArrayList, staff);
                                System.out.println("Nhập id task cần update tiến độ");
                                int id = sc.nextInt();
                                sc.nextLine();
                                taskService.updateState(taskArrayList, staff, id);
                                System.out.println("Cập nhật trạng thái thành công");
                                staffAccLogin();
                                break;
                            case 3:
                                taskService.showStaff(taskArrayList, staff);
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
                    switch (chosen) {
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
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public static void projectManagerLogin() {
        Employee projectManager = new Employee();
        for (Employee e : employees) {
            if (e.getEmail().equals(employee.getEmail())) {
                projectManager = e;
            }
        }
        while (true) {
            System.out.println("1 - Chấm công");
            System.out.println("2 - Quản lý task công việc");
            System.out.println("3 - Phê duyệt");
            System.out.println("4 - Thay đổi thông tin cá nhân");
            System.out.println("0 - Đăng xuất");
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
                                checkInService.checkIn(checkInCheckOut, projectManager);
                                System.out.println("Đã check in thành công vào lúc: " + LocalTime.now().format(formatter));
                                projectManagerLogin();
                                break;
                            case 2:
                                checkInService.checkOut(checkInCheckOut, projectManager);
                                System.out.println("Đã check out thành công vào lúc: " + LocalTime.now().format(formatter));
                                menu();
                                break;
                            case 3:
                                checkInService.showStaff(checkInCheckOut, projectManager);
                                break;
                            case 0:
                                projectManagerLogin();
                                break;
                            default:
                                System.out.println("Không có lựa chọn này");
                                break;
                        }
                    }
                case 2:
                    taskService.show(taskArrayList);
                    break;
                case 3:
                    approveService.show(approves);
                    System.out.println("nhập id yêu cầu phê duyệt");
                    int approveId = sc.nextInt();
                    approveService.approved(approves, approveId);
                    break;
                case 4:
                    System.out.println("1 - Đổi email");
                    System.out.println("2 - Đổi password");
                    System.out.println("3 - Đổi số điện thoại");
                    int chosen = sc.nextInt();
                    sc.nextLine();
                    switch (chosen) {
                        case 1:
                            service.changeEmail(projectManager);
                            break;
                        case 2:
                            service.changePassword(projectManager);
                            break;
                        case 3:
                            service.changeTel(projectManager);
                            break;
                        default:
                            System.out.println("Không có lựa chọn này");
                            break;
                    }
                case 0:
                    menu();
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public static void adminLogin() {
        Employee admin = new Employee();

        for (Employee e : employees) {
            if (e.getEmail().equals(employee.getEmail())) {
                admin = e;
            }
        }
        while (true) {
            System.out.println("1 - Chấm công");
            System.out.println("2 - Yêu cầu phê duyệt");
            System.out.println("3 - Thay đổi thông tin cá nhân");
            System.out.println("4 - Đăng kí tài khoản mới");
            System.out.println("0 - Đăng xuất");
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
                                checkInService.checkIn(checkInCheckOut, admin);
                                System.out.println("Đã check in thành công vào lúc: " + LocalTime.now().format(formatter));
                                adminLogin();
                                break;
                            case 2:
                                checkInService.checkOut(checkInCheckOut, admin);
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
                    while (true) {
                        System.out.println("1 - Viết yêu cầu phê duyệt");
                        System.out.println("2 - Xem yêu cầu phê duyệt");
                        System.out.println("3 - Về Menu trước");
                        int chosen = sc.nextInt();
                        sc.nextLine();
                        switch (chosen) {
                            case 1:
                                approveService.addApprove(approves, admin);
                                System.out.println("Gửi yêu cầu phê duyệt thành công");
                                break;
                            case 2:
                                approveService.show(approves);
                                break;
                            case 3:
                                adminLogin();
                                break;
                            default:
                                System.out.println("Không có lựa chọn này");
                                break;
                        }
                    }

                case 3:
                    while (true) {
                        service.show(employees);
                        System.out.println("Nhập id người cần thay đổi thông tin: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.println("1 - Thay đổi email");
                        System.out.println("2 - Thay đổi password");
                        System.out.println("3 - Thay đổi số điện thoại");
                        System.out.println("4 - Thay đổi vị trí");
                        System.out.println("0 - Về Menu trước");
                        System.out.println("Lựa chọn: ");
                        int chosen = sc.nextInt();
                        sc.nextLine();
                        switch (chosen) {
                            case 1:
                                for (Employee e : employees) {
                                    if (e.getId() == id) {
                                        service.changeEmail(e);
                                    }
                                }
                                break;
                            case 2:
                                for (Employee e : employees) {
                                    if (e.getId() == id) {
                                        service.changePassword(e);
                                    }
                                }
                                break;
                            case 3:
                                for (Employee e : employees) {
                                    if (e.getId() == id) {
                                        service.changeTel(e);
                                    }
                                }
                                break;
                            case 4:
                                for (Employee e : employees) {
                                    if (e.getId() == id) {
                                        service.changePosition(e);
                                    }
                                }
                                break;
                            case 0:
                                adminLogin();
                                break;
                            default:
                                System.out.println("Không có lựa chọn này");
                                break;
                        }
                        adminLogin();
                    }
                case 4:
                    service.addAccount(employees);
                    System.out.println("Tạo acc thành công");
                    break;
                case 0:
                    menu();
                    break;
            }
        }
    }
}
