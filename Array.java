import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // Declaring The Array

        int a[]={10,20,30,40};

        // Declaring Array Memory
        int b []=new int[10];

        //Accessing the Array Element 

        System.out.println(a[1]);

        // Accessing the Whole Array With For Loop

        for (int i =0;i<b.length;i++){
            System.out.println(b[i]);
        }

        // Accesing the Whole Array with Enhancced For Loop

        for (int val:a){
            System.out.println(val);
        }

        //Printing Array Using Inbuilt Function
        //! Must Import Arrays class using java.util
        System.out.println(Arrays.toString(a));
    }
}
