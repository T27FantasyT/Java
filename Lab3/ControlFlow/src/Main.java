import java.time.DayOfWeek;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap vao canh a ");
//        double a = sc.nextDouble();
//        System.out.println("Nhap vao canh b ");
//        double b = sc.nextDouble();
//        System.out.println("Nhap vao canh c ");
//        double c = sc.nextDouble();
//
//        if((a+b)<c||((b+c)<a)||(a+c)<b){
//            System.out.println("Khong phai la tam giac");
//        }else {
//            System.out.println("la tam giac");
//        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tháng: ");
        int switchValue = sc.nextInt();

        switch (switchValue){
            case 1,3,5,7,8,10,12:
                System.out.println("Tháng "+switchValue+" có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng 2 có 28 hoặc 29 ngày");
                break;
            case 4,6,9,11:
                System.out.println("Tháng "+switchValue+" có 30 ngày");
                break;
            default:
                System.out.println("Invalid Number");
                break;

        }
    }
}
