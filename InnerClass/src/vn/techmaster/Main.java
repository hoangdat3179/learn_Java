package vn.techmaster;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
//	Car car = new Car() {
//        @Override
//        public void setName() {
//            System.out.println("vinfast");
//        }
//    };
//    car.setName();
//
//    ITeacher teacher = new ITeacher() {
//        @Override
//        public void getName() {
//            System.out.println("Ngọc");
//        }
//    };
//    teacher.getName();
//        ITeacher teacher1 = () -> {
//            System.out.println("Ngọc");
//            System.out.println("abc");
//        };
//        teacher1.getName();
//
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(3);
//        numbers.add(5);
//        numbers.add(7);
//
//        for (Integer i : numbers){
//            System.out.println(i);
//        }
//
//        System.out.println();
//
//        numbers.forEach(i -> System.out.print(i + "\t"));
//        System.out.println();
//
//        Collections.sort(numbers);
//
//        Animal a1 = new Animal("Dog",5,"Black");
//        Animal a2 = new Animal("Cat",1,"White");
//        Animal a3 = new Animal("Mouse",2,"Black");
//        ArrayList<Animal> animals = new ArrayList<>();
//        animals.add(a1);
//        animals.add(a2);
//        animals.add(a3);
//
//        Collections.sort(animals, new Comparator<Animal>() {
//            @Override
//            public int compare(Animal o1, Animal o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
//
//        animals.forEach(animal -> System.out.println(animal));
//        animals.forEach(System.out::println);
//
//        System.out.println();
//        animals.sort(((o1, o2) -> o1.getAge()- o2.getAge()));
//        animals.forEach(animal -> System.out.println(animal));
//
//        Collections.sort(animals,(animal1,animal2) -> animal1.getName().compareTo(animal2.getName()));
//        System.out.println("Sắp xếp theo tên");
//        animals.forEach(animal -> System.out.println(animal));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(8);
        numbers.add(5);
        numbers.add(2);

        numbers.stream().map(i -> i *10).forEach(i -> System.out.print(i+"\t"));

        System.out.println();

        numbers.stream().filter(i -> i%2==0).forEach(i -> System.out.print(i+"\t"));
        System.out.println();
        numbers.stream().limit(3).forEach(i -> System.out.print(i + "\t"));
        System.out.println();
        numbers.stream().skip(2).limit(1).forEach(i -> System.out.print(i + "\t"));
        System.out.println();
        Integer min = numbers.stream().min(Integer::compare).get();
        System.out.println(min);

        System.out.println();

        Animal a1 = new Animal("Dog",5,"Black");
        Animal a2 = new Animal("Cat",1,"White");
        Animal a3 = new Animal("Mouse",2,"Black");
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);

        animals.stream().filter(i -> i.getAge()<3).forEach(i -> System.out.println(i));


    }
}
