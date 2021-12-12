import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Service implements IService {
    public ArrayList<Film> getData() {
        ArrayList<Film> list = new ArrayList<>();

        //Tạo đối tượng gson
        Gson gson = new Gson();

        //Đọc file
        try {
            FileReader reader = new FileReader("Movies.json");
            //Lấy kiểu mong muốn được convert sang
            Type objectType = new TypeToken<ArrayList<Film>>() {
            }.getType();
            list = gson.fromJson(reader, objectType);
            for (Film f : list) {
                System.out.println(f);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }

        return list;
    }

    public void printList(ArrayList<Film> list) {
        for (Film f : list) {
            System.out.println(f);
        }
    }

    @Override
    public void sortByName(ArrayList<Film> list) {
        Collections.sort(list, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        printList(list);
    }

    @Override
    public void sortByLength(ArrayList<Film> list) {
        Collections.sort(list, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getLength()- o2.getLength();
            }
        });
        printList(list);
    }

    @Override
    public void sortByView(ArrayList<Film> list) {
        Collections.sort(list, new Comparator<Film>() {
            @Override
            public int compare(Film o1, Film o2) {
                return o1.getView()- o2.getView();
            }
        });
        printList(list);
    }
}
