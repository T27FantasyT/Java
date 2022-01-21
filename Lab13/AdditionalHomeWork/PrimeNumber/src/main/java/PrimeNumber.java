import java.util.Scanner;

public class PrimeNumber {
    Scanner sc = new Scanner(System.in);

    public boolean isPrimeNumber(int number) {
            if (number < 2) return false;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        return true;
    }

    public int checkPrimeNumber() {
        int number = 0;
        while(true) {
            System.out.println("Nhập số: ");
            String strNumber = sc.nextLine();
            try {
                if (strNumber.equalsIgnoreCase("x") || strNumber.equalsIgnoreCase("q")) {
                    System.exit(0);
                } else number = Integer.parseInt(strNumber);
                    break;
            } catch (NumberFormatException e) {
                System.out.println("Đã bảo nhập số vào, muốn out thì gõ Q hoặc X :v ");
            }
        }
        return number;
    }

}
