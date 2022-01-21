import java.time.LocalDate;

public class CheckInCheckOut {
    LocalDate checkIn;
    LocalDate checkOut;
    Employee employee;

    public CheckInCheckOut(LocalDate checkIn, LocalDate checkOut, Employee employee) {
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.employee = employee;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return employee.getName() + checkIn + checkOut;
    }
}
