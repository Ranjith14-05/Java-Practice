import java.util.Arrays;
import java.util.Scanner;

class Methods {

    //Non Return Type Functions
    public void add(){
        int a=2;
        int b=2;
        System.out.println("Addition : " + (a+b));
    }

    public void sub(int a,int b ){
        System.out.println("Subcration : "+(a-b));
    }

    // Return Type Functions

    public int mul(int a,int b){
        return a*b;
    }

    public float div(int a,int b){
        return a/b;
    }

    // Return Array Using a Function 

    public char[] arr(String a){
        return a.toCharArray();
    }

    public int [] arr2 (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Limit : ");
        int a = scan.nextInt();
        int[] arr = new int[a];
        for(int i =1 ;i<=a;i++){
            System.out.println("Enter The Value "+i+ " : ");
            int b = scan.nextInt();
            arr[i-1]=b;
        }
        Arrays.sort(arr);
        scan.close();
        return arr;
    }
    
    // Static Method in Java
    //Static method can be used without object

    public static int power(int base,int power){
        int res =1;
        for (int i =1;i<=power;i++){
            res=res*base;
        }
        return res;
    }
}

public class Functions {
    public static void main(String[] args) {
        Methods o1 = new Methods();
        o1.add();
        o1.sub(4,2);

        System.out.println("Multiplication : "+o1.mul(2,10));
        System.out.println("Division : " + o1.div(10,2));

        String x = "Ranjith";
        char [] y = o1.arr(x);
        System.out.println(Arrays.toString(y));
        int [] arr = o1.arr2();
        System.out.println(Arrays.toString(arr));
        System.out.println("Static Method For Power : " +Methods.power(2, 3));

    }
}
