//A class declared inside another class is called a Nested Class.

class Outer {
    int a = 24;

    class inner{

        void Display(){
            System.out.println("A : "+a);
            System.out.println("From Inner Class");
        }
    }

    void OuterDisplay(){
        inner i = new inner();
        i.Display();
        System.out.println("Form Outer Class");
    }
}


public class NestedClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.OuterDisplay();

        // To access inner class 

        Outer.inner i = new Outer().new inner();
        i.Display();
    }
}
