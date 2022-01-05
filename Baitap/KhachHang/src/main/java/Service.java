import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    public void printCustomer(ArrayList<Customer> listCustomer) {
        System.out.println("Danh sách toàn bộ khách hàng: ");
        for (Customer c : listCustomer) {
            System.out.println(c);
        }
    }

    public void searchCustomer(ArrayList<Customer> listCustomer) {
        Menu m = new Menu();
        Scanner sc = new Scanner(System.in);
        boolean isContinue = false;
        while (!isContinue) {
            menu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Danh sách khách hàng nam: ");
                    for (int i = 0; i < listCustomer.size(); i++) {
                        if (listCustomer.get(i).getGender().equals(Gender.NAM)) {
                            System.out.println(listCustomer.get(i));
                        }
                    }
                    break;
                case 2:
                    System.out.println("Danh sách khách hàng nữ: ");
                    for (int i = 0; i < listCustomer.size(); i++) {
                        if (listCustomer.get(i).getGender().equals(Gender.NU)) {
                            System.out.println(listCustomer.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.println("Danh sách toàn bộ khách hàng");
                    for (Customer c : listCustomer) {
                        System.out.println(c);
                    }
                    break;
                case 0:
                    isContinue = true;
                    m.choiceMenu(listCustomer);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }

    }


    public void addNewCustomer(ArrayList<Customer> listCustomer) {
        Gender gender;

        boolean flag;
        boolean flag1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập thông tin:");
        int id = (listCustomer.size() + 1);
        System.out.println("Nhập tên khách hàng: ");
        String name = sc.nextLine();
        System.out.println("Nhập ngày, tháng, năm sinh khách hàng: ");
        System.out.print("Ngày: ");
        int day = sc.nextInt();
        System.out.print("Tháng: ");
        int month = sc.nextInt();
        System.out.print("Năm: ");
        int year = sc.nextInt();
        LocalDate date = LocalDate.of(year, month, day);
        sc.nextLine();
        System.out.println("Nhập 1 chọn giới tính nam và số khác chọn giới tính nữ: ");
        int i = Integer.parseInt(sc.nextLine());
        if (i == 1) {
            gender = Gender.NAM;
        } else {
            gender = Gender.NU;
        }
        System.out.println("Nhập quê quán: ");
        String country = sc.nextLine();
        System.out.println("Nhập SĐT: ");
        do {
            String newMobile = sc.nextLine();
            flag = Validate.phoneValidator(newMobile);
            if (!flag){
                System.out.println("Sai định dạng, nhập lại SĐT: ");
            }}while (flag);
        String mobile = sc.nextLine();
        System.out.println("Nhập Email: ");
        do {
            String newEmail = sc.nextLine();
            flag1 = Validate.emailValidator(newEmail);
            if (!flag1){
                System.out.println("Sai định dạng, nhập lại Email: ");
            }
        }while (flag1);
        String email = sc.nextLine();
        Customer newCustomer = new Customer(id, name, date, gender, country, mobile, email); //Tạo đối tượng khách hàng mới
        listCustomer.add(newCustomer);
        System.out.println("Thêm thành công\n" + newCustomer);
    }

    public void findCustomerID(ArrayList<Customer> listCustomer) {
        Scanner sc = new Scanner(System.in);
        Menu m = new Menu();
        System.out.println("Nhập ID khách hàng muốn tìm kiếm: ");
        int n = sc.nextInt();
        sc.nextLine();
        int count = 0;
        boolean isContinue = false;
        for (int i = 0; i < listCustomer.size(); i++) {
            if (listCustomer.get(i).getId() == n) {
                count++;
                System.out.println(listCustomer.get(i));
                while (!isContinue) {
                    menu1();
                    int choice = sc.nextInt();
                    sc.nextLine();
                    switch (choice) {
                        case 1:
                            boolean isContinue1 = false;
                            while (!isContinue1) {
                                menu2();
                                int choice1 = sc.nextInt();
                                sc.nextLine();
                                switch (choice1) {
                                    case 1:
                                        System.out.println("Nhập tên mới:");
                                        String newName = sc.nextLine();
                                        listCustomer.get(i).setName(newName);
                                        System.out.println("Thông tin khách hàng sau khi thay đổi tên: ");
                                        System.out.println(listCustomer.get(i));
                                        break;
                                    case 2:
                                        System.out.println("Nhập ngày, tháng, năm sinh mới:");
                                        System.out.print("Ngày: ");
                                        int day = sc.nextInt();
                                        System.out.print("Tháng: ");
                                        int month = sc.nextInt();
                                        System.out.print("Năm: ");
                                        int year = sc.nextInt();
                                        listCustomer.get(i).setDate(LocalDate.of(year, month, day));
                                        System.out.println("Thông tin khách hàng sau khi thay đổi ngày tháng năm sinh: ");
                                        System.out.println(listCustomer.get(i));
                                        break;
                                    case 3:
                                        Gender gender = null;
                                        System.out.println("Nhập giới tính mới:");
                                        System.out.println("Nhập 1 chọn giới tính nam và số khác chọn giới tính nữ: ");
                                        int j = Integer.parseInt(sc.nextLine());
                                        if (j == 1) {
                                            gender = Gender.NAM;
                                        } else {
                                            gender = Gender.NU;
                                        }
                                        listCustomer.get(i).setGender(gender);
                                        System.out.println("Thông tin khách hàng sau khi thay đổi giới tính: ");
                                        System.out.println(listCustomer.get(i));
                                        break;
                                    case 4:
                                        System.out.println("Nhập quê quán mới cho khách hàng:");
                                        String newCountry = sc.nextLine();
                                        listCustomer.get(i).setCountry(newCountry);
                                        System.out.println("Thông tin khách hàng sau khi thay đổi quê quán: ");
                                        System.out.println(listCustomer.get(i));
                                        break;
                                    case 5:
                                        boolean flag;
                                        System.out.println("Nhập SĐT mới cho khách hàng:");
                                        do {
                                            String newMobile = sc.nextLine();
                                            flag = Validate.phoneValidator(newMobile);
                                            if (!flag){
                                                System.out.println("Sai định dạng, nhập lại SĐT mới: ");
                                            }}while (flag);
                                        String newMobile = sc.nextLine();
                                        listCustomer.get(i).setMobile(newMobile);
                                        System.out.println("Thông tin khách hàng sau khi thay đổi SĐT: ");
                                        System.out.println(listCustomer.get(i));
                                        break;
                                    case 6:
                                        boolean flag1;
                                        System.out.println("Nhập Email mới cho khách hàng:");
                                        do {
                                            String newEmail = sc.nextLine();
                                            flag1 = Validate.emailValidator(newEmail);
                                            if (!flag1){
                                                System.out.println("Sai định dạng, nhập lại Email: ");
                                            }
                                        }while (flag1);
                                        String newEmail = sc.nextLine();
                                        listCustomer.get(i).setEmail(newEmail);
                                        System.out.println("Thông tin khách hàng sau khi thay đổi Email: ");
                                        System.out.println(listCustomer.get(i));
                                        break;
                                    case 0:
                                        isContinue1 = true;
                                        m.choiceMenu(listCustomer);
                                        break;
                                }
                            }
                        case 2:
                            listCustomer.remove(i);
                            System.out.println("Đã xóa khách hàng có ID: " + n);
                            System.out.println("Hệ thống tự động quay lại menu chính");
                            m.choiceMenu(listCustomer);
                            break;
                        case 0:
                            isContinue = true;
                            m.choiceMenu(listCustomer);
                            break;
                        default:
                            System.out.println("Không có lựa chọn này");
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("Không có ID khách hàng này, hệ thống quay lại menu chính");
        }


    }

    public static void menu() {
        System.out.println("1 - Hiển thi danh sách khách hàng nam");
        System.out.println("2 - Hiển thi danh sách khách hàng nữ");
        System.out.println("3 - Hiển thi toàn bộ khách hàng");
        System.out.println("0 - Quay lại menu chính");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void menu1() {
        System.out.println("1 - Thay đổi thông tin khách hàng");
        System.out.println("2 - Xóa thông tin khách hàng");
        System.out.println("0 - Không thao tác gì, quay lại menu chính");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void menu2() {
        System.out.println("1 - Thay đổi tên khách hàng");
        System.out.println("2 - Thay đổi ngày tháng năm sinh khách hàng");
        System.out.println("3 - Thay đổi giới tính khách hàng");
        System.out.println("4 - Thay đổi quê quán khách hàng");
        System.out.println("5 - Thay đổi SĐT khách hàng");
        System.out.println("6 - Thay đổi email khách hàng");
        System.out.println("0 - Không thao tác gì, quay lại menu chính");
        System.out.println("Lựa chọn của bạn là: ");
    }

}
