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
