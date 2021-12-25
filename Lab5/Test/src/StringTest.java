import java.util.Scanner;

public class StringTest {
    public static void standardizedString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi: ");
        String str = sc.nextLine();
        str = str.trim().toLowerCase();
        str = str.replaceAll("\\s+", " ");
        String result = "";
        String[] wordSplit = str.split(" ");
        for (int i = 0; i < wordSplit.length; i++) {
            wordSplit[i] = wordSplit[i].substring(0, 1).toUpperCase() + wordSplit[i].substring(1);
            result += wordSplit[i];
            if (i < wordSplit.length - 1) {
                result += " ";
            }
        }
        System.out.println("Chuỗi sau khi chuẩn hoá là: " + result);
    }

    public static void palindromeStringTest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi: ");
        String str = sc.nextLine();
        char a;
        for (int i = 0; i < str.length(); i++) {
            a = str.charAt(str.length() - i - 1);

            if (str.charAt(i) == a) {
                System.out.println("Chuỗi này là chuỗi Panlyndrome.");
                break;
            } else {
                System.out.println("Chuỗi này không là chuỗi Panlyndrome.");
                break;
            }

        }


    }
}
