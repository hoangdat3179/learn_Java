package vn.techmaster;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
//        Queue<String> queue = new LinkedList<>();
//        queue.add("Java");
//        queue.add("HTML");
//        queue.add("JS");
//        queue.add("Ruby");
//
//        System.out.println(queue);
//
//        System.out.println(queue.remove());// nếu trong danh sách không có phần tử nào sẽ ném ra ngoại lệ (xóa)
//        System.out.println(queue);
//
//        System.out.println(queue.poll());// nếu không có phần tử nào trả về null (xóa)
//        System.out.println(queue);
//
//        System.out.println(queue.element());// nếu không có phần tử nào ném ra ngoại lệ (lấy phần tử)
//        System.out.println(queue.peek());// nếu không có phần tử nào trả về null (lấy phần tử)

        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(1);
        numbers.add(7);
        numbers.add(5);
        numbers.add(9);

        System.out.println(numbers);
        System.out.println("Phần tử đầu tiên: " + numbers.remove());
        System.out.println(numbers);

        numbers.add(2);
        System.out.println(numbers);

        PriorityQueue<String> strings = new PriorityQueue<>();
        strings.add("John");
        strings.add("An");
        strings.add("Victor");
        strings.add("Mike");

        System.out.println(strings);
    }
}
