import java.util.ArrayList;
import java.util.Map;

public interface IService {

    ArrayList<Book> getData();
    void printList( ArrayList<Book> list);
    void sortByPublishingYear( ArrayList<Book> list);
    void findBookName( ArrayList<Book> list);
    void printListCategory(ArrayList<Book> list);
    Map<String, Integer> countByCategory();
}
