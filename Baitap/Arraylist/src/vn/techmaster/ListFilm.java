package vn.techmaster;

import java.util.ArrayList;

public class ListFilm {
        private int id;
        private String name;
        private String genre;
        private String duration;
        private String producer;
        private int year;


    public int getId() {
            return id;
        }

        public String getName() {

        return name;
        }

        public String getGenre() {

        return genre;
        }

        public String getDuration() {

        return duration;
        }

        public String getProducer() {

        return producer;
        }

        public int getYearOfPublication() {

        return year;
        }

        public ListFilm(int id, String name, String genre, String duration, String producer, int year) {
            this.id = id;
            this.name = name;
            this.genre = genre;
            this.duration = duration;
            this.producer = producer;
            this.year = year;
        }

        public static ArrayList<ListFilm> films(){
            ArrayList<ListFilm> listfilm = new ArrayList<>();
            ListFilm f = new ListFilm(1,"Money heist","Criminal,Action","5 season","Spain", 2021 );
            listfilm.add(f);
            listfilm.add(new ListFilm(2,"Squid Game","Action,Horror,Drama", "9 episodes","Korea",2021));
            listfilm.add(new ListFilm(3,"Shang-chi","Action,Adventure,Fiction","120 munites","US,China",2021));
            listfilm.add(new ListFilm(4,"Hellbound","Horror,Drama,Fiction","6 episodes","Korea",2021));
            return listfilm;
        }

        @Override
        public String toString() {
            return "Id: " + id + "\n" +
                    "Name: " + name + "\n" +
                    "Genre: " + genre + "\n" +
                    "Duration: " + duration + "\n" +
                    "Producer: " + producer + "\n" +
                    "Year: " + year + "\n";
        }
}
