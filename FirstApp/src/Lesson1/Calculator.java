package Lesson1;

public class Calculator {
    public static void main(String[] args) throws Exception {
        int tong = phepcong( 20, 30);
        int tru = pheptru( 40, 30);
        int nhan = phepnhan( 5, 20);
        int chia = phepchia( 90, 30);
        System.out.println("Kết quả phép cộng: " + tong);
        System.out.println("Kết quả phép trừ: " + tru);
        System.out.println("Kết quả phép nhân: " + nhan);
        System.out.println("Kết quả phép chia: " + chia);
    }
    public static int phepcong(int a, int b){
        int sum = a + b;
        return sum;
    }
    public static int pheptru(int a, int b){
        int tru = a - b;
        return tru;
    }
    public static int phepnhan(int a, int b){
        int nhan = a * b;
        return nhan;
    }
    public static int phepchia(int a, int b){
        int chia = a / b;
        return chia;
    }
}