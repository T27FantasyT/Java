import java.util.Scanner;

public class Array {
    public static String[] createArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        String[] arr = new String[n];

        for (int i =0; i<n;i++){
            System.out.printf("Nhập phần tử Ar[%d]: ", i);
            arr[i] = sc.nextLine();
        }
        return arr;
    }
    public static void printArray(String[] arr){
        for(int i = 0 ; i<arr.length;i++){
            System.out.printf(arr[i]+"\t");
        }
        System.out.println();

    }
    public static int countJava(String[] arr){
        int count = 0;
        for(int i = 0; i< arr.length;i++){
            if(arr[i].equals("Java")){
                count++;
            }
        }
        return count;
    }
    public static String[] checkStringLocation(String[] arr){
        System.out.println("Nhập vào chuỗi: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for( int i = 0 ; i<arr.length ; i++){
            if(str.equals(arr[i])){
                System.out.printf("chuỗi đó nằm ở phần tử Ar[%d]",i);
            }
        }
        return arr;
    }
}
