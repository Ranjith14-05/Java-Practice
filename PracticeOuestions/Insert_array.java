package PracticeOuestions;

import java.util.Arrays;

public class Insert_array {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Before Insert : "+Arrays.toString(a));
        int index=2;
        int value = 25;

        for(int i =a.length-1;i>index;i--){
            a[i]=a[i-1];
        }
        a[index]=value;
        System.out.println("After Insert : "+Arrays.toString(a));
    }
}
