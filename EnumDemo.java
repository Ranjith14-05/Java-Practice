//Enum in Java is a special type used to define a fixed set of constants. It improves type safety and makes code more readable. For example, we can use an enum for days, months, directions, or status values.


public class EnumDemo {
    enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
    public static void main(String[] args) {

        Day today = Day.MONDAY;

        System.out.println(today);

        // for loop to get all enum values
        for (Day day : Day.values()) {

            System.out.println("Day: " + day);
        }

    // Using Switch
    switch (today) {

                case MONDAY:
                    System.out.println("Start of the week");
                    break;

                case FRIDAY:
                    System.out.println("Almost weekend!");
                    break;

                case SATURDAY:
                case SUNDAY:
                    System.out.println("Weekend");
                    break;

                default:
                    System.out.println("Normal working day");
            }

}
}
