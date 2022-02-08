public class Task {
    private Employee employee;
    private int id;
    private String task;
    private State state;

    public Task(Employee employee, int id, String task, State state) {
        this.employee = employee;
        this.id = id;
        this.task = task;
        this.state = state;
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

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Số thứ tự " + id + " Tên nhân viên " + employee.getName() + " đầu việc " + task + " tình trạng " + state;
    }
}
