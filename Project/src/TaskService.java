import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TaskService {

    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public Task createTask(Employee employee){
        int id = random.nextInt(100);
        System.out.println("Nhập nội dung công việc: ");
        String task = sc.nextLine();
        State state = null;
        boolean isTrue = true;
        while(isTrue){
            System.out.println("Nhập trạng thái: ");
            System.out.println("1 - Đã hoàn thành: \n2 - Chưa hoàn thành: ");
            int choose = sc.nextInt();
            sc.nextLine();
            switch (choose){
                case 1: state = State.COMPLETE;
                isTrue = false;
                break;
                case 2: state = State.INCOMPLETE;
                isTrue = false;
                break;
                default:
                    System.out.println("Không có lựa chọn này: ");
                    break;
            }
        }
        return new Task(id,LocalDateTime.now().format(formatter), employee, task ,state);
    }

    public void addTask(ArrayList<Task> taskArrayList,Employee employee){
        taskArrayList.add(createTask(employee));
    }

    public void showStaff(ArrayList<Task> taskArrayList,Employee employee){
        for(Task t : taskArrayList){
            if(t.getEmployee()==employee){
                System.out.println(t);
            }
        }
    }

    public void updateState(ArrayList<Task> taskArrayList, Employee employee,int id){
        for(Task t : taskArrayList){
            if(t.getEmployee()==employee&&t.getId()==id){
                boolean isTrue = true;
                while(isTrue){
                    System.out.println("Nhập trạng thái: ");
                    System.out.println("1 - Đã hoàn thành: \n2 - Chưa hoàn thành: ");
                    int choose = sc.nextInt();
                    sc.nextLine();
                    switch (choose){
                        case 1: t.setState(State.COMPLETE);
                            isTrue = false;
                            break;
                        case 2: t.setState(State.INCOMPLETE);
                            isTrue = false;
                            break;
                        default:
                            System.out.println("Không có lựa chọn này: ");
                            break;
                    }
                }
            }
        }
    }

}
