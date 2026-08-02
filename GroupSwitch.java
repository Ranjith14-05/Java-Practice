public class GroupSwitch {
    public static void main(String[] args) {

        char grade = 'B';

        switch (grade) {

            case 'A':
            case 'B':
                System.out.println("Excellent Performance");
                break;

            case 'C':
            case 'D':
                System.out.println("Good Performance");
                break;

            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid Grade");
        }
    }
}