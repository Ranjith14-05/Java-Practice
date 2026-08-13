//final is used to restrict changes in Java. A final variable cannot be reassigned, a final method cannot be overridden, and a final class cannot be inherited."

final class Vehicle {

    final int wheels = 4;

    final void display() {
        System.out.println("Vehicle has " + wheels + " wheels");
    }
}

public class Final {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();

        System.out.println(v.wheels);
        v.display();
    }
}
