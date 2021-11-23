package vn.techmaster;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        for(int i = 0; i < 9; i ++){
//            System.out.println("Xin chào");
//        }

//        for(int i = 1; i<= 100; i++){
//            if(i%3==0){
//                if(i%5==0){ //i chia hết cho cả 3 và 5
//                    System.out.println("FizzBuzz");
//                }else{ //i chỉ chia hết cho 3 không chia hết cho 5
//                    System.out.println("Fizz");
//                }
//            }else{
//                if(i%5 ==0){ //i chỉ chia hết 5 không chia hết cho 3
//                    System.out.println("Buzz");
//                }else{ //i không chia hết cho cả 3 và 5
//                    System.out.println(i);
//                }
//            }
//        }
//        int i = 100;
//        do {
//            System.out.println("Xin chào");
//            i++;
//        }while(i <= 10);
////        while(i < 10){
////            System.out.println("Xin chào");
////            i++;
////        }

        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean isCheck = false;
        Random rd = new Random();
        int rdNumber = rd.nextInt(100);

        while(!isCheck){
            System.out.println("Nhập số bất kỳ: ");
            number = sc.nextInt();
//            if(number < 0){
//                System.out.println("Bạn nhập số âm");
//            }else if( number > 0 && number < 18){
//                System.out.println("Bạn chưa đủ tuổi bầu cử");
//            }else if (number >= 18 && number < 100) {
//                System.out.println("Bạn đủ tuổi bầu cử");
//            } else if( number == 0){
//                isCheck = true;
//            } else {
//                System.out.println("Bạn lớn tuổi quá rồi");
//            }
            if(number < rdNumber){
                System.out.println("Số bạn nhập nhỏ hơn rồi");
            }else if(number > rdNumber) {
                System.out.println("Số bạn nhập lớn hơn rồi");
            }else{
                System.out.println("Bạn đoán đúng rồi");
                isCheck = true;
            }
        }

        //System.out.println("Nhập số bất kỳ: ");

    }
}