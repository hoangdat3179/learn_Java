package vn.techmaster;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Bài 1
//        int canh = 4;
//        for (int i=0; i< canh ; i++){
//            for ( int j =0 ; j < canh; j++){
//                System.out.print("*" + "\t");
//            }
//            System.out.println();
//        }

//        int h = 4;
//        for( int i=0; i< h;i++){
//            for( int j=0; j < i+1; j++){
//                System.out.print("*" + "\t");
//            }
//            System.out.println();
//        }
        //Câu 2
//        String chuoi = "You only live once, but if you do it right, once is enough";
//        System.out.println("số từ trong chuỗi là: "+ chuoi.length());
//        char kyTu = 'o';
//        int count = 0;
//        for (int i = 0; i < chuoi.length(); i++) {
//            if (chuoi.charAt(i) == kyTu) {
//                count++;
//            }
//        }
//        System.out.println("Số lần xuất hiện của ký tự " + kyTu +
//                " trong chuỗi " + chuoi + " là " + count);
//    }
//}


        //Câu 3
//        Random rd = new Random();
//        int randomnumber = rd.nextInt(100);
//            if (isPrimeNumber(randomnumber)) {
//                System.out.println(randomnumber + "Là số nguyên tố");
//            }else {
//                System.out.println(randomnumber + " " + "Không phải là số nguyên tố");
//            }
//
//    }
//        public static boolean isPrimeNumber(int n) {
//            if (n < 2) {
//                return false;
//            }
//            int squareRoot = (int) Math.sqrt(n);
//            for (int i = 2; i <= squareRoot; i++) {
//                if (n % i == 0) {
//                    return false;
//                }
//            }
//            return true;
//        }

        //Câu 4

//        System.out.println("10 số nguyên tố đầu tiên là: ");
//        for (int i = 2; i < 30; i++) {
//            if (isPrimeNumber(i)) {
//                System.out.print(i+ "\t");
//            }
//        }
//        System.out.println();
//        System.out.println("Các số nguyên tố nhỏ hơn 10 là: ");
//        for (int i=2;i < 10;i++){
//            if (isPrimeNumber(i)) {
//                System.out.print(i+ "\t");
//            }
//        }
//    }
//        public static boolean isPrimeNumber(int n) {
//            if (n < 2) {
//                return false;
//            }
//            int squareRoot = (int) Math.sqrt(n);
//            for (int i = 2; i <= squareRoot; i++) {
//                if (n % i == 0) {
//                    return false;
//                }
//            }
//            return true;
//        }
        //Câu 5
//            String st = "  Nguyễn Hoàng Đạt  ";
//            System.out.println(st.replaceAll("\\s+", " ").trim());
//            char kyTu;
//                for (int i = 0; i < st.length(); i++) {
//                kyTu = st.charAt(st.length() - i - 1);
//                if (st.charAt(i) == kyTu) {
//                System.out.println("Chuỗi này là chuỗi Panlyndrome.");
//                break;
//            } else {
//                System.out.println("Chuỗi này không là chuỗi Panlyndrome.");
//                break;
//            }
//        }
//    }

        //Câu 6
//        Scanner sc = new Scanner(System.in);
//        int n;
//        System.out.println("Nhập vào kích thước mảng: ");
//        n = sc.nextInt();
//        int arr[][] = new int[n][n];
//        System.out.println("Nhập các phần tử cho mảng: ");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print("A[" + i + "]["+ j + "] = ");
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Mảng vừa nhập là: ");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        System.out.println("Phần tử trên đường chéo chính là: ");
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (i == j) {
//                    System.out.print(arr[i][j]+ "\t");
//                }
//            }
//        }
    }
}