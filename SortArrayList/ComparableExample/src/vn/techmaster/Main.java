package vn.techmaster;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> listPerson =  new ArrayList<>();
        listPerson.add(new Person("John",17,"US"));
        listPerson.add(new Person("Anna",15,"Mexico"));
        listPerson.add(new Person("Chris",20,"Canada"));
        listPerson.add(new Person("Victor",19,"America"));

        System.out.println("Danh sách ban đầu: ");
        show(listPerson);

        Collections.sort(listPerson);
        System.out.println("Danh sách sau khi sắp xếp: ");
        show(listPerson);
    }

    public static void show(ArrayList<Person> listPerson){
        for (Person p : listPerson){
            System.out.println(p);
        }
    }
}
