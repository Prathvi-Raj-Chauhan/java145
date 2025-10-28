package UNIT2.class5;

public class Myswitch {
    public static void main(String[] args) {
        String day = "Wednesday";
        String category = getDayCategory(day);
        System.out.println(day + " is a " + category);
        String text1 = "G F G";
        String text2 = """
                           G F G
                       """;
        System.out.println(text1);
        System.out.println(text2);


        prashant prashant = new prashant();
        prashant.printName();
        prc prc = new prc();
        prc.printName();
    }
    public static String getDayCategory(String day){
        return switch (day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
            case "Saturday", "Sunday" -> "Weekend";
            default -> "Unknown"; // return value through arrow operator
        };
    }
}
