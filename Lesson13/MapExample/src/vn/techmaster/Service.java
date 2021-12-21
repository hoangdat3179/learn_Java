package vn.techmaster;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Service {
    public ArrayList<Person> getAllPerson(){
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("John",Gender.MALE));
        persons.add(new Person("Chris",Gender.MALE));
        persons.add(new Person("Emma",Gender.FEMALE));
        persons.add(new Person("Victor",Gender.MALE));
        return persons;
    }

    public void printList(ArrayList<Person> list){
        for (Person p : list){
            System.out.println(p);
        }
    }

    public Map<Gender, Integer> countByGender(ArrayList<Person> list){
        Map<Gender, Integer> genderMap = new HashMap<>();

        for(Person p : list){
            Gender gender = p.getGender();
            if(genderMap.get(gender) == null){
                genderMap.put(gender, 1);
            }else{
                genderMap.put(gender, genderMap.get(gender) + 1);
            }
        }

        return genderMap;
    }
}
