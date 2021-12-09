package vn.techmaster;

public abstract class Shape {
    public void draw(){
        System.out.println("vẽ hình");
    }

    public final void getName(){
        System.out.println("Đây là hình....");
    }

    public abstract void setArea();
}
