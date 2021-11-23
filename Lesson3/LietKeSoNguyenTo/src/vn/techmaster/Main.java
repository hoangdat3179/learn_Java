package vn.techmaster;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 2;
        System.out.println("Tất cả các số nguyên tố nhỏ hơn 20 là: ");
        for (int i = 2; i < 20; i++) {
            if (PrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }

    public static boolean PrimeNumber(int n) {
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
