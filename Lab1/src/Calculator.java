public class Calculator {
    public static int addition(int a, int b){
        return a + b;
    }

    public static int  subtraction(int a, int b){
        return a-b;
    }

    public static long mutiplication(long a, long b){
        return a*b;
    }

    public static double division(double a, double b){
        return a/b;
    }

    public static void BMI(){
        float weight = 80;
        float height = 1.8f;
        float bmi=weight/(height*height);
        System.out.println("chi so ibm cua ban la " + bmi);
    }

    public static double BMI2(double weight, double height){
        return weight/(height*height);
    }
}
