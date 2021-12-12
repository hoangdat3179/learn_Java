package vn.techmaster;

public class Main {

    public static void main(String[] args) {
        PartTimeEmployee p = new PartTimeEmployee("dat",20000,3);
        System.out.println(p);
        FullTimeEmployee f = new FullTimeEmployee("dat",30000);
        System.out.println(f);
    }
}
