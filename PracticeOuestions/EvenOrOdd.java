package PracticeOuestions;
import java.util.Scanner;

//Progran For Find Count of Even and Odd Number in Array
public class EvenOrOdd {
    public static void main(String[] args) {
        int odd=0,even=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The limit :");
        int n = scan.nextInt();
        //Declare the array
        int a[]=new int[n];

        //Get The Values

        for (int i=0;i<a.length;i++){
            System.out.println("Enter Value "+(i+1)+" :");
            a[i]=scan.nextInt();
        }
        for(int val:a){
            if(val%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("The Count of Even Numbers In Array Is : "+even);
        System.out.println("The Count of Odd Numbers In Array Is : "+odd);
    }
}
