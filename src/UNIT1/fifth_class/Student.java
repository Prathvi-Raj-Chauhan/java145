package UNIT1.fifth_class;

abstract class Student {
    String name;
    int roll_no;

    public Student(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }
    abstract void attend_class(); // abstract methods does not have bodies
    abstract void give_exam();
}
