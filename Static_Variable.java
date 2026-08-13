//“A static variable is a class-level variable that is shared by all objects of that class. It is declared using the static keyword, and only one copy of it is created, regardless of how many objects we create.”



class Student5 {
    String name;           // Instance variable
    static String school = "ABC School";  // Static variable

    Student5(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("School: " + school);
    }
}



class Static_Variable {
    public static void main(String[] args) {
        Student5 s1 = new Student5("Alice");
        Student5 s2 = new Student5("Bob");

        s1.display();
        s2.display();

        Student5.school = "XYZ School";

        s1.display();
        s2.display();
    }
}
