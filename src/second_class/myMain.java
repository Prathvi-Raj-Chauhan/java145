package second_class;

public class myMain {
    public static void main(String[] args) {
        Student one = new Student();
        one.display();
        one.name = "CHAMPAK";
        one.roll_no = 9;

        Student two = new Student("BABITA JI ");
        two.roll_no = 40;
        Student three = new Student("JETHA LAL", 69);
        Student four = new Student(three);
        one.display();
        two.display();
        three.display();
        four.display();
    }
}
