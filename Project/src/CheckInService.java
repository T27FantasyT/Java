import java.time.LocalTime;
import java.util.ArrayList;

public class CheckInService {
    ArrayList<String> checkInCheckOut = new ArrayList<>();
    public ArrayList<String> checkin(Employee employee){
        checkInCheckOut.add(employee.getName() + "Giờ check in " + LocalTime.now());

        return checkInCheckOut;
    }

    public ArrayList<String> checkOut(Employee employee){
        checkInCheckOut.add(employee.getName() + " Giờ check Out " + LocalTime.now());

        return checkInCheckOut;
    }
}
