package src;

public class UserDefinedException extends Exception {
    public void validate(int age) throws InvalidException
    {
        if(age<18){
            throw new InvalidException("Not Eligible to vote");
        }
        else{
            System.out.println("Eligible to vote");
        }
    }
}
