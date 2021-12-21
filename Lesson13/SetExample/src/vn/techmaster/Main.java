package vn.techmaster;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(1);
        set.add(7);
        set.add(3);
        set.add(4);
        set.add(6);

        System.out.println(set);

        if(!set.add(3)){
            System.out.println("Đã có phần tử");
        }else {
            System.out.println("Thêm thành công");
        }

        //Thêm phần tử trùng lặp
        set.add(3);
        System.out.println(set);

        //Xóa phần tử 7
        set.remove(7);
        System.out.println("Set sau khi loại bỏ phần tử: " + set);

//        long count = set.stream().filter(i->i%2==0).count();
//        System.out.println(count);


    }
}
