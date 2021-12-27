import java.util.ArrayList;

public class Repository {
    public static ArrayList<Account> getData() {
        ArrayList<Account> listAccount = new ArrayList<>();
        listAccount.add(new Account("admin","admin1@gmail.com","Admin1@"));
        listAccount.add(new Account("admin2","admin2@gmail.com","Admin2@"));
        listAccount.add(new Account("admin3","admin3@gmail.com","Admin3@"));
        listAccount.add(new Account("admin4","admin44@gmail.com","Admin4@"));
        return listAccount;
    }
}
