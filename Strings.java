import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String a = "Ranjith Kumar";
        String b = "ranjith Kumar";

        System.out.println("A : "+a);
        System.out.println("B : "+b);

        System.out.println("A Hashcode : "+ a.hashCode());
        System.out.println("B Hashcode : "+ b.hashCode());

        System.out.println("Equals : "+ a.equals(b));
        System.out.println("Equals Ignore Case"+a.equalsIgnoreCase(b));
        System.out.println("Length : "+a.length());
        System.out.println("CharAt : "+a.charAt(0));
        System.out.println("Upper Case : "+a.toUpperCase());
        System.out.println("Lower Case : "+a.toLowerCase());
        System.out.println("Replace : "+ a.replace("Kumar", "C"));
        System.out.println("Contains : "+a.contains("Ranjith"));
        System.out.println("Empty : "+a.isEmpty());
        System.out.println("Endswith : "+a.endsWith("r"));
        System.out.println("Startswith : "+a.startsWith("R"));
        System.out.println("Substring : "+a.substring(8));
        System.out.println("Substring : "+a.substring(0,7));
        char[] array = a.toCharArray();
        System.out.println(Arrays.toString(array));

        String c = " Ranjith ";
        System.out.println("C : "+c);
        System.out.println("Length Of C befor Trim : "+c.length());
        System.out.println("Length Of C after Trim : "+c.trim().length());
        

    }

}
