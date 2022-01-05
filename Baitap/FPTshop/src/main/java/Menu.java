import java.util.Scanner;

public class Menu {
    ProductService controller = new ProductService();
    Scanner sc = new Scanner(System.in);

    public void mainMenu(){

        boolean isCheck = false;
        while(!isCheck){
            System.out.println("1 - Xem toàn bộ sản phẩm");
            System.out.println("2 - Xem thông tin sản phẩm theo danh mục");
            System.out.println("3 - Xem thông tin sản phẩm theo hãng");
            System.out.println("4 - Xem sản phẩm theo mức giá");
            System.out.println("5 - Tìm kiếm sản phẩm");
            System.out.println("0 - Thoát chương trình");
            System.out.println("Lựa chọn của bạn: ");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Danh sách sản phẩm: ");
                    controller.getAllProduct();
                    break;
                case 2:
                    categoryMenu();
                    break;
                case 3:
                    System.out.println("Nhập hãng bạn muốn tìm kiếm: ");
                    sc.nextLine();
                    String brand = sc.nextLine();
                    controller.getProductByBrand(brand);
                    break;
                case 4:
                    priceMenu();
                    break;
                case 5:
                    System.out.println("Nhập tên sản phẩm: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    controller.searchProductByName(name);
                    break;
                case 0:
                    System.exit(0);

            }
        }
    }

    public void categoryMenu(){
        boolean isCheck = false;
        while(!isCheck){
            System.out.println("Lựa chọn danh mục bạn muốn xem sản phẩm: ");
            System.out.println("1 - Điện thoại");
            System.out.println("2 - Laptop");
            System.out.println("3 - Apple");
            System.out.println("4 - Phụ kiện");
            System.out.println("0 - Quay về trang chủ");
            System.out.println("Lựa chọn của bạn là: ");

            int choose = sc.nextInt();
            switch(choose){
                case 1:
                    controller.getProductByCategory(Category.PHONE);
                    break;
                case 2:
                    controller.getProductByCategory(Category.LAPTOP);
                    break;
                case 3:
                    controller.getProductByCategory(Category.APPLE);
                    break;
                case 4:
                    controller.getProductByCategory(Category.ACCESSORY);
                    break;
                case 0:
                    mainMenu();
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }

    }

    public void priceMenu(){
        boolean isCheck = false;
        while(!isCheck){
            System.out.println("Chọn mức giá");
            System.out.println("1 - Dưới 2.000.000");
            System.out.println("2 - Từ 2.000.000 đến 4.000.000");
            System.out.println("3 - Từ 4.000.000 đến 7.000.000");
            System.out.println("4 - Từ 7.000.000 đến 13.000.000");
            System.out.println("5 - Từ 13.000.000 trở lên");
            System.out.println("0 - Về trang chủ");
            System.out.println("Lựa chọn của bạn: ");
            int choose= sc.nextInt();
            if(choose == 0){
                mainMenu();
            }
            controller.getProductByPrice(choose);
        }
    }

}