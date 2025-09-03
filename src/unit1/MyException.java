package src.unit1;

public class MyException {
    public static void main(String[] args){
        UserDefinedException uf= new UserDefinedException();
        try{
            uf.validate(17);
        }
        catch(InvalidException e){
            System.out.println(e.getMessage());
        }
    }
}
