import java.util.Scanner;

public class Services {



    public Student createStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết: ");
        double theoryPoint = sc.nextDouble();
        System.out.println("Nhập điểm thực hành: ");
        double practicalPoint = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập tên trường: ");
        String school = sc.nextLine();
        double averagePoint = averagePoint(practicalPoint,theoryPoint);

        Student students = new Student(id,name,theoryPoint,practicalPoint,school,averagePoint);
        return students;

    }

    public double averagePoint(double practicalPoint,double theoryPoint){
        double averagePoint = (practicalPoint+theoryPoint)/2;
        return averagePoint;
    }

    public void info(Student[] students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }
    public Student[] addstudent(int size){
        Student[] students = new Student[size];
        for(int i = 0; i<size; i++){
            students[i] = createStudent();
        }
        return  students;
    }
}
