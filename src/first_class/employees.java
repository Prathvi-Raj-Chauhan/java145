package first_class;

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
}

