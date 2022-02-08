import java.util.ArrayList;
import java.util.Scanner;

public class TaskService {

    Scanner sc = new Scanner(System.in);

    public Task createTask(Employee employee){
        System.out.println("Nhập Id: ");
        int id = sc.nextInt();
        sc.nextLine();
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
        return new Task(employee, id, task,state);
    }

    public ArrayList<Task> addTask(ArrayList<Task> taskArrayList,Employee employee){
        taskArrayList.add(createTask(employee));
        return taskArrayList;
    }

    public void show(ArrayList<Task> taskArrayList){
        for(Task t : taskArrayList){
            System.out.println(t);
        }
    }

    public void updateState(ArrayList<Task> taskArrayList, Employee employee){
        for(Task t : taskArrayList){
            if(t.getEmployee()==employee){
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
