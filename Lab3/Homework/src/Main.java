import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Chương trình đếm số kí tự
        charCount();

        //Chương trình giải phương trình bậc nhất

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào hệ số a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập vào tham số b: ");
        double b = sc.nextDouble();
        if (a != 0) {
            System.out.printf("Nghiệm của phương trình là x= " + simpleEquation(a, b));
        } else {
            System.out.println("Phương trình đúng với mọi x");
        }
    }

    public static void charCount() {
        String str = "You only live once, but if you do it right, once is enough";
        int i = 0;
        int count = 1;

        while (i < str.length()) {
            if (str.charAt(i) == 'o') {
                int j = i + 1;
                System.out.println("Kí tự 'o' thứ " + count + " ở vị trí thứ " + j);
                count++;
            }
            i++;
        }
    }
    public static double simpleEquation(double a, double b) {
        return  -b / a;
    }
}
