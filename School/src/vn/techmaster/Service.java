package vn.techmaster;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    public static void addStudent(ArrayList<Student> listStudent){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = sc.nextInt();
        System.out.println("Nhập tên: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = sc.nextInt();
        System.out.println("Nhập địa chỉ; ");
        sc.nextLine();
        String address = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết: ");
        int theoreticalPoint = sc.nextInt();
        System.out.println("Nhập điểm thực hành: ");
        int praticePoint = sc.nextInt();

        Student s = new Student(id, name ,age, address,theoreticalPoint,praticePoint);
        System.out.println("Thêm thành công\n"+ s);
        listStudent.add(s);
    }

    public static void addTeacher(ArrayList<Teacher> listTeacher){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = sc.nextInt();
        System.out.println("Nhập tên: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = sc.nextInt();
        System.out.println("Nhập địa chỉ; ");
        sc.nextLine();
        String address = sc.nextLine();
        System.out.println("Nhập lương: ");
        int salary = sc.nextInt();

        Teacher s = new Teacher(id, name ,age, address,salary);
        System.out.println("Thêm thành công\n"+ s);
        listTeacher.add(s);
    }

    public static void getListStudent(ArrayList<Student> listStudent){
        for(Student student : listStudent){
            System.out.println(student);
        }
    }
    public static void getListTeacher(ArrayList<Teacher> listTeacher){
        for(Teacher teacher : listTeacher){
            System.out.println(teacher);
        }
    }
}
