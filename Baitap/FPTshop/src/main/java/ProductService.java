public class ProductService {
        ProductRepo repo = new ProductRepo();

        public void getAllProduct(){
            for (Product product: repo.listProduct) {
                System.out.println(product);
            }
        }

        public void getProductByCategory(Category category){
            int count = 0;
            for (Product p: repo.listProduct) {
                if(p.getCategory() == category){
                    System.out.println(p);
                    count++;
                }
            }
            if (count == 0) System.out.println("Không có sản phẩm nào");
        }

        public void getProductByBrand(String brand){
//        for(int i = 0; i < repo.listProduct.size(); i++) {
//            if (repo.listProduct.get(i).getBrand().equalsIgnoreCase(brand)) {
//                System.out.println(repo.listProduct.get(i));
//            }
//        }
            int count = 0;
            for (Product p: repo.listProduct) {
                if(p.getBrand().equalsIgnoreCase(brand)){
                    System.out.println(p);
                    count++;
                }
            }

            if (count == 0) System.out.println("Không có sản phẩm nào");
        }

        public void getProductByPrice(int choose){
            int count = 0;
            switch (choose){
                case 1:
//                for(int i = 0; i < repo.listProduct.size(); i++) {
//                    if (repo.listProduct.get(i).getPrice() < 2000000) {
//                        System.out.println(repo.listProduct.get(i));
//                    }
//                }

                    for (Product p : repo.listProduct) {
                        if(p.getPrice() < 2000000){
                            System.out.println(p);
                            count++;
                        }
                    }
                    break;
                case 2:
//                for(int i = 0; i < repo.listProduct.size(); i++) {
//                    if (repo.listProduct.get(i).getPrice() >= 2000000 && repo.listProduct.get(i).getPrice() > 4000000 ) {
//                        System.out.println(repo.listProduct.get(i));
//                    }
//                }
                    for (Product p : repo.listProduct) {
                        if(p.getPrice() >= 2000000 && p.getPrice() < 4000000){
                            System.out.println(p);
                            count++;
                        }
                    }
                    break;
                case 3:
//                for(int i = 0; i < repo.listProduct.size(); i++) {
//                    if (repo.listProduct.get(i).getPrice() >= 4000000 && repo.listProduct.get(i).getPrice() > 7000000 ) {
//                        System.out.println(repo.listProduct.get(i));
//                    }
//                }

                    for (Product p : repo.listProduct) {
                        if(p.getPrice() >= 4000000 && p.getPrice() < 7000000){
                            System.out.println(p);
                            count++;
                        }
                    }
                    break;

                case 4:
//                for(int i = 0; i < repo.listProduct.size(); i++) {
//                    if (repo.listProduct.get(i).getPrice() >= 7000000 && repo.listProduct.get(i).getPrice() > 13000000 ) {
//                        System.out.println(repo.listProduct.get(i));
//                    }
//                }

                    for (Product p : repo.listProduct) {
                        if(p.getPrice() >= 7000000 && p.getPrice() < 13000000){
                            System.out.println(p);
                        }
                    }
                    break;

                case 5:
//                for(int i = 0; i < repo.listProduct.size(); i++) {
//                    if (repo.listProduct.get(i).getPrice() >= 13000000 ) {
//                        System.out.println(repo.listProduct.get(i));
//                    }
//                }

                    for (Product p : repo.listProduct) {
                        if(p.getPrice() >= 13000000){
                            System.out.println(p);
                            count++;
                        }
                    }
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
            if (count == 0) System.out.println("Không có sản phẩm nào");

        }

        public void searchProductByName(String name){
            int count = 0;
            for (Product p : repo.listProduct) {
                if(p.getName().toLowerCase().contains(name.toLowerCase())){
                    System.out.println(p);
                    count++;
                }

            }
            if (count == 0) System.out.println("Không có sản phẩm nào");
        }
}
