// Multilevel Inheritance in Java is a mechanism where a class (child class) inherits from another class (parent class), which in turn inherits from another class (grandparent class). In this example, the `Son` class inherits from the `Father` class, which inherits from the `Grandparent` class, allowing the `Son` class to access methods defined in both the `Father` and `Grandparent` classes.

class Grandparent {
    void displayGrandparent() {
        System.out.println("This is the Grandparent class.");
    }
}

class Father2 extends Grandparent {
    void displayFather() {
        System.out.println("This is the Father class.");
    }
}

class Son2 extends Father2 {
    void displaySon() {
        System.out.println("This is the Son class.");
    }
}


public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Son2 s = new Son2();
        s.displayGrandparent(); // Calls method from Grandparent class
        s.displayFather();      // Calls method from Father class
        s.displaySon();         // Calls method from Son class
    }
}
