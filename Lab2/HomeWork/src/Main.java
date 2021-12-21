import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //chương trình so sánh chuỗi
        stringCheck();

        //chương trình tính điểm
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào điểm lý thuyết: ");
        int theoryPoint = sc.nextInt();
        System.out.println("Nhập vào điểm thực hành: ");
        int practicalPoint = sc.nextInt();
        String result = point(theoryPoint,practicalPoint) < 6 ? "Hơi đen, bạn đã thi trượt" : "Đạt rồi!";
        System.out.println(result);

    }
    public static void stringCheck(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi 1: ");
        String str1 = sc.nextLine();
        System.out.println("Nhập vào chuỗi 2: ");
        String str2 = sc.nextLine();
        String result = str1.equals(str2) ? "Hai chuỗi bằng nhau" : "Hai chuỗi không bằng nhau";
        System.out.println(result);

        String result2 = str1.length() == str2.length() ? "Kích thước hai chuỗi bằng nhau" : "Kích thước hai chuỗi khác nhau";
        System.out.println(result2);
    }
    public static int point(int theoryPoint, int practicalPoint){
        return (theoryPoint+practicalPoint)/2;
    }
}
