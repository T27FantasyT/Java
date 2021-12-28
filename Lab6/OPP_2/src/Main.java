public class Main {
    public static void main(String[] args) {

    Services services = new Services();
    Student[] students = services.addstudent(1);
    services.info(students);

    }
}
