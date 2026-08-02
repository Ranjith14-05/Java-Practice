public class EnhancedForLoop {
    //The Enhanced for loop (also called the For-Each Loop) is used to iterate through arrays or collections without using an index.
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}