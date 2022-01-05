import java.time.LocalDate;

public class Tester extends Employee{

    private int bugs;

    public Tester(int id, String name, LocalDate dateOfBirth, long salary, int bugs) {
        super(id, name, dateOfBirth, salary);
        this.bugs = bugs;
    }

    public int getBugs() {
        return bugs;
    }

    public void setBugs(int bugs) {
        this.bugs = bugs;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + bugs ;
    }

    @Override
    public long salaryCalcu() {
        return getSalary()+(bugs*50000);
    }
}
