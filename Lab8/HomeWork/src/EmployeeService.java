import java.util.Scanner;

public class EmployeeService {

    public Waiter createWaiter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id nhân viên bồi bàn: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên nhân viên bồi bàn: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi nhân viên bồi bàn: ");
        int age = sc.nextInt();
        System.out.println("Nhập lương cơ bản: ");
        long basicSalary = sc.nextLong();
        System.out.println("Nhập tiền bo: ");
        long compensate = sc.nextLong();
        return new Waiter(id,name,age,basicSalary,compensate);
    }


    public Kitchen createKitchen(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id nhân viên đứng bếp: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên nhân viên đứng bếp: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi nhân viên đứng bếp: ");
        int age = sc.nextInt();
        System.out.println("Nhập lương cơ bản: ");
        long basicSalary = sc.nextLong();
        System.out.println("Nhập phí dịch vụ: ");
        long serviceChange = sc.nextLong();
        return new Kitchen(id,name,age,basicSalary,serviceChange);
    }

    public void info(Waiter[] waiter){
        for(Waiter w : waiter){
            System.out.println(w);
        }
    }

    public void info(Kitchen[] kitchen){
        for(Kitchen k : kitchen){
            System.out.println(k);
        }
    }

    public Waiter[] addWaiter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nhân viên bồi bàn: ");
        int size = sc.nextInt();
        Waiter[] waiter = new Waiter[size];
        for (int i = 0; i<size; i++){
            waiter[i] = createWaiter();
        }
        return waiter;
    }

    public Kitchen[] addKitchen(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nhân viên đứng bếp: ");
        int size = sc.nextInt();
        Kitchen[] kitchen = new Kitchen[size];
        for (int i = 0; i<size; i++){
            kitchen[i] = createKitchen();
        }
        return kitchen;
    }


}
