package vn.techmaster;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        Map<Integer, String> maps = new HashMap<>();
//        maps.put(1,"Java");
//        maps.put(2,"HTML");
//        maps.put(3,"Ruby");
//        maps.put(7,"PHP");
//
//        System.out.println(maps);
//        maps.put(4, "Python");
//        System.out.println(maps);
//
//        for(Map.Entry<Integer, String> entry : maps.entrySet()){
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }
//        System.out.println("------------------------------");
//        Map<Integer, String> list = new TreeMap<>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return 0;
//            }
//        });
//
//        list.put(4,"Java");
//        list.put(1,"HTML");
//        list.put(7,"Ruby");
//        list.put(3,"PHP");
//
//        for(Map.Entry<Integer, String> entry : list.entrySet()){
//            System.out.println(entry.getKey() + " - " + entry.getValue());
//        }

        Service service = new Service();
        ArrayList<Person> person = service.getAllPerson();
        System.out.println("Danh sách");
        service.printList(person);

        Map<Gender, Integer> countGender = service.countByGender(person);

        for(Map.Entry<Gender, Integer> entry : countGender.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
