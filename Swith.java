import java.util.Scanner;
public class Swith {
    public static void main(String[] args) {
        System.out.println("""
            Choose Any One :
            1.Addition
            2.Subraction
            3.Multipication
            4.Division
        """);
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        //Switch Statement

        int x , y,z;
        switch (a){
            case 1 :
                System.out.println("Enter Two Numbers :");
                x = scan.nextInt();
                y = scan.nextInt();
                z = x+y;
                System.out.println("Addition : " +z);
                break;

            case 2 :
                System.out.println("Enter Two Numbers :");
                x = scan.nextInt();
                y = scan.nextInt();
                z = x-y;
                System.out.println("Subraction :" + z);
                break;
            
            case 3 :
                System.out.println("Enter Two Numbers :");
                x = scan.nextInt();
                y = scan.nextInt();
                z = x*y;
                System.out.println("Multiplicaion :" + z);
                break;
            
            case 4 :
                System.out.println("Enter Two Numbers :");
                x = scan.nextInt();
                y = scan.nextInt();
                z = x/y;
                System.out.println("Division :" + z);
                break;

            default:
                System.out.println("Input Invalid");
        }
        scan.close();
    }
}
