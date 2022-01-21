import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PersonModel a = new PersonModel();

        a.add(new Student(1,"123",25));
        a.add(new Employee(3,"df",40));
        a.display();
    }
}
