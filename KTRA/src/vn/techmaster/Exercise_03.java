package vn.techmaster;

import java.util.Random;

public class Exercise_03 {
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

    public static void randomNumber(){
        Random rd = new Random();
        int number = rd.nextInt(100);
        if(isPrimeNumber(number)){
            System.out.println(number + " là số nguyên tố");
        }else{
            System.out.println(number + " không là số nguyên tố");
        }
    }
}
