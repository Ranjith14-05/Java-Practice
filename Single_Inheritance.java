// Single Inheritance in Java is a mechanism where a class (child class) inherits the properties and behaviors (methods) of another class (parent class). In this example, the `Son` class inherits from the `Fateher` class, allowing it to access the `House()` method defined in the `Fateher` class.

class Fateher{
    void House(){
        System.out.println("Father has a house");
    }
}

class Son extends Fateher{
    void Car(){
        System.out.println("Son has a car");
    }
}




public class Single_Inheritance {
    public static void main(String[] args) {
        Son s = new Son();
        s.House(); // Calls method from Father class
        s.Car();   // Calls method from Son class
    }
}