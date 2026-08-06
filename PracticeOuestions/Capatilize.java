package PracticeOuestions;

public class Capatilize {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("ranith kumar");

        if (sb.charAt(0) >= 'a' && sb.charAt(0) <= 'z') {
            sb.setCharAt(0, (char)(sb.charAt(0) - 32));
        }

        // Capitalize every letter after a space
        for (int i = 1; i < sb.length(); i++) {

            if (sb.charAt(i - 1) == ' ' &&
                sb.charAt(i) >= 'a' &&
                sb.charAt(i) <= 'z') {

                sb.setCharAt(i, (char)(sb.charAt(i) - 32));
            }
        }

        System.out.println("Result: " + sb);

    }
}
