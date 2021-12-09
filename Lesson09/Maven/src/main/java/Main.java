import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person p = new Person(1,"dat", LocalDate.now(),"dat@gmail.com","12341532");
        System.out.println(p.getName());


    }
}
