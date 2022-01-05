public abstract class Employee {
    private int id;
    private String name;
    private int age;
    private long basicSalary;

    public Employee(int id, String name, int age, long basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getBasicSalary() {
        return basicSalary;
    }

    public abstract long calculatorSalary();

}
