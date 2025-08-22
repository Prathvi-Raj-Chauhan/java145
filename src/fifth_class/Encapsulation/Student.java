package fifth_class.Encapsulation;

public class Student {
    private String marks ;
    public int roll_no;
    public String name;

    public Student(String marks, int roll_no, String name) {
        this.marks = marks;
        this.roll_no = roll_no;
        this.name = name;
    }

    public String getMarks() { //getter
        return marks;
    }

    public void setMarks(String marks) { //setter
        this.marks = marks;
    }
}
