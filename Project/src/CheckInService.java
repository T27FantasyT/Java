import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

public class CheckInService {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    Random random = new Random();
    CheckIn checkIn = new CheckIn();

    public void checkIn(ArrayList<CheckIn> checkInCheckOut,Employee employee){
        checkIn.setId(random.nextInt(100));
        checkIn.setEmployee(employee);
        checkIn.setCheckIn(LocalDateTime.now().format(formatter));
        checkIn.setCheckOut("");
        checkInCheckOut.add(checkIn);
    }
    public void checkOut(ArrayList<CheckIn> checkInCheckOut){
        for(CheckIn c : checkInCheckOut){
            if(c.getId()==checkIn.getId()){
                c.setCheckOut(LocalDateTime.now().format(formatter));
            }
        }
    }
    public void showStaff(ArrayList<CheckIn> checkInCheckOut,Employee employee){
        for(CheckIn c : checkInCheckOut){
            if(c.getEmployee()==employee){
                System.out.println(c);
            }
        }
    }

    public void show(ArrayList<CheckIn> checkInCheckOut){
        for(CheckIn c : checkInCheckOut){
            System.out.println(c);
        }
    }
}
