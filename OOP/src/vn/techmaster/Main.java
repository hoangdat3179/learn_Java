package vn.techmaster;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Tìm kiếm theo tên
        Scanner sc = new Scanner(System.in);
        int n = 0;
        product[] products = new product[n];
        System.out.println("Nhập tên bạn muốn tìm kiếm: ");
        String findName = sc.nextLine();
        for (int i = 0; i < n; i++) {
            if (products[i].name.contains(findName)) {
                System.out.println(products[i]);
            }
        }

    }
}
