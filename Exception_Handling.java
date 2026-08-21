//Exception handling improves the robustness and reliability of Java applications by allowing programs to recover gracefully from runtime errors.

import java.util.Scanner;

public class Exception_Handling {
    public static void main(String[] args) {
        System.out.print("Enter a Number :");
        Scanner scan = new Scanner(System.in);
        try {
            int a = scan.nextInt();
            int b = 10 / 0;
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Program Ended");
        scan.close();
    }
}
