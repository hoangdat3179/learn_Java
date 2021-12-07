package vn.techmaster;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<NhanVien> listKiemChungVien = new ArrayList<>();
        ArrayList<NhanVien> listLapTrinhVien = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        boolean isContinue = false;
        while (!isContinue) {
            menu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Tính lương lập trình viên: ");
                    Service.luongLapTrinhvien();
                    break;
                case 2:
                    System.out.println("Tính lương kiểm chứng viên: ");
                    Service.luongKiemChungVien();
                    break;
                case 3:
                    System.out.println("Nhập danh sách lập trình viên: ");
                    Service.addLapTrinhVien(listLapTrinhVien);
                    break;
                case 4:
                    System.out.println("Nhập danh sách kiểm chứng viên: ");
                    Service.addKiemChungVien(listKiemChungVien);
                    break;
                case 5:
                    System.out.println("Danh sách lập trình viên: ");
                    Service.getLapTrinhVien(listLapTrinhVien);
                    System.out.println("Danh sách Kiểm chứng viên: ");
                    Service.getKiemChungVien(listKiemChungVien);
                    break;
                case 0:
                    isContinue = true;
                    System.exit(1);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }
    private static void menu() {
        System.out.println("Bạn có thể thực hiện: ");
        System.out.println("1 - Tính lương lập trình viên");
        System.out.println("2 - Tính lương kiểm chứng viên");
        System.out.println("3 - Nhập danh sách lập trình viên");
        System.out.println("4 - Nhập danh sách kiểm chứng viên");
        System.out.println("5 - In thông tin các nhân viên ra màn hình");
        System.out.println("0 - Dừng chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }
}
