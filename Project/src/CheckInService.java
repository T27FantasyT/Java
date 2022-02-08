import java.time.LocalTime;
import java.util.ArrayList;

public class CheckInService {

    public void checkin(ArrayList<String> checkInCheckOut,Employee employee){
        checkInCheckOut.add(employee.getName() + " Giờ check in " + LocalTime.now());

    }

    public void checkOut(ArrayList<String> checkInCheckOut,Employee employee){
        checkInCheckOut.add(employee.getName() + " Giờ check Out " + LocalTime.now());

    }

    public void show(ArrayList<String> checkInCheckOut){
        for(String s : checkInCheckOut){
            System.out.println(s);
        }
    }
}
