public class Main {
    public static void main(String[] args) {
        //Chương trình tính toán
        System.out.println("Tong cua 2 so la "+ Calculator.addition(23,32));
        System.out.println("Hieu cua 2 so la " + Calculator.subtraction(34,23));
        System.out.println("Tich cua 2 so la " + Calculator.mutiplication(45,34));
        System.out.println("Thuong cua 2 so la " + Calculator.division(34,545));

        //Chương trình tính bmi với Void
        Calculator.BMI();

        //Chương trình tính bmi với Double
        System.out.println("chi so bmi cua ban la " + Calculator.BMI2(80,1.8));

        //Chương trình tính Bmi với double có truyền tham số
        System.out.printf("chi so bmi cua ban la %.2f", Calculator.BMI2(80,1.8));

        /*em thấy cái nào cung giống nhau */
    }
}
