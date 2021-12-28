import java.util.Scanner;

public class Student {
    public int id;
    public String name;
    public double theoryPoint;
    public double practicalPoint;
    public String school;
    public double averagePoint;

    public Student(int id,String name, double theoryPoint, double practicalPoint, String school,double averagePoint) {
        this.id = id;
        this.name = name;
        this.theoryPoint = theoryPoint;
        this.practicalPoint = practicalPoint;
        this.school = school;
        this.averagePoint = averagePoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", theoryPoint=" + theoryPoint +
                ", practicalPoint=" + practicalPoint +
                ", school='" + school + '\'' +
                ", averagePoint=" + averagePoint +
                '}';
    }
}
