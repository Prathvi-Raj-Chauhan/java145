package sixth_class;

import java.lang.reflect.Array;

public class Calculator {

    public static class CalC{
         double ar;

        public void Area(double length, double breadth){
            ar = length*breadth;
            System.out.println("Area of rectangle -> " + ar);
        }
        public void Area(double rad){
            ar = Math.PI*rad*rad;
            System.out.println("Area circle is -> " + ar);
        }
        public void Area(double l, double b, double h){
            ar = 2*(l*b + b*h + h*l);
            System.out.println("Area of cuboid is -> " + ar);
        }
    }


    public static void main(String[] args) {

        CalC cla = new CalC();
        cla.Area(2,5);
        cla.Area(5);
        cla.Area(2,4,6);
    }

}
