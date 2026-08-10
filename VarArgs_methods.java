//Varargs allows a method to accept a variable number of arguments. In Java, varargs is represented using three dots (...) and is internally treated as an array.


public class VarArgs_methods {

    public static void GetName(String... name){
        for(String names : name){
            System.out.println(names);
        }
    }
    public static void main(String[] args) {
        GetName("Ranjith","Mona","Vicky","Kavin","Mathan");
    }
}
