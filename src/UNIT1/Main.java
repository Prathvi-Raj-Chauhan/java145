package UNIT1;

import UNIT1.first_class.employees;

public class Main {
    public static void main(String[] args) {
        employees one = new employees();
        one.display();
        one.name = "abhishek";
        one.id = 2;
        one.display();
        employees two = new employees(1, "PRC");
        two.display();
    }
}