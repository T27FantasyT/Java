import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class GetEmployee {
    public ArrayList<Employee> getAllEmployee(){
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        Gson gson = new Gson();

        try {
            FileReader fileReader = new FileReader("EmployeeList.json");
            Type type = new TypeToken<ArrayList<Employee>>(){}.getType();

            employeeArrayList = gson.fromJson(fileReader,type);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy danh sách nhân viên");;
        }
        return employeeArrayList;

    }
}
