package eighth_class;

public class UserDefinedException {
    public static void validate(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Ineligible to Vote kiddo");
        }
        else{
            System.out.println("You are eligible to vote sir");
        }
    }
}
