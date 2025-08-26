package fifth_class.Encapsulation;

import fifth_class.person;
import fifth_class.schoolStudent;

public class main {
    public static void main(String[] args) {
//        Student s1 = new Student("10", 45, "PRC");
//        String marks = s1.getMarks();
//        System.out.println(marks);
//        s1.setMarks("100");
//        marks = s1.getMarks();
//        System.out.println(marks);
//        System.out.println(s1.name);
//        System.out.println(s1.roll_no);
//        System.out.println(s1.marks); cannot do this can only access them by getters and setters


        schoolStudent s2 = new schoolStudent("FALANA", "DHIMKANA");
        s2.getCourse();
        s2.getAddress();



    }
}
