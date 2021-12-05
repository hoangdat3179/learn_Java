package vn.techmaster;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<ListFilm> listfilm = new ArrayList<>();
        ListFilm f = new ListFilm(1,"Money heist","Criminal,Action","5 season","Spain", 2021 );
        listfilm.add(f);
        listfilm.add(new ListFilm(2,"Squid Game","Action,Horror,Drama", "9 episodes","Korea",2021));
        listfilm.add(new ListFilm(3,"Shang-chi","Action,Adventure,Fiction","120 munites","US,China",2021));
        listfilm.add(new ListFilm(4,"Hellbound","Horror,Drama,Fiction","6 episodes","Korea",2021));

        System.out.println("Danh sách phim: ");
        for(ListFilm films : listfilm){
            System.out.println(films);
        }

        System.out.println("Danh sách phim hành động: ");
        for(int i = 0; i < listfilm.size(); i++){
            if(listfilm.get(i).getGenre().contains("Action")){
                System.out.println(listfilm.get(i));
            }
        }

    }
}
