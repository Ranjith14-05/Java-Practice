//A lambda expression in Java is a short way to write an implementation of a functional interface (an interface with exactly one abstract method). It was introduced in Java 8 to make code more concise and readable.

interface Greet {
    void SayHello();
}

interface Add {
    void add(int a, int b);
}

public class Lambda {
    public static void main(String[] args) {
        Greet obj = () -> {
            System.out.println("Hello");
        };
        obj.SayHello();

        // Lambda with Parameters

        Add o2 = (a, b) -> {
            System.out.println("Addition : " + (a + b));
        };

        o2.add(2, 2);
    }
}
