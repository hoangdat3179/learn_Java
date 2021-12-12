import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Service service;
    ArrayList<Person> listPerson;
    Scanner sc;

    public Controller() {
        service = new Service();
        listPerson = service.getData();
        sc = new Scanner(System.in);
    }

    public void mainMenu(){
        boolean isCheck = false;
        while (!isCheck){
            System.out.println("Nhap lua chon: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Danh sach: ");
                    service.printList(listPerson);
                    break;
                case 2:
                    //sap xep theo ten
                    service.sortByName(listPerson);
                    break;
                case 3:
                    //sap xep theo email
                    service.sortByEmail(listPerson);
                    break;
                default:
                    System.out.println("Khong co lua chon nay");
            }
        }
    }
}
