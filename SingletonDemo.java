//A Singleton class is a class that allows only one object to be created and provides a global access point to that object. We achieve this mainly by making the constructor private, keeping a static instance, and providing a static method to return that instance.

class Singleton {

    // 1. Create a static object
    private static Singleton obj;

    // 2. Make constructor private
    private Singleton() {
        System.out.println("Object Created");
    }

    // 3. Provide a method to get the object
    public static Singleton getInstance() {

        if (obj == null) {
            obj = new Singleton();
        }

        return obj;
    }
}

public class SingletonDemo {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);
    }
}
