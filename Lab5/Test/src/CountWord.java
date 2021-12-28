public class CountWord {
    public static void countWord(){
        int countWord  = 1;
        String str = "You only live once, but if you do it right, once is enough";
        for(int i =0; i<str.length();i++){
            if (str.charAt(i) == ' '){
                countWord++;
            }
        }
        System.out.println("Số từ trong chuỗi là: "+countWord);

        int countO=1;
        for ( int i = 0; i<str.length();i++){
            if (str.charAt(i) == 'o') {
                int j = i + 1;
                System.out.println("Kí tự 'o' thứ " + countO + " ở vị trí thứ " + j);
                countO++;
            }
        }

    }
}
