import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.*;

public class Service implements IService {
    Scanner sc = new Scanner(System.in);
    ArrayList<Book> listBook = getData();
    public ArrayList<Book> getData() {
        ArrayList<Book> list = new ArrayList<>();

        //Tạo đối tượng gson
        Gson gson = new Gson();

        //Đọc file
        try {
            FileReader reader = new FileReader("Book.json");
            //Lấy kiểu mong muốn được convert sang
            Type objectType = new TypeToken<ArrayList<Book>>() {
            }.getType();
            list = gson.fromJson(reader, objectType);
            System.out.println(list);
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }
        return list;
    }
    public void printList(ArrayList<Book> list) {
        for (Book b : list) {
            System.out.println(b);
        }
    }

    @Override
    public void sortByPublishingYear(ArrayList<Book> list) {
        Collections.sort(list, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {

                return o1.getPublishingYear()- o2.getPublishingYear();
            }
        });
        printList(list);
    }

    @Override
    public void findBookName(ArrayList<Book> list) {
        System.out.println("Nhập tên sách muốn tìm kiếm: ");
        String n = sc.nextLine();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTitle().equalsIgnoreCase(n)) {
                System.out.println(list.get(i).toString());
            }
        }
    }

    public void printListCategory(ArrayList<Book> list){
        System.out.println("Nhập thể loại bạn muốn lọc: ");
        String n = sc.nextLine();
        System.out.println("In ra danh sách:");
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getCategory().contains(n)){
                System.out.println(list.get(i));
            }
        }
    }

    public Map<String, Integer> countByCategory(){
        Map<String, Integer> mapType = new HashMap<>();
        for(Book book : listBook){
            for (int i = 0; i< book.getCategory().size();i++){
                if(mapType.get(book.getCategory().get(i)) == null){
                    mapType.put(book.getCategory().get(i), 1);
                }else{
                    mapType.put(book.getCategory().get(i), mapType.get(book.getCategory().get(i)) + 1);
                }
            }
        }
        return mapType;
    }
}