import java.util.ArrayList;
import java.util.Scanner;

public class TaskService {

    ArrayList<Task> taskArrayList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Task createTask(Employee employee){
        System.out.println("Nhập nội dung công việc: ");
        String task = sc.nextLine();
        State state = null;
        boolean isTrue = true;
        while(isTrue){
            System.out.println("Nhập tình trạng: ");
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
        return new Task(employee,task,state);
    }

    public ArrayList<Task> addTask(Employee employee){
        taskArrayList.add(createTask(employee));
        return taskArrayList;
    }

}
