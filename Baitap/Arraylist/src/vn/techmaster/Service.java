package vn.techmaster;

import java.util.ArrayList;

public class Service {
    public static void printList(ArrayList<ListFilm> list){
        for(ListFilm str : list){
            System.out.println(str);
        }
    }

    public static void printListAction(ArrayList<ListFilm> list){
        for(int i = 0; i < ListFilm.films().size(); i++){
            if(ListFilm.films().get(i).getGenre().contains("Action")){
                System.out.println(ListFilm.films().get(i));
            }
        }
    }
}
