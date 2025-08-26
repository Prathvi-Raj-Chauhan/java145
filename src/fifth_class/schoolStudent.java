package fifth_class;

public class schoolStudent extends person{
    public String course;

    public schoolStudent(String address, String course){
        super(address);
        this.course = course;
    }
    public void getCourse(){
        System.out.println("His course is " + course);
    }
}
