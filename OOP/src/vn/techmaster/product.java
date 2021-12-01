package vn.techmaster;

public class product {
    public String productCode;
    public String name;
    public String description;
    public int number;
    public String price;
    public String productType;

    public product() {
        productCode = "112";
        name = "chair";
        description = "3 chân";
        number = 50;
        price = "20k";
        productType = "ghế đẩu";
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
