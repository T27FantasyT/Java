import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    static Scanner sc = new Scanner(System.in);
    static Service service = new Service();
    static TaskService taskService = new TaskService();
    static ArrayList<Employee> employees = service.getEmployee();
    static Employee employee = new Employee();

    public static void menu(){
        System.out.println("1 - Đăng nhập");
        System.out.println("2 - Đăng kí tài khoản");
        System.out.println("Lựa chọn: ");
        while(true){
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1:
                    System.out.println("Nhập email: ");
                    String email = sc.nextLine();
                    System.out.println("Nhập mật khẩu: ");
                    String password = sc.nextLine();
                    if(service.login(email,password)){
                        employee.setEmail(email);
                        for(Employee e : employees){
                            if(email.equals(e.getEmail())){
                                switch (e.getPosition()){
                                    case "Staff": staffAccLogin();
                                    break;
                                    case "Project Manager": projectManagerLogin();
                                    break;
                                    case "Admin" : adminLogin();
                                    break;
                                }
                            }
                        }
                    } else {
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

    public static void staffAccLogin(){
        System.out.println("1 - Chấm công");
        System.out.println("2 - Nhập task công việc");
        System.out.println("3 - Thay đổi thông tin cá nhân");
    }

    public static void projectManagerLogin(){

    }

    public static void adminLogin(){

    }


}
