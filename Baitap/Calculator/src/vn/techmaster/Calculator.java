package vn.techmaster;

public class Calculator {
    public static void sum(int x, int y){
        System.out.printf("%d + %d = %d",x,y,(x+y));
    }

    public static void sum(int x, int y, int z){
        System.out.printf("%d + %d + %d = %d",x,y,z,(x+y+z));
    }

    public static void sum(double x, double y){
        System.out.printf("%f + %f = %f",x,y,(x+y));
    }
}
