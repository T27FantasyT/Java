import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
//        Student student = new Student(1,"Name", LocalDate.of(1994,1,24),"java",8);
//        System.out.println(student);
//        Teacher teacher = new Teacher(2,"teacher name", LocalDate.of(1995,2,2),"Java2",8000000l);
//        System.out.println(teacher);

        SchoolBook book = new SchoolBook(1,"Book1","company1","1994",2000,300,true,20);
        System.out.println(book);

        Calculator cal = new Calculator();
        cal.sum(5,1);
        cal.sum(5.4,5.5);
        cal.sum(5,6,3);
    }
}
