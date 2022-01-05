public class Kitchen extends Employee{
    private long serviceCharge;

    public Kitchen(int id, String name, int age, long basicSalary, long serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;

    }

    public long getServiceCharge() {
        return serviceCharge;
    }

    @Override
    public long calculatorSalary() {
        return getBasicSalary() + getServiceCharge();
    }

    @Override
    public String toString() {
        return "Nhân viên đứng bếp: Id: "+ getId() + " Tên: "+ getName() + " Thu nhập: " + calculatorSalary();
    }
}
