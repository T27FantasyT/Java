import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {

    Scanner sc = new Scanner(System.in);

    public ArrayList<Customer> getCustomerInfo(){
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("KH000001","Silvia Kyrkeman", LocalDate.of(1994,01,21),Sex.MALE,"Hà Nội","0981111112","fdsf@gmail.com"));
        customers.add(new Customer("KH000002","ASD ", LocalDate.of(1999,04,21),Sex.MALE,"Hà Nội","0981114352","f344f@gmail.com"));
        customers.add(new Customer("KH000003","ASDG ", LocalDate.of(1999,04,21),Sex.FEMALE,"Hà Nội","0981114352","f344f@gmail.com"));
        customers.add(new Customer("KH000004","ASDC ", LocalDate.of(1923,07,31),Sex.FEMALE,"Phú Thọ","09815414355","f3fff4f@gmail.com"));
    return customers;
    }

    public void showCustomerInfo(ArrayList<Customer> customers){
        for(Customer c : customers){
            System.out.println(c);
        }
    }

    public void showCustomerInfo(ArrayList<Customer> customers,Sex sex){
        for (Customer c: customers){
            if(c.getSex().equals(sex)){
                System.out.println(c);
            }
        }
    }

    public Customer createCustomer(ArrayList<Customer> customers){
        System.out.println("Nhập Id: ");
        String id = sc.nextLine();
        if
    }





}
