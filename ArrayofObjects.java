class Student2{
    String name;
    int age;

    Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("---------------------------");
    }
}



public class ArrayofObjects {
    public static void main(String[] args) {
        Student2[] s1 = new Student2[5];
        s1[0]= new Student2("Ranjith",21 );
        s1[1]= new Student2("Ramesh",20 );
        s1[2]= new Student2("Sara",23 );
        s1[3]= new Student2("Priya",21 );
        s1[4]= new Student2("Suresh",19 );

        for(int i =0;i<=s1.length;i++){
            s1[i].display();
        }
    }
}
