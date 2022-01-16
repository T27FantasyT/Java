import java.util.Scanner;

public class IsTriangle {

    public double input() {
        Scanner sc = new Scanner(System.in);
        double number = 0;
        boolean istrue = true;
        while (istrue) {
            try {
                number = Double.parseDouble(sc.nextLine());
                if(number<=0) throw new CustomException("Khong hop le");
                istrue = false;
            } catch (CustomException e) {
                System.out.println(e.getMessage());
                System.out.println("Nhap lai");
            } catch (NumberFormatException e){
                System.out.println("Nhập số vào: ");
            }
        }
        return number;
    }

    public boolean isTriangle(){
        System.out.println("Nhập cạnh a: ");
        double a = input();
        System.out.println("Nhập cạnh b: ");
        double b = input();
        System.out.println("Nhập cạnh c: ");
        double c = input();
        if(((a+b)>c)&&((b+c)>a)&&((c+a)>b)) return true;
        else return false;
    }
}
