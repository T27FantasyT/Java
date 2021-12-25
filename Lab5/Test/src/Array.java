import java.util.Scanner;

public class Array {
    public static int[][] createArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng của mảng: ");
        int r = sc.nextInt();
        System.out.println("Nhập số cột của mảng: ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Nhập phần tử arr[%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static int[][] printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        return arr;
    }
    public static int[][] principalDiagonalCheck(int[][] arr){
        System.out.println("Đường chéo chính là: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==j)
                System.out.print(arr[i][j] + "\t");
            }
        }
        return arr;
    }
}
