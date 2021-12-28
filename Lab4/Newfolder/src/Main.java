import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] arr = ArrayExample.createArray();

        for(int element: arr){
            System.out.println(element);
        }

        Arrays.sort(arr);
        ArrayExample.printArray(arr);

        String str = Arrays.toString(arr);
        System.out.println(str);

        String mobile = "0123456";
        String regexMibile = "\\s";
        String abc = "Nguyen  van Tien";

        abc.replaceAll("\\s+")
        System.out.println(abc);

//        if(mobile.matches(regexMibile)){
//            System.out.println("Số điện thoại hợp lệ");
//        }else {
//            System.out.println("Số điện thoại không hợp lệ");
//        }
//
//        String email = "ngoc@techmaster.vn";
//        String regexEmail = "^(.+)@(\\S+)$";
//
//        if(email.matches(regexEmail)){
//            System.out.println("Email hợp lệ");
//        }else{
//            System.out.println("Email không hợp lệ");
//        }




//
//        System.out.println("Mảng ban đầu");
//        ArrayExample.printArray(arr);
//
//        System.out.println("Phần tử nhỏ nhất là: " +ArrayExample.getMin(arr));
//
//
//        System.out.println("Mảng sau khi sắp xếp: ");
//        ArrayExample.sortArray(arr);
//        ArrayExample.printArray(arr);
//
//        String name = "Lục   Thanh Ngọc";
//        name = name.replaceAll("\\s+", " ");
//        System.out.println(name);
//
//        String[] strArray = name.split("\s");
//        for(int i = 0; i < strArray.length; i++){
//            System.out.println(strArray[i]);
//        }
//
//
//        int[] numbers = ArrayExample.inputArray();
//        System.out.println("Mảng vừa tạo là: ");
//        ArrayExample.printArray(numbers);
//        System.out.println("Mảng vừa tạo:  ");
//        for(int i = 0; i < intArray.length; i++){
//            System.out.print(intArray[i] + "\t");
//        }
//        System.out.println();
//
//        System.out.println("Các phần tử là số chẵn: ");
//        for(int i = 0; i < intArray.length; i++){
//            if(intArray[i] % 2 == 0){
//                System.out.print(intArray[i] + "\t");
//            }
//        }
//        System.out.println();
//        //System.out.println(intArray[4]);
//
//        int min = intArray[0];
//        int max = intArray[0];
//        for(int i = 0; i < intArray.length; i++){
////            System.out.printf("min = %d\n",min);
////            System.out.printf("intArray[%d] = %d\n", i , intArray[i]);
//            if(min > intArray[i]){
//                min = intArray[i];
//            }
//
//            if(max < intArray[i]){
//                max = intArray[i];
//            }
//        }
//
//        System.out.println("Phần tử nhỏ nhất: " +min);
//        System.out.println("Phần tử lớn nhất: " +max);
//
//        //Sắp xếp tăng dần
//
//        for(int i = 0; i < intArray.length; i++){
//            for(int j = i+1; j < intArray.length; j++ ){
//                if(intArray[i] > intArray[j]){
//                    int temp = intArray[i];
//                    intArray[i] = intArray[j];
//                    intArray[j] = temp;
//                }
//            }
//        }
//
//        System.out.println("Mảng sau khi sắp xếp:  ");
//        for(int i = 0; i < intArray.length; i++){
//            System.out.print(intArray[i] + "\t");
//        }
//        System.out.println();

//        String[] strArray = new String[5];
//        strArray[0] = "Java";
//        strArray[1] = "HTML/CSS";
//        strArray[2] = "JS";
//        strArray[3] = "MySQL";
//        strArray[4] = "Python";
//
//        for (int i = 0; i < strArray.length; i++){
//            System.out.println(strArray[i]);
//        }
//
//        strArray[2] = "Ruby";
//        System.out.println("Mảng sau khi  sửa: ");
//        for (int i = 0; i < strArray.length; i++){
//            System.out.println(strArray[i]);
//        }


        //Mangr 2 chiều

        MultiArray.createArray();
    }
}