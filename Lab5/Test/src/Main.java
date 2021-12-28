public class Main {
    public static void main(String[] args) {

        //Câu 1:

        SquarePrint.squarePrint();
        System.out.println();
        SquarePrint.triAnglePrint();

        //Câu 2:

        CountWord.countWord();

        //Câu 3:
        boolean primeNumber = PrimeNumber.isPrimeNumber(PrimeNumber.randomNumber());
        if (primeNumber) {
            System.out.println("Random number là số nguyên tố");
        } else System.out.println("Random number không phải là số nguyên tố");

        //Câu 4:
        PrimeNumber.theFirstTenPrimeNumber();
        PrimeNumber.primeNumberLessThanTen();

        //Câu 5:
        StringTest.standardizedString();
        StringTest.palindromeStringTest();

        //Câu 6:
        int[][] arr = Array.createArray();
        Array.printArray(arr);
        Array.principalDiagonalCheck(arr);
    }

}
