package vn.techmaster;

public class Circle extends Shape{
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void setArea(){
        System.out.println(Math.PI * (r*r));
    }
}
