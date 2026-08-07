// Class definition
class Student {
    // Data members (attributes)
    String name;
    int age;

    // Method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class
public class class_object {
    public static void main(String[] args) {
        // Creating an object
        Student s1 = new Student();

        // Assigning values to object
        s1.name = "Ranjith";
        s1.age = 21;

        // Calling method
        s1.display();
    }
}