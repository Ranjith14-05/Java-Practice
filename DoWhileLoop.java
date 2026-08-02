public class DoWhileLoop {
    //A do-while loop executes the block of code at least once, then checks the condition. If the condition is true, it repeats; otherwise, it stops
    public static void main(String[] args) {

        int i = 1;

        do {
            System.out.println("Count = " + i);
            i++;
        } while (i <= 5);
    }
}