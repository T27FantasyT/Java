public class CheckIn {
    private int id;
    private Employee employee;
    private String checkIn;
    private String checkOut;

    public CheckIn() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Id " + employee.getId() + " - Nhân sự "+ employee.getName() + "- Giờ check in: " + checkIn + " - Giờ check out: " + checkOut;
    }
}
