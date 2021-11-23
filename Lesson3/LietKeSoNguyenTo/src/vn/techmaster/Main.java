package vn.techmaster;

public class Main {

    public static void main(String[] args) {
        int n = 2;
        System.out.println("Tất cả các số nguyên tố nhỏ hơn 20 là: ");
        for (int i = 2; i < 20; i++) {
            if (PrimeNumber(i)) {
                System.out.print(i+ "\t");
            }
        }
    }

    public static boolean PrimeNumber(int n) {
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
