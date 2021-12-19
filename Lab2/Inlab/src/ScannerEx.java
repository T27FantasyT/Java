import java.util.Random;
import java.util.Scanner;

public class ScannerEx {

    public static void usingScanner(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap ten ban: ");
//        String name = sc.nextLine();
//        System.out.println("nhap tuoi ban: ");
//        int yearolds = Integer.parseInt(sc.nextLine());
//        //sc.nextLine();
//
//        System.out.println("nhap dia chi cua ban: ");
//        String address = sc.nextLine();
//
//        System.out.println("ten cua toi la "+ name);
//        System.out.println("tuoi cua ban la "+ yearolds);
//        System.out.println("dia chi cua ban la "+ address);
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap so bat ki");
//
//        int number =sc.nextInt();
//        Random rd = new Random();
//        int rdNumber = rd.nextInt(100);
//
//        System.out.println(rdNumber);
//
//        String rs = number==rdNumber ? "2 so bang nhau" : "2 so khac nhau";
//        System.out.println(rs);

        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap canh a: ");
        int a = sc.nextInt();
        System.out.println("nhap canh b: ");
        int b = sc.nextInt();
        System.out.printf("canh c la: %.2f", Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));



    }
}
