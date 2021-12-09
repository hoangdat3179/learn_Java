package vn.techmaster;

import java.time.LocalDate;
import java.util.Scanner;

public class Service {
    GuestRepo repo = new GuestRepo();

    public void getAllGuest() {
        for (Guest guestRepo : repo.listGuest) {
            System.out.println(guestRepo);
        }
    }

    public void insertGuest() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Id: ");
        int id = sc.nextInt();
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập ngày, tháng, năm sinh: ");
        System.out.print("Ngày: ");
        int day = sc.nextInt();
        System.out.print("Tháng: ");
        int month = sc.nextInt();
        System.out.print("Năm: ");
        int year = sc.nextInt();
        LocalDate date = LocalDate.of(year, month, day);
        sc.nextLine();
        System.out.print("Nhập giới tính: ");
        Sex sex = Sex.valueOf(sc.nextLine());
        System.out.print("Nhập quê quán: ");
        String nativeCountry = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String number = sc.nextLine();
        System.out.print("Nhập email: ");
        String email = sc.nextLine();

        Guest g = new Guest(id, name, date, sex, nativeCountry, number, email);
        repo.listGuest.add(g);

    }

    public void getGuestBySexNam() {
        int count = 0;
        for (Guest guest : repo.listGuest) {
            if (guest.getSex() == Sex.NAM) {
                System.out.println(guest);
                count++;
            }
        }
    }

    public void getGuestBySexNu() {
        int count = 0;
        for (Guest guest : repo.listGuest) {
            if (guest.getSex() == Sex.NU) {
                System.out.println(guest);
                count++;
            }
        }
    }

    public void searchGuestById() {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int count = 0;
        for (Guest guest : repo.listGuest) {
            if (guest.getId() == id) {
                System.out.println(guest);
                count++;
            }
        }
        if (count == 0) System.out.println("Không có khách hàng này");
    }

    public void deleteGuest() {
        for (Guest guest : repo.listGuest) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập id bạn cần xóa: ");
            int id = sc.nextInt();
            if (guest.getId() == id)
                repo.listGuest.remove(guest);
        }
    }

    public void editGuest() {
        for (Guest guest : repo.listGuest) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập id bạn cần sửa: ");
            int id = sc.nextInt();
            if (guest.getId() == id) {
                System.out.println("Nhập Tên: ");
                sc.nextLine();
                guest.setName(sc.nextLine());
                System.out.println("Nhập ngày, tháng, năm sinh: ");
                System.out.print("Ngày: ");
                int day = sc.nextInt();
                System.out.print("Tháng: ");
                int month = sc.nextInt();
                System.out.print("Năm: ");
                int year = sc.nextInt();
                LocalDate date = LocalDate.of(year, month, day);
                guest.setDate(date);
                System.out.println("Nhập giới tính: ");
                guest.setSex(Sex.valueOf(sc.nextLine()));
                System.out.println("Nhập quê quán: ");
                sc.nextLine();
                guest.setNativeCountry(sc.nextLine());
                System.out.println("Nhập số điện thoại: ");
                guest.setNumber(sc.nextLine());
                System.out.println("Nhập email: ");
                guest.setEmail(sc.nextLine());
                repo.listGuest.add(guest);
            }
        }
    }
}
