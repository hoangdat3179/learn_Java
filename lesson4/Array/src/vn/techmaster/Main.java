package vn.techmaster;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);

        String arr[] = new String[n];
        System.out.println("Nhập các phần tử cho mảng: ");

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            arr[i] = scanner.nextLine();
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("Java")){
                System.out.println("Số phần tử có Java trong mảng = " + i);
            }
        }
        System.out.println("Số phần tử có Java trong mảng = 0");
    }
}
