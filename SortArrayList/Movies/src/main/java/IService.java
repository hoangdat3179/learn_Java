import java.util.ArrayList;

public interface IService {

    ArrayList<Film> getData();
    void printList( ArrayList<Film> list);
    void sortByName( ArrayList<Film> list);
    void sortByLength( ArrayList<Film> list);
    void sortByView(ArrayList<Film> list);
}
