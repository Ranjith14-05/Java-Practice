//An abstract class is a class declared with the abstract keyword that cannot be instantiated and may contain both abstract (unimplemented) and concrete (implemented) methods. It serves as a base class for other classes.

abstract class Shape {
    abstract void draw();

    void display(){
        System.out.println("This Is From Shape class");
    }
}

class square extends Shape{
    @Override

    void draw(){
        System.out.println("Draw with Length And Breadth");
    }
}

public class Abstract_Class {
    public static void main(String[] args) {
        square s1 = new square();
        s1.draw();
        s1.display();
    }
}
