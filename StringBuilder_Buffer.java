public class StringBuilder_Buffer {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Ranjith");
        System.out.println(buffer);
        buffer.append(" Kumar");
        System.out.println(buffer);
        buffer.insert(13," C");
        System.out.println(buffer);
        buffer.replace(6, 9, "@@@");
        System.out.println(buffer);
        buffer.delete(6, 13);
        System.out.println(buffer);
        buffer.reverse();
        System.out.println(buffer);
        System.out.println(buffer.charAt(2));
        System.out.println(buffer.length());
        System.out.println(buffer.substring(0,5));




        StringBuffer sb = new StringBuffer("");
        System.out.println(sb.capacity());
        sb.append("Ranjith");
        System.out.println(sb);
        System.out.println(sb.capacity());

        sb.append("I am going to be a java Developer One day ");
        System.out.println(sb.capacity()); // Capacity is Calculated like (oldcapacity *2)+2 --> (16*2)+2 = 34


    }
}
