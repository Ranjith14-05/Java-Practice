//A constructor is a special method that is called automatically when an object is created. It is mainly used to initialize the object's data (instance variables).


/*
Rules of a Constructor
✅ Constructor name must be the same as the class name.
✅ It does not have a return type (not even void).
✅ It is called automatically when an object is created using new.
✅ A class can have multiple constructors (Constructor Overloading).

*/

class Student1 {
    String name;
    int age;

    //Constructor
    Student1(){
        name="Ranjith";
        age=21;
    }

    //Parameterized Construcor

    Student1(String n,int a){
        name=n;
        age=a;
    }

    //Copy Constructor

    Student1(Student1 s2){
        name = s2.name;
        age = s2.age;

    }

    //The toString() method is a method inherited from the Object class that returns a string representation of an object. It is automatically called when an object is printed using System.out.println().
    @Override
    public String toString(){
        return "Name : " + name + ", Age : " + age;
    }
}

public class Constructors {
    public static void main(String[] args) {

        Student1 s1 = new Student1();                 // Default constructor
        Student1 s2 = new Student1("Rahul", 20);      // Parameterized constructor
        Student1 s3 = new Student1(s2);               // Copy constructor

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}