import java.util.Scanner;

public class BMI {

    public void calcu(){
        System.out.println("Nhap chieu cao: ");
        double heigh = input();
        System.out.println("Nhap can nang: ");
        double weight = input();

        double bmi = weight/Math.pow(heigh,2);
        System.out.println(bmi);
    }
    public double input(){
        Scanner sc = new Scanner(System.in);
        double number = 0;
        boolean isTrue = true;
        while ( isTrue){
            try{
                number = Double.parseDouble(sc.nextLine());
                if(number<=0) throw new CustomException("Khong hop le");
                isTrue = false;
            } catch (CustomException e) {
                System.out.println(e.getMessage());
                System.out.println("vui long nhap lai");
            } catch (NumberFormatException e) {
                System.out.println("Nhap so");
            }
        }
        return  number;

    }
}
