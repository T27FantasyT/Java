package model;

public class Approve {
    private int id;
    private ApproveState state;
    private String time;
    private String detail;
    private Employee employee;
    private String price;

    public Approve(int id, ApproveState state, String time, String detail, Employee employee, String price) {
        this.id = id;
        this.state = state;
        this.time = time;
        this.detail = detail;
        this.employee = employee;
        this.price = price;
    }

    public Approve(int id, String time, String detail, Employee employee, String price) {
        this(id, ApproveState.NOT_APPROVE_YET,time,detail, employee, price);
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ApproveState getState() {
        return state;
    }

    public void setState(ApproveState state) {
        this.state = state;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "ID " + id + " - Thời gian: "+ time
                + " - Người gửi yêu cầu: " + employee.getName()
                + " - Nội dung: " + detail
                + " - Chi phí: " + price
                + " - Tình trạng: " + state;
    }
}
