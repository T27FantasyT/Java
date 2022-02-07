public class Task {
    private Employee employee;
    private String task;
    private State state;

    public Task(Employee employee, String task, State state) {
        this.employee = employee;
        this.task = task;
        this.state = state;
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
        return employee.getName() + " đầu việc " + task + " tình trạng " + state;
    }
}
