package vn.techmaster;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số sản phẩm: ");
//        int n = sc.nextInt();
//        product products[] = new product[n];
//        for(int i = 0; i < n ;i++){
//            System.out.println("Nhập mã sản phẩm: ");
//            int id = sc.nextInt();
//            sc.nextLine(); //Xử lý trôi lệnh
//            System.out.println("Nhập tên sản phẩm: ");
//            String name = sc.nextLine();
//            System.out.println("Mô tả sản phẩm: ");
//            String description = sc.nextLine();
//            System.out.println("Nhập số lượng: ");
//            int amount = sc.nextInt();
//            sc.nextLine();
//            System.out.println("Nhập giá tiền: ");
//            String price = sc.nextLine();
//            System.out.println("Nhập loại sản phẩm: ");
//            String productType = sc.nextLine();
//
//            product p = new product(id ,name,description,amount,price,productType);
//            products[i] = p;
//        }
//        for (int i =0 ; i<n ; i++){
//            System.out.println(products[i]);
//        }
//
//        //Tìm kiếm theo tên
//        System.out.println("Nhập tên bạn muốn tìm kiếm: ");
//        String findName = sc.nextLine();
//        for(int i = 0; i < n; i++){
//            if(products[i].name.contains(findName)){
//                System.out.println(products[i]);
//            }
//        }

        ArrayList<product> listProduct = new ArrayList<>();
        product p = new product(1,"Iphone X", "Điện thoại", 50 , 20000000, "Điện thoại" );
        listProduct.add(p);
        listProduct.add(new product(2,"Iphone 11", "Điện thoại", 120 , 21000000, "Điện thoại"));
        listProduct.add(new product(3,"Iphone 12", "Điện thoại", 150 , 23000000, "Điện thoại"));
        listProduct.add(new product(4,"Iphone 13", "Điện thoại", 50 , 25000000, "Điện thoại"));

        System.out.println("Danh sách các sản phẩm: ");
        for (product products : listProduct){
            System.out.println(products);
        }

        System.out.println("Dánh sách sản phẩm có số lượng trên 100: ");
        for (int i =0; i < listProduct.size();i++){
            if (listProduct.get(i).amount > 100){
                System.out.println(listProduct.get(i));
            }
        }

    }
}
