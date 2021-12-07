package vn.techmaster;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {


    public void getListBook(ArrayList<SchoolBook> listBook){
        for(SchoolBook book : listBook){
            System.out.println(book);
        }
    }

    public static void listBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sách: ");
        String name = sc.nextLine();
        System.out.println("Nhập thể loại: ");
        String nxb = sc.nextLine();
        System.out.println("Nhập năm xuất bản: ");
        int year = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số lượng: ");
        int number = sc.nextInt();
        System.out.println("Nhập số trang: ");
        int page = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số trang: ");
        String tinhtrang = sc.nextLine();
        System.out.println("Nhập số trang: ");
        int soluongmuon = Integer.parseInt(sc.nextLine());

        SchoolBook newBook = new SchoolBook(name ,nxb, year, number, page,tinhtrang , soluongmuon);
        System.out.println("Thêm thành công\n" + newBook);
        SchoolBook.add(newBook); //Thêm vào ArrayList
    }

    public static void printList(ArrayList<SchoolBook> list){
        for(SchoolBook str : list){
            System.out.println(str);
        }
    }

}
