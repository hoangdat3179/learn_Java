package Lesson1;

public class BMI {
    public static void main(String[] args) {
        BMI m = new BMI();
        m.pt1();
        m.pt2();
        System.out.println("Chỉ số bmi: " + pt2());
        
        double bmi = m.pt3( 50, 1.6);
        System.out.println("Chỉ số bmi: " + bmi);
    }
    public void pt1() {
        double weight = 70;
        double height = 1.7;
        System.out.println("Chỉ số bmi: " + weight/(height*height));
    }
    public static double pt2() {
        double weight = 46;
        double height = 1.5;
        double c = weight/(height*height);
        return c;
    }
    public double pt3(double weight, double height){
        return weight/(height*height);
    }
}
