public class Validate {
    public static void validateWeight(double weight) throws CustomException {
        if(weight<=0) throw new CustomException("Can nang phai > 0");
    }

    public static void validateHeigh(double heigh) throws CustomException {
        if(heigh<=0) throw new CustomException("Chieu cao phai > 0");
    }
}
