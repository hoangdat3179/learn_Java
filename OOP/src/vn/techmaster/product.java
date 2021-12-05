package vn.techmaster;

public class product {
    public int id;
    public String name;
    public String description;
    public int amount;
    public long price;
    public String productType;

    public product(int id, String name, String description, int amount, long price, String productType) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.price = price;
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "Mã sản phẩm: " + id + '\n' +
                "Tên sản phẩm: " + name + '\n' +
                "Mô tả: " + description + '\n' +
                "Số lượng: " + amount + '\n' +
                "Giá tiền: " + price + '\n' +
                "Loại sản phẩm: " + productType + '\n';
    }
}
