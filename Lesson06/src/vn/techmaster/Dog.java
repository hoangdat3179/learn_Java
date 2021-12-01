package vn.techmaster;

public class Dog {
    public String breed;
    public String size;
    public String age;
    public String color;

    public Dog(String breed, String size, String age , String color){
        this.breed = breed;
        this.size = size;
        this.age = age;
        this.color = color;
    }

    public void eat(){

    }

    public void sleep(){

    }

    public void run(){

    }

    @Override
    public String toString() {
        return "Breed: " +  breed + "\n" + "Size: " + size + "\n" + "Age: " + age + "\n" + "Color: " + color + "\n";
    }
}
