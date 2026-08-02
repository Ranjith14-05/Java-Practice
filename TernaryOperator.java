public class TernaryOperator {     
        public static void main(String[] args) {  

        int a = 20;                     
        int b = 15;                   

        int max = (a > b) ? a : b;      // If a > b, store a in max; otherwise store b
        System.out.println("a = " + a);  
        System.out.println("b = " + b);  
        System.out.println("Largest Number = " + max); 
    }
}