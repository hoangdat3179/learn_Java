package vn.techmaster;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số sản phẩm: ");
        int n = sc.nextInt();
        product products[] = new product[n];
        for(int i = 0; i < n ;i++){
            System.out.println("Nhập mã sản phẩm: ");
            int productCode = sc.nextInt();
            sc.nextLine(); //Xử lý trôi lệnh
            System.out.println("Nhập tên sản phẩm: ");
            String name = sc.nextLine();
            System.out.println("Mô tả sản phẩm: ");
            String description = sc.nextLine();
            System.out.println("Nhập số lượng: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.println("Nhập giá tiền: ");
            String price = sc.nextLine();
            System.out.println("Nhập loại sản phẩm: ");
            String productType = sc.nextLine();

            product p = new product(productCode ,name,description,number,price,productType);
            products[i] = p;
        }
        for (int i =0 ; i<n ; i++){
            System.out.println(products[i]);
        }

        //Tìm kiếm theo tên
        System.out.println("Nhập tên bạn muốn tìm kiếm: ");
        String findName = sc.nextLine();
        for(int i = 0; i < n; i++){
            if(products[i].name.contains(findName)){
                System.out.println(products[i]);
            }
        }


    }
}
