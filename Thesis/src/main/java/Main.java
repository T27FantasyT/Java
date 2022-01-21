import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GetEmployee employee = new GetEmployee();
        ArrayList<Employee> employeeArrayList = employee.getAllEmployee();
        for(Employee e : employeeArrayList){
            System.out.println(e);
        }
    }
}
