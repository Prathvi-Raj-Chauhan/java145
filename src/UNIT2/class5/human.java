package UNIT2.class5;

sealed public class human permits prashant, prc { // its child should also be sealed or final or non-sealedclass else there will be no meaning of making sealed claseses
    public void printName(){
        System.out.println("I am in sealed class");
    }


}
