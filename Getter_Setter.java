class Rectangle {
    private int length,width;

    //Getter and Setter methods are used to access and modify private variables of a class. They are an important part of Encapsulation in Object-Oriented Programming (OOP).

    //Setter Methods

    void setlength(int l){
        length=l;
    }

    void setwidth(int w){
        width=w;
    }

    //Getter Methods 

    int getlength(){
        return length;
    }

    int getwidth(){
        return width;
    }

    int area(){
        return length*width;
    }

}


public class Getter_Setter {
public static void main(String[] args) {
        Rectangle r1 = new Rectangle();

        r1.setlength(10);
        r1.setwidth(5);
        System.out.println("Area of Rectangle : "+r1.area());
    }
}
