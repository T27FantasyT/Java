import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        simpleEquation();

    }
    public static void simpleEquation(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tham số a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập vào tham số b: ");
        double b = sc.nextDouble();

        if (a!=0){
            System.out.println("Nghiệm của phương trình là: "+-b/a);
        } else {
            System.out.println("Phương trình đúng với mọi x");
        }
    }
}
