//A Local Inner Class is a class declared inside a method.


class Outer1 {

    void display() {

        class Inner {

            void show() {
                System.out.println("Hello from Local Inner Class");
            }
        }

        Inner i = new Inner();
        i.show();
    }
}




public class LocalInnerClass {
    public static void main(String[] args) {
        Outer1 o = new Outer1();
        o.display();
    }
}
