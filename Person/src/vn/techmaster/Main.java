package vn.techmaster;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
//	Student s = new Student("Đạt", LocalDate.of(2002,4,5),"HN",10);
//    System.out.println(s);
//
//    Teacher t = new Teacher("Đạt", LocalDate.of(2002,4,5),"HN",10,"Teacher");
//    System.out.println(t);
        SchoolBook schoolBook = new SchoolBook();
        Service.listBook();
    }
}
