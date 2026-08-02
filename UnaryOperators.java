public class UnaryOperators {
    public static void main(String[] args) {

        int a = 10;

        System.out.println("Original value : " + a);

        System.out.println("Unary Plus (+a)  : " + (+a));
        System.out.println("Unary Minus (-a) : " + (-a));

        System.out.println("Post Increment (a++) : " + (a++));
        System.out.println("Value after a++      : " + a);

        System.out.println("Pre Increment (++a)  : " + (++a));

        System.out.println("Post Decrement (a--) : " + (a--));
        System.out.println("Value after a--      : " + a);

        System.out.println("Pre Decrement (--a)  : " + (--a));

        boolean result = true;
        System.out.println("Logical NOT (!result): " + (!result));
    }
}
