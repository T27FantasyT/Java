public class Main {
    public static void main(String[] args) {
        String[] arr = Array.createArray();
        Array.printArray(arr);
        int count = Array.countJava(arr);
        System.out.println("Số lần Java xuất hiện: "+ count +"");
        Array.checkStringLocation(arr);

    }
}
