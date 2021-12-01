package vn.techmaster;

import java.util.Locale;
import java.util.Scanner;

public class Exercise_05 {
    public static String input(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        return str;
    }
    public static void standardizeString(){
        System.out.println("Nhập tên: ");
        String name =input();

        System.out.println("Tên trước khi chuẩn hóa là: " + name);
        //Tiến hành chuẩn hóa
        //Loại bỏ khoảng trắng ở đầu và cuối chuỗi
        name = name.trim();

        //Thay thế những phần có nhiều khoảng trắng liền kề nhau thành 1 khoảng trắng
        name = name.replaceAll("\\s+", " ");

        //Cắt chuỗi thành mảng
        String []arr = name.split(" ");
        String result = "";
        for(int i = 0; i < arr.length; i++){
            String firstChar = String.valueOf(arr[i].charAt(0)).toUpperCase(); // Viết in hoa ký tự đầu tiên
            String subString = arr[i].substring(1).toLowerCase(); //Viết thường các ký tự đứng sau ký tự đầu tiên

            result += firstChar + subString + " ";
        }

        System.out.println("Chuỗi sau khi chuẩn hóa: " +result);

    }

    public static String createPalindrome(String str){
        String palindrome = "";
        for(int i = str.length() - 1; i >= 0; i--){
            palindrome += str.charAt(i);
        }
        return palindrome;
    }

    public static void checkPalindrome(){
        System.out.println("Nhập chuỗi bất kỳ: ");
        String str = input();
        if(str.equals(createPalindrome(str))){
            System.out.println(str + " là chuỗi palindrome");
        }else{
            System.out.println(str + " không là chuỗi palindrome");
        }
    }
}
