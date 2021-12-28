import java.util.Random;

public class PrimeNumber {
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int randomNumber() {
        Random rd = new Random();
        int number = rd.nextInt();
        System.out.println("Random number là: " + number);
        return number;
    }

    public static void theFirstTenPrimeNumber() {
        int counter = 0;
        int i = 1;
        while (true) {
            i++;
            if (isPrimeNumber(i)) {
                counter++;
                System.out.println("Số nguyên tố thứ " + counter + " là " + i);
                if (counter == 10) break;
            }
        }
    }

    public static void primeNumberLessThanTen() {
        int count = 1;
        for (int i = 0; i < 10; i++) {
            if (isPrimeNumber(i)) {
                System.out.println("Số nguyên tố nhỏ hơn 10 thứ " + count + " là: " + i);
                count++;
            }
        }
    }

}
