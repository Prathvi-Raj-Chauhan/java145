package second_class;

public class myMain {
    public static void main(String[] args) {
        Student one = new Student();
        one.display();
        one.name = "ABHI";
        one.roll_no = 9;

        Student two = new Student("PRASHANT ");
        two.roll_no = 40;
        Student three = new Student("TIWARI ", 69);
        Student four = new Student(three);
        one.display();
        two.display();
        three.display();
        four.display();
    }
}
