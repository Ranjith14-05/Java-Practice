//"Method overriding is a feature in Java where a child class provides its own implementation of a method that is already defined in the parent class. It is used to achieve runtime polymorphism."
class Animal1 {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog1 extends Animal1 {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}


public class Method_Overriding {

    public static void main(String[] args) {

        Dog1 d = new Dog1();
        d.sound();
    }
}

