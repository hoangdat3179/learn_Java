package vn.techmaster;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ListFilm.films();
        System.out.println("Danh sách phim: ");
        Service.printList(ListFilm.films());
        System.out.println("Danh sách phim hành động: ");
        Service.printListAction(ListFilm.films());

    }
}
