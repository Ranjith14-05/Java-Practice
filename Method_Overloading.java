//Method overloading in Java is a feature that allows a class to have multiple methods with the same name but different parameter lists. It is an example of compile-time polymorphism (static polymorphism).


/*
Key Points:
✔ Same method name
✔ Different parameter list (number, type, or order)
✔ Return type alone cannot distinguish overloaded methods
✔ Achieved at compile time (static binding)

*/

class Calculator {

    // Method with two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method with three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double values
    double add(double a, double b) {
        return a + b;
    }


public class Method_Overloading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println(obj.add(10, 20));        // 30
        System.out.println(obj.add(10, 20, 30));    // 60
        System.out.println(obj.add(10.5, 20.5));    // 31.0
    }
}
}
