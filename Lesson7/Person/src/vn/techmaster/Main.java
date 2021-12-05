package vn.techmaster;

import vn.techmaster.Person.Person;

import javax.swing.text.Position;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//	    Person p = new Person("dat", 20, "hn");
//        System.out.println(p.getName() + " - " + p.getAge() + " - " + p.getAddress());
//
//        p.setName("linh");
//        p.setAge(26);
//        System.out.println(p.getName() + " - " + p.getAge() + " - " + p.getAddress());

//        ArrayList<String> list = new ArrayList<>();
//        list.add("HTML/CSS");
//        list.add("JS");
//        list.add("Database");
//        list.add("Spring boot");
//
//        System.out.println(list);
//
//        printList(list);
//
//        list.add(1,"Java");
//        System.out.println("Danh sách sau khi chèn: ");
//        printList(list);
//
//        list.set(1, "Java Core");
//        System.out.println("Danh sách sau khi sửa: ");
//        printList(list);
//
//        list.remove("Database");
//        System.out.println("Danh sách sau khí xóa: ");
//        printList(list);
//
//        list.remove(1);
//        System.out.println("Dánh sách sau khí xóa: ");
//        printList(list);
//
//        System.out.println("Kích thước: " + list.size());
//        list.clear();
//        System.out.println("Kích thước sau khí xóa toàn bộ: " + list.size());

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//
//        printList(list);

//        ArrayList<Person> listPerson = new ArrayList<>();
//        Person p = new Person("Đạt", 19,"HN");
//        listPerson.add(p);
//        listPerson.add(new Person("Linh",20,"HN"));
//        listPerson.add(new Person("Hoàng", 23 , "HN"));
//        listPerson.add(new Person("Tuấn", 20,"HN"));
//
//
//        for (Person person : listPerson){
//            System.out.println(person);
//        }
//
//        System.out.println("Danh sách những người 20 tuổi: ");
//        for (int i = 0 ; i < listPerson.size();i++){
//            if (listPerson.get(i).getAge() == 20){
//                System.out.println(listPerson.get(i));
//            }
//        }

        ArrayList<allPlayers> players = new ArrayList<>();
        allPlayers p = new allPlayers(23, "Nguyễn Văn Toản", allPlayers.Position.GK);
        players.add(new allPlayers(1,"1", allPlayers.Position.GK));
        players.add(new allPlayers(2,"2", allPlayers.Position.DF));
        players.add(new allPlayers(3,"3", allPlayers.Position.DF));
        players.add(new allPlayers(4,"4", allPlayers.Position.DF));
        players.add(new allPlayers(5,"5", allPlayers.Position.DF));
        players.add(new allPlayers(6,"6", allPlayers.Position.DF));
        players.add(new allPlayers(7,"7", allPlayers.Position.DF));
        players.add(new allPlayers(8,"8", allPlayers.Position.MF));
        players.add(new allPlayers(9,"9", allPlayers.Position.MF));
        players.add(new allPlayers(10,"10", allPlayers.Position.MF));
        players.add(new allPlayers(11,"11", allPlayers.Position.MF));
        players.add(new allPlayers(12,"12", allPlayers.Position.MF));
        players.add(new allPlayers(13,"13", allPlayers.Position.MF));
        players.add(new allPlayers(14,"14", allPlayers.Position.MF));
        players.add(new allPlayers(15,"15", allPlayers.Position.FW));
        players.add(new allPlayers(16,"16", allPlayers.Position.FW));
        players.add(new allPlayers(17,"17", allPlayers.Position.FW));
        players.add(new allPlayers(18,"18", allPlayers.Position.FW));
        players.add(new allPlayers(19,"19", allPlayers.Position.FW));
        players.add(new allPlayers(20,"20", allPlayers.Position.FW));
        players.add(new allPlayers(21,"21", allPlayers.Position.FW));

        Random general = new Random();
        int gateKeeperSize = 0;
        int defenderSize = 0;
        int midFieldSize = 0;
        int forwaderSize = 0;
        System.out.println("List player: ");
        while (gateKeeperSize <1){
            int rdGateKeeper = general.nextInt(22);
            if(allPlayers.get(rdGateKeeper).getPosition().equals(allPlayers.Position.GK)){
        }
    }

//    public static void printList(ArrayList<Integer> list){
//        for(int str: list){
//            System.out.print(str);
//        }
    }
}
