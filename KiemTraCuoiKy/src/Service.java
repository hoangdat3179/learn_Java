import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    ArrayList<Account> listAccount = Repository.getData();
    Scanner sc = new Scanner(System.in);

    public void loginAccount() {
        int count = 0;
        System.out.println("ĐĂNG NHẬP");
        System.out.println("Nhập username: ");
        String username = CheckInput.checkUsername();
        for (int i = 0; i < listAccount.size(); i++) {
            if (listAccount.get(i).getUsername().equalsIgnoreCase(username)) {
                count++;
                System.out.println("Nhập mật khẩu: ");
                String password = sc.nextLine();
                if (listAccount.get(i).getPassword().equals(password)) {
                    System.out.println("Đăng nhập thành công!");
                    System.out.println("Chào mừng " + listAccount.get(i).getUsername() + ", bạn có thể thực hiện các công việc sau: ");
                    boolean isCheck1 = false;
                    while (!isCheck1) {
                        menu2();
                        int choice = Integer.parseInt(sc.nextLine());
                        switch (choice) {
                            case 1:
                                System.out.println("Nhập username mới: ");
                                String newUsername = sc.nextLine();
                                listAccount.get(i).setUsername(newUsername);
                                break;
                            case 2:
                                System.out.println("Nhập email mới: ");
                                String newEmail = CheckInput.checkEmail();
                                listAccount.get(i).setEmail(newEmail);
                                break;
                            case 3:
                                System.out.println("Nhập pass mới: ");
                                String newPassword = CheckInput.checkPassword();
                                listAccount.get(i).setPassword(newPassword);
                                break;
                            case 4:
                                isCheck1 = true;
                                break;
                            case 0:
                                System.exit(1);
                                break;
                            default:
                                System.out.println("Không có lựa chọn này, tự động back ra menu chính");
                                break;
                        }
                    }
                } else {
                    System.out.println("Mật khẩu không chính xác!");
                    boolean isCheck2 = false;
                    while (!isCheck2) {
                        menu1();
                        int choice = Integer.parseInt(sc.nextLine());
                        switch (choice) {
                            case 1:
                                loginAccount();
                                break;
                            case 2:
                                forgotPassword();
                                break;
                            case 0:
                                isCheck2 = true;
                                System.exit(1);
                                break;
                            default:
                                System.out.println("Không có lựa chọn này, tự động back ra menu chính");
                                break;
                        }
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("Tài khoản chưa đúng!" + "\n" + "*Chọn 1 để đăng nhập lại." + "\n" + "*Chưa có tài khoản chọn 2 để đăng ký." + "\n" + "*Chọn số bất kỳ đê thoát");
            boolean isCheck3 = false;
            while (!isCheck3) {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        loginAccount();
                        break;
                    case 2:
                        signinAccount();
                        break;
                    default:
                        isCheck3 = true;
                        System.exit(1);
                        break;
                }
            }
        }
    }

    public void signinAccount() {
            System.out.println("ĐĂNG KÝ TÀI KHOẢN MỚI");
            String username = checkUser();
            System.out.println("Nhập email: ");
            String email = CheckInput.checkEmail();
            System.out.println("Nhập mật khẩu: ");
            String password = CheckInput.checkPassword();
            Account newUser = new Account(username,password,email );
            listAccount.add(newUser);
            System.out.println("Tạo tài khoản thành công");
        }


        public String checkUser() {
            System.out.println("Nhập username: ");
            boolean isContinue = false;
            String newUsername = "";
            while (!isContinue) {
                try {
                    newUsername = CheckInput.checkUsername();
                    for (Account user : listAccount) {
                        if (user.getUsername().equals(newUsername)) throw new MyException("Username đã tồn tại");
                    }
                    isContinue = true;
                } catch (NullPointerException e) {
                    System.out.println(e.getMessage() + ", vui lòng nhập lại:");
                } catch (MyException e) {
                    System.out.println(e.getMessage() + ", vui lòng nhập lại:");
                }
            }

            return newUsername;
        }

    public void forgotPassword(){
        int count = 0;
        System.out.println("Nhập email để kiểm tra: ");
        String email = sc.nextLine();
        for (int i = 0; i < listAccount.size(); i++) {
            if (listAccount.get(i).getEmail().equals(email)) {
                System.out.println("Nhập mật khẩu mới: ");
                String newPassword = CheckInput.checkPassword();
                listAccount.get(i).setPassword(newPassword);
                loginAccount();
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không tồn tại email này, vui lòng đăng ký lại");
            signinAccount();
        }
    }

    public static void menu1() {
        System.out.println("1 - Đăng nhập lại");
        System.out.println("2 - Quên mật khẩu");
        System.out.println("Lựa chọn của bạn là: ");
    }
    public static void menu2() {
        System.out.println("1 - Thay đổi username");
        System.out.println("2 - Thay đổi email");
        System.out.println("3 - Thay đổi mật khẩu");
        System.out.println("4 - Đăng xuât");
        System.out.println("0 - Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }
}

