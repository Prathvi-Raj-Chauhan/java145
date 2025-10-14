package UNIT1.first_class;

public class employees{
    public int id; // instance of class (object banaenge tab hi memory allocate hogi)
    public String name;

    public employees() { // default constructor

    }

    public void display(){
        System.out.println("Name " + name + " id " + id);
    }
    public employees(int id, String name){
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        employees e1 = new employees();
        System.out.println(e1.id);

        e1.id = 15;
        System.out.println(e1.id);
        e1.name = "NAAM";
        System.out.println(e1.name);

        employees e2 = new employees(15, "asdflkasf");
        System.out.println(e2.name);
        System.out.println(e2.id);

    }
}

