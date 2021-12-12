import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Service service;
    ArrayList<Film> listFilm;
    Scanner sc;

    public Controller(){
        service =  new Service();
        listFilm = service.getData();
        sc = new Scanner(System.in);
    }

    public void mainMenu(){
        boolean isCheck = false;
        while (!isCheck){
            System.out.println("Nhập lựa chọn");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Danh sách sắp xếp theo tên");
                    service.sortByName(listFilm);
                    break;
                case 2:
                    System.out.println("Danh sách sắp xếp theo thời lượng");
                    service.sortByLength(listFilm);
                    break;
                case 3:
                    System.out.println("Danh sách sắp xếp theo lượt xem");
                    service.sortByView(listFilm);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");

            }
        }
    }

    public static void menu(){
        System.out.println("Bạn có thể thực hiện: ");
        System.out.println("1 - Sắp xếp theo tên");
        System.out.println("2 - Sắp xếp theo thời lượng");
        System.out.println("3 - Sắp xếp theo lượt xem");
        System.out.println("0 - Dừng chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }
}
