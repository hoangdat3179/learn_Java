package vn.techmaster;

import java.util.Scanner;

public class Menu {
    Service s = new Service();
    Scanner sc = new Scanner(System.in);

    public void mainMenu(){

        boolean isCheck = false;
        while(!isCheck){
            System.out.println("1 - Xem thông tin toàn bộ khách hàng");
            System.out.println("2 - Xem thông tin khách hàng nữ hoặc xem thông tin khách hàng nam");
            System.out.println("3 - Thêm thông tin 1 khách hàng vào danh sách");
            System.out.println("4 - Tìm kiếm thông tin khách hàng dựa vào mã");
            System.out.println("0 - Thoát chương trình");
            System.out.println("Lựa chọn của bạn: ");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    System.out.println("thông tin toàn bộ khách hàng: ");
                    s.getAllGuest();
                    break;
                case 2:
                    GuestMenu();
                    break;
                case 3:
                    System.out.println("Nhập thông tin 1 khách hàng vào danh sách: ");
                    s.insertGuest();
                    break;
                case 4:
                    System.out.println("Nhập mã khách hàng: ");
                    s.searchGuestById();
                    choiceMenu();
                    break;
                case 0:
                    System.exit(0);

            }
        }
    }

    public void GuestMenu(){
        boolean isCheck = false;
        while(!isCheck){
            System.out.println("Lựa chọn thông tin khách hàng bạn muốn xem: ");
            System.out.println("1 - Nam");
            System.out.println("2 - Nữ");
            System.out.println("0 - Quay về trang chủ");

            int choose = sc.nextInt();
            switch(choose){
                case 1:
                    s.getGuestBySexNam();
                    break;
                case 2:
                    s.getGuestBySexNu();
                    break;
                case 0:
                    mainMenu();
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void choiceMenu(){
        boolean isCheck = false;
        while(!isCheck){
            System.out.println("Lựa chọn của bạn: ");
            System.out.println("1 - Sửa thông tin của khách hàng");
            System.out.println("2 - Xóa thông tin của khách hàng");
            System.out.println("0 - Quay về trang chủ");

            int choose = sc.nextInt();
            switch(choose){
                case 1:
                    s.editGuest();
                    break;
                case 2:
                    s.deleteGuest();
                    break;
                case 0:
                    mainMenu();
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }
}
