import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Service {
    public ArrayList<Person> getAllPerson(){
        ArrayList<Person> persons = new ArrayList<>();

        Gson gson = new Gson();

        try {
            FileReader reader = new FileReader("Person.json");
            Type type = new TypeToken<ArrayList<Person>>(){}.getType();
//            System.out.println(type);

            persons = gson.fromJson(reader,type);
        } catch (FileNotFoundException e) {
            System.out.println("không tìm thấy file");
        }
        return persons;
    }
}
