package vn.techmaster;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    public static void addKiemChungVien(ArrayList<NhanVien> listKiemchungvien) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = sc.nextInt();
        System.out.println("Nhập tên: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = sc.nextInt();
        System.out.println("Nhập số điện thoại; ");
        int phoneNumber = sc.nextInt();
        System.out.println("Nhập email: ");
        sc.nextLine();
        String email = sc.nextLine();
        System.out.println("Nhập lương cơ bản: ");
        int salary = sc.nextInt();
        System.out.println("Nhập số lỗi phát hiện");
        int errors = sc.nextInt();

        KiemChungVien k = new KiemChungVien(id, name, age, phoneNumber, email, salary, errors);
        System.out.println("Thêm thành công:\n" + k + '\n');
        listKiemchungvien.add(k);
    }

    public static void addLapTrinhVien(ArrayList<NhanVien> listLapTrinhVien) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = sc.nextInt();
        System.out.println("Nhập tên: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = sc.nextInt();
        System.out.println("Nhập số điện thoại; ");
        int phoneNumber = sc.nextInt();
        System.out.println("Nhập email: ");
        sc.nextLine();
        String email = sc.nextLine();
        System.out.println("Nhập lương cơ bản: ");
        int salary = sc.nextInt();
        System.out.println("Nhập số giờ làm thêm:");
        int overTime = sc.nextInt();

        LapTrinhVien l = new LapTrinhVien(id, name, age, phoneNumber, email, salary, overTime);
        System.out.println("Thêm thành công:\n" + l + '\n');
        listLapTrinhVien.add(l);
    }

    public static void luongLapTrinhvien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập lương cơ bản: ");
        int salary = sc.nextInt();
        System.out.println("Nhập số giờ làm thêm: ");
        int overTime = sc.nextInt();
        int s = salary + overTime * 200000;
        System.out.printf("%d + %d * %d = %d \n ", salary, overTime, 200000, s);
    }

    public static void luongKiemChungVien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập lương cơ bản: ");
        int salary = sc.nextInt();
        System.out.println("Nhập số lỗi phát hiện: ");
        int errorsDetected = sc.nextInt();
        int s = salary + errorsDetected * 50000;
        System.out.printf("%d + %d * %d = %d \n", salary, errorsDetected, 50000, s);
    }

    public static void getLapTrinhVien(ArrayList<NhanVien> listLapTrinhVien) {
        for (NhanVien LapTrinhVien : listLapTrinhVien) {
            System.out.println(LapTrinhVien);
        }
    }

    public static void getKiemChungVien(ArrayList<NhanVien> listKiemChungVien) {
        for (NhanVien KiemChungVien : listKiemChungVien) {
            System.out.println(KiemChungVien);
        }
    }
}
