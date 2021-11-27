package vn.techmaster;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int number = Integer.parseInt(sc.nextLine());
//
//        System.out.println("Số vừa nhập: " + number);
//
//        System.out.println("Nhập số thực: ");
//        //double number2 = sc.nextDouble();
//        double number2 = Double.parseDouble(sc.nextLine());
//        System.out.println("số vừa nhập" + number2);
//        sc.nextLine();
//        System.out.println("vui lòng nhập tên bạn: ");
//        String name = sc.next();
//        System.out.println("Tên của bạn là: " +name);
//
//        sc.close();

//        System.out.println("nhập tên:");
//        String name = sc.nextline();
//        System.out.println("Xin chào các bạn.");
//        System.out.println("tôi tên là " + name);
//
//        System.out.println("tôi tên là %s", name);
//        String name = "Đạt";
//        int age = 20;
//        String address = "Hà Nội";
//        System.out.printf("Tôi tên là %s, năm nay tôi %d,tôi đến từ %s\n", name,age,address);
//        System.out.println("tôi tên là " +name+ ",năm nay tôi "+ age+ ",tôi đến từ "+address);
//
//        double weight = 40.5;
//        System.out.format("Cân nặng của tôi là %.2f", weight);
//
//        double weight = 40.7;
//        double height = 1.5;
//        double bmi = weight/(Math.pow(height,2));
//        System.out.printf("Chỉ số bmi của bạn là: %.2f\n",bmi);
//        System.out.println("Chỉ số bmi khi được làm tròn: " + Math.ceil(bmi));
//
//        Random ran = new Random();
//        int randomNumber = ran.nextInt(20);
//        System.out.println("Số ngẫu nhiên: " +randomNumber);

//        int number = ran.nextInt(20)+10;
//        System.out.println(number);
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập số ngẫu nhiên: ");
//        int number = sc.nextInt();
//
//        Random rd = new Random();
//        int randomnumber = rd.nextInt();
//        System.out.println("Số ngẫu nhiên là: " + randomnumber);
//        System.out.println("Số lớn nhất: " + Math.max(randomnumber,number));
//
        Random rd = new Random();
        int randomnumber = rd.nextInt(100);
        System.out.println("Số ngẫu nhiên là: " + randomnumber);
        String s = (randomnumber%2==0) ? "Số chia hết cho 2":"Số không chia hết cho 2";
        System.out.println(s);

    }
}
