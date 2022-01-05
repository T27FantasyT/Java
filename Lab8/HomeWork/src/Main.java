public class Main {
    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeService();
        Waiter[] waiters = employeeService.addWaiter();
        Kitchen[] kitchens = employeeService.addKitchen();

        employeeService.info(waiters);
        employeeService.info(kitchens);


    }
}
