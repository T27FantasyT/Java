public class Main {
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        while (true) {
            int n = primeNumber.checkPrimeNumber();
            if (primeNumber.isPrimeNumber(n)) {
                System.out.println(n + " là số nguyên tố");
            } else System.out.println(n + " không là số nguyên tố");
        }
    }
}
