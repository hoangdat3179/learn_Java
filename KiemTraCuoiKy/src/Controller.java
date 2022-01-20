import java.util.Scanner;

public class Controller {
    Service service = new Service();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        boolean isCheck = false;
        while (!isCheck) {
            menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    service.loginAccount();
                    break;
                case 2:
                    service.signinAccount();
                    break;
                case 0:
                    isCheck = true;
                    System.exit(1);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public static void menu() {
        System.out.println("Bạn có thể thực hiện: ");
        System.out.println("1 - Dăng nhập");
        System.out.println("2 - Đăng ký");
        System.out.println("3 - Dừng chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

}
