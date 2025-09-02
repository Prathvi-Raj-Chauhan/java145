package UNIT1.second_class;

class Student {
    int roll_no;
    String name;

    void display(){
        System.out.println("Name :- " + this.name + " " + "Roll No. :- " + this.roll_no);
    }
    Student(){

    }
    Student(String name){
        this.name = name;
    }
    Student(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }
    Student(Student stud){
        this.roll_no = stud.roll_no;
        this.name = stud.name;
    }
}


