
public class Task {
    private int id;
    private String time;
    private Employee employee;
    private String task;
    private State state;

    public Task(int id, String time, Employee employee, String task, State state) {
        this.id = id;
        this.time = time;
        this.employee = employee;
        this.task = task;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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
        return "Id " + id +" - Thời gian: " + time + " - Tên nhân viên: " + employee.getName() + " - Nội dung công việc: " + task + " - Tình trạng: " + state.getValue();
    }
}
