package vn.techmaster;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Repository repo = new Repository();
        ArrayList<Student> listStudent = repo.getStudent();
        ArrayList<Teacher> listTeacher = repo.getTeacher();

        Scanner sc = new Scanner(System.in);
        boolean isContinue = false;
        while (!isContinue) {
            menu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Thêm danh sách các học sinh: ");
                    Service.addStudent(listStudent);
                    break;
                case 2:
                    System.out.println("Thêm danh sách các giáo viên: ");
                    Service.addTeacher(listTeacher);
                    break;
                case 3:
                    System.out.println("Danh sách các học sinh: ");
                    Service.getListStudent(listStudent);
                    break;
                case 4:
                    System.out.println("Danh sách các giáo viên: ");
                    Service.getListTeacher(listTeacher);
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
        System.out.println("1 - Thêm học sinh vào danh sách");
        System.out.println("2 - Thêm giáo viên vào danh sách");
        System.out.println("3 - Hiển thi danh sách học sinh ra màn hình");
        System.out.println("4 - Hiển thi danh sách giáo viên ra màn hình");
        System.out.println("0 - Dừng chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }
}
