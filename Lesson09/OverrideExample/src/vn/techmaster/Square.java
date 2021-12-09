package vn.techmaster;

public class Square extends Shape{
    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public void draw(){
        super.draw();
        System.out.println("vẽ hình vuông");
    }

    @Override
    public void setArea() {
        System.out.println(a*a);
    }
}
