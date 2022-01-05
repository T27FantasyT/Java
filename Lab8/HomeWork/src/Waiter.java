public class Waiter extends Employee{
    private long compensate;

    public Waiter(int id, String name, int age, long basicSalary, long compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    public long getCompensate() {
        return compensate;
    }

    @Override
    public long calculatorSalary() {
        return getBasicSalary() + getCompensate();
    }

    @Override
    public String toString() {
        return "Nhân viên bồi bàn: Id: "+ getId() + " Tên: "+ getName() + " Thu nhập: " + calculatorSalary();
    }
}
