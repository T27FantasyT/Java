package service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import model.*;

public class CheckInService {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    Random random = new Random();
    int id;

    public CheckIn checkIn(ArrayList<CheckIn> checkInCheckOut, Employee employee){
        CheckIn checkIn = new CheckIn(random.nextInt(100),employee,LocalDateTime.now().format(formatter),"-");
        checkInCheckOut.add(checkIn);
        id = checkIn.getId();
        return checkIn;
    }

    public void checkOut(ArrayList<CheckIn> checkInCheckOut, Employee employee){
            for(CheckIn c : checkInCheckOut){
            if(c.getId()==id){
                c.setCheckOut(LocalDateTime.now().format(formatter));
            }
        }

    }
    public void showStaff(ArrayList<CheckIn> checkInCheckOut, Employee employee){
            for (CheckIn c : checkInCheckOut) {
                if (c.getEmployee() == employee) {
                    System.out.println(c);
                }
        }
    }

    public void show(ArrayList<CheckIn> checkInCheckOut){
            for (CheckIn c : checkInCheckOut) {
                System.out.println(c);
            }
    }
}
