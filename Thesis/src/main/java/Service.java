import java.util.ArrayList;

public class Service {

    ArrayList<Employee> employeeArrayList = new ArrayList<>();

    public boolean accountValidate(ArrayList<Employee> employeeArrayList, String email, String password) {
        for (Employee e : employeeArrayList) {
            if (email.equals(e.getEmail())) {
                return true;
            }
        }
        return false;
    }

    public boolean passwordValidate(ArrayList<Employee> employeeArrayList, String email, String password){
        for(Employee e: employeeArrayList){
            if(e.getEmail().equals(email)){
                if(e.getPassword().equals(password)){
                    System.out.println("chào mừng " + e.getName());
                    return true;
                }
            }
        }
        return false;
    }

    public void forgotPassword(ArrayList<Employee> employeeArrayList, String email, String newPassword) {
        for (Employee e : employeeArrayList) {
            if (email.equals(e.getEmail())) {
                e.setPassword(newPassword);
            }
        }
    }

    public void checkInCheckOut(){

    }


}
