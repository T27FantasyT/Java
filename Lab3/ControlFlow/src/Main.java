
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
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


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập vào tháng: ");
//        int switchValue = sc.nextInt();
//
//        switch (switchValue){
//            case 1,3,5,7,8,10,12:
//                System.out.println("Tháng "+switchValue+" có 31 ngày");
//                break;
//            case 2:
//                System.out.println("Tháng 2 có 28 hoặc 29 ngày");
//                break;
//            case 4,6,9,11:
//                System.out.println("Tháng "+switchValue+" có 30 ngày");
//                break;
//            default:
//                System.out.println("Invalid Number");
//                break;
//        }

//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0) {
//                if (i % 5 == 0) {
//                    System.out.println("FizzBuzz");
//                } else {
//                    System.out.println("Fizz");
//                }
//            } else {
//                if (i % 5 == 0) {
//                    System.out.println("Buzz");
//                } else {
//                    System.out.println(i);
//                }
//            }
//        }
//
//        Random rd= new Random();
//        int rdNumber=0;
//        while(rdNumber<10){
//            rdNumber = rd.nextInt(20);
//            System.out.println(rdNumber);

//        }
//
//        double height;
//        do {
//            System.out.println("Nhap chieu cao ");
//            height = sc.nextDouble();
//        } while (height < 0 || height>2.5);
//
//        double weight;
//        do{
//            System.out.println("Nhap can nang ");
//            weight = sc.nextDouble();
//        }while(weight<0||weight>100);
//
//        double bmi = weight/Math.pow(height,2);
//        System.out.println("bmi = "+bmi);

        Random rd = new Random();
        int numBer;
        boolean conTinue = true;
        int rdNumber = rd.nextInt(100);
        System.out.println(rdNumber);
        while(conTinue){
            numBer=sc.nextInt();
            if (numBer==rdNumber){
                conTinue=false;
            } else if(numBer<rdNumber){
                System.out.println("ban doan nho hon roi ");
            } else {
                System.out.println("ban doan lon hon roi");
            }
        }

    }


}
