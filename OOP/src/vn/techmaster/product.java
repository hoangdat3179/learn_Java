package vn.techmaster;

public class product {
    public int productCode;
    public String name;
    public String description;
    public int number;
    public String price;
    public String productType;

    public product(int productCode, String name, String description, int number, String price, String productType) {
        this.productCode = productCode;
        this.name = name;
        this.description = description;
        this.number = number;
        this.price = price;
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Mã sản phẩm: " + productCode + '\n' +
                "Tên sản phẩm: " + name + '\n' +
                "Mô tả: " + description + '\n' +
                "Số lượng: " + number + '\n' +
                "Giá tiền: " + price + '\n' +
                "Loại sản phẩm: " + productType + '\n';
    }
}
