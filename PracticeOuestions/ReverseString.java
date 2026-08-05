package PracticeOuestions;

public class ReverseString {
    public static void main(String[] args) {
        String a ="Ranjith";
        StringBuilder sb = new StringBuilder(a);
        
        //Program to reverse a given string
        StringBuilder b = new StringBuilder("Ranjith Kumar C");
        System.out.println(a);
        StringBuilder c=new StringBuilder();
        for(int i=b.length()-1;i>=0;i--)
        {
            c.append(b.charAt(i));
        }
        System.out.println(c);

    }

}
