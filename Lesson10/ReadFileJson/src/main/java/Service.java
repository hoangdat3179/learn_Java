import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Service {
    public ArrayList<Person> getData(){
        ArrayList<Person> list = new ArrayList<>();

        //Tạo đối tượng gson
        Gson gson = new Gson();

        //Đọc file
        try {
            FileReader reader = new FileReader("PersonJson.json");
            //Lấy kiểu mong muốn được convert sang
            Type objectType = new TypeToken<ArrayList<Person>>(){}.getType();
            //System.out.println(objectType);

            Type type = new TypeToken<Person>(){}.getType();
            System.out.println(type);


            list = gson.fromJson(reader, objectType);

            for (Person p : list) {
                System.out.println(p);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        }

        return list;
    }

    public void printList(ArrayList<Person> list){
        for (Person p : list){
            System.out.println(p);
        }
    }

    public void sortByName(ArrayList<Person> listPerson) {
    }

    public void sortByEmail(ArrayList<Person> listPerson) {
    }
}
