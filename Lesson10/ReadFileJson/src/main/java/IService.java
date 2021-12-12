import java.util.ArrayList;

public interface IService {

    public ArrayList<Person> getData();
    public void  printList( ArrayList<Person> list);
    public void sortByName( ArrayList<Person> list);
    public void sortByEmail( ArrayList<Person> list);

    public void insertPerson(ArrayList<Person> list);
}
