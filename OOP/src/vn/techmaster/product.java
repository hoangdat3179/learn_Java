package vn.techmaster;

public class product {
    public String productCode;
    public String name;
    public String description;
    public int number;
    public String price;
    public String productType;

    public product(String productCode, String name, String description, int number, String price, String productType) {
        this.productCode = productCode;
        this.name = name;
        this.description = description;
        this.number = number;
        this.price = price;
        this.productType = productType;
    }

    @Override
    public String toString() {
        return "productCode='" + productCode + '\n' +
                "name= " + name + '\n' +
                "description= " + description + '\n' +
                "number= " + number + '\n' +
                "price= " + price + '\n' +
                "productType= " + productType + '\n';
    }
}
