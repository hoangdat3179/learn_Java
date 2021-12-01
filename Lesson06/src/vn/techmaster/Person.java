package vn.techmaster;

public class Person {
    public String name;
    public int age;
    public String address;
    public static String school = "Techmaster";
//
//    public static void changeschool(){
//        school = "CN";
//    }
//
//    static {
//        System.out.println("gọi tới static");
//    }
//
//    public void study() {
//        System.out.println(name + " đi học");
//    }
//    //Contructor mặc định
//    public Person(){
//
//    }
//
    //Contructor có tham số
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    @Override
    public String toString() {
        return name+ " - " + age + " - " + address;
    }
}
