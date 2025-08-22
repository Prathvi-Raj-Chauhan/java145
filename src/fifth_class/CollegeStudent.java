package fifth_class;

public class CollegeStudent extends Student { // after inheriting an abstract class having abstract methods either make this non-abstract also as abstract or provide the implementation of those abstract methods

    public CollegeStudent(String name, int roll_no){
        super(name, roll_no); // cuz parameters will be same and we want same method as parent's one so we used the same construtor as the parent's by super()
    }
    public void attend_class(){
        System.out.println(name + " Attended the class on smart board");
    }
    public void give_exam(){
        System.out.println(name + " Gave exam in online mode");

    }
}
