import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> listPerson =  new ArrayList<>();
        listPerson.add(new Person("John",17,"US"));
        listPerson.add(new Person("Anna",15,"Mexico"));
        listPerson.add(new Person("Chris",20,"Canada"));
        listPerson.add(new Person("Victor",19,"America"));

        System.out.println("Danh sách ban đầu: ");
        show(listPerson);

        //Sắp xếp theo tên
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Danh sách sắp xếp theo tên: ");
        show(listPerson);

        //Sắp xếp theo tuổi
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {

                return o1.getAge()- o2.getAge();
            }
        });
        System.out.println("Danh sách sắp xếp theo tuổi: ");
        show(listPerson);
    }

    public static void show(ArrayList<Person> listPerson){
        for (Person p : listPerson){
            System.out.println(p);
        }
    }
}
