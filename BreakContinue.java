public class BreakContinue {
    public static void main(String[] args) {

        System.out.println("Using continue:");

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue;   // Skip number 5
            }

            System.out.println(i);
        }

        System.out.println("\nUsing break:");

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                break;      // Stop the loop when i becomes 5
            }

            System.out.println(i);
        }
    }
}
