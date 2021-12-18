public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Deprecated
    public void display(){
        System.out.printf("Tôi tên là %s, năm nay tôi %d tuổi, tôi đến từ %s", name, age, address);
    }
}
