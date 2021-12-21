package vn.techmaster;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add("HTML/CSS");
        linkedList.add("PHP");
        linkedList.add("Python");

        Iterator<String> itr = linkedList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

//        if(!linkedList.remove("java")){
//            System.out.println("xóa không thành công");
//        }
//        linkedList.remove("Java");
//        System.out.println(linkedList);

        Collections.shuffle(linkedList);
        System.out.println(linkedList);

        Collections.sort(linkedList);
        System.out.println(linkedList);

        Collections.reverse(linkedList);
        System.out.println(linkedList);


    }
}
