import java.util.Scanner;

public class MultiArray {
    public static void createArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap kich thuoc ma tran vuong ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i<3; i++){
            for (int j = 0;j<arr[i].length;j++){
                arr[i][j]= sc.nextInt();
            }
        }
    }
}
