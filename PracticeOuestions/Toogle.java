package PracticeOuestions;

public class Toogle {
    public static void main(String[] args) {
        String str = "Ranjith Kumar";
        
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {

            char ch = sb.charAt(i);

            // Lowercase to Uppercase
            if (ch >= 'a' && ch <= 'z') {
                sb.setCharAt(i, (char)(ch - 32));
            }

            // Uppercase to Lowercase
            else if (ch >= 'A' && ch <= 'Z') {
                sb.setCharAt(i, (char)(ch + 32));
            }
        }

        System.out.println("Result: " + sb);

    }
}
