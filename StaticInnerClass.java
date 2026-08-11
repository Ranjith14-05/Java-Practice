//A static nested class is a class declared with the static keyword inside another class. It can be accessed using the outer class name without creating an object of the outer class."

class Outer3 {

    static class Inner3 {

        void display() {
            System.out.println("From Static Nested Class");
        }
    }
}


public class StaticInnerClass {
    public static void main(String[] args) {
         Outer3.Inner3 i = new Outer3.Inner3();

         i.display();
    }
}
